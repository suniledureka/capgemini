package com.capgemini.accounts.dto;

import com.capgemini.accounts.entity.Accounts;

import lombok.Data;

@Data
public class CustomerDetailsDto {
	 private String name;
	 private String email;
	 private String mobileNumber;
	 
	 private AccountsDto accountsDto;
	 
	 private CardsDto cardsDto;
	 
	 private LoansDto loansDto;

}
