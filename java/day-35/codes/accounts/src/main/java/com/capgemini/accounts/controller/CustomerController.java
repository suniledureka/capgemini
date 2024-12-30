package com.capgemini.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accounts.dto.CustomerDetailsDto;
import com.capgemini.accounts.service.ICustomerService;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@Validated
@AllArgsConstructor
public class CustomerController {
	
	private ICustomerService customerService;
	
    @GetMapping("/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(@RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber){
        CustomerDetailsDto customer = customerService.fetchCustomerDetails(mobileNumber);
    	
        return ResponseEntity.status(HttpStatus.OK).body(customer);

    }

}
