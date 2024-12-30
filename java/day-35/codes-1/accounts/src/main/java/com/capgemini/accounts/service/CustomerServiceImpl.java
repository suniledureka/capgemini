package com.capgemini.accounts.service;

import org.springframework.stereotype.Service;

import com.capgemini.accounts.clients.CardsFeignClient;
import com.capgemini.accounts.clients.LoansFeignClient;
import com.capgemini.accounts.dto.AccountsDto;
import com.capgemini.accounts.dto.CardsDto;
import com.capgemini.accounts.dto.CustomerDetailsDto;
import com.capgemini.accounts.dto.LoansDto;
import com.capgemini.accounts.entity.Accounts;
import com.capgemini.accounts.entity.Customer;
import com.capgemini.accounts.exception.ResourceNotFoundException;
import com.capgemini.accounts.mapper.AccountsMapper;
import com.capgemini.accounts.mapper.CustomerMapper;
import com.capgemini.accounts.repository.AccountsRepository;
import com.capgemini.accounts.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {
	private AccountsRepository accountsRepository;
	private CustomerRepository customerRepository;
	
	private LoansFeignClient loansClient;
	private CardsFeignClient cardsClient;
	
	@Override
	public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
		Customer customer = customerRepository.findByMobileNumber(mobileNumber)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));
		
		Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
				() -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString()));
		
		CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
		AccountsDto accountsDto = AccountsMapper.mapToAccountsDto(accounts, new AccountsDto());
		
		customerDetailsDto.setAccountsDto(accountsDto);
		
		LoansDto loansDto = loansClient.fetchLoanDetails(mobileNumber).getBody();
		
		CardsDto cardsDto = cardsClient.fetchCardDetails(mobileNumber).getBody();
		
		customerDetailsDto.setCardsDto(cardsDto);
		customerDetailsDto.setLoansDto(loansDto);
		
		return customerDetailsDto;
	}

}
