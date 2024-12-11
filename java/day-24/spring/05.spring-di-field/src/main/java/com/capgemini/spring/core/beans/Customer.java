package com.capgemini.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String customerName;
	
	@Autowired
	@Qualifier("audi")
	private Car car;
	
	public String getCustomerName() {
		return customerName;
	}

	public Car getCar() {
		return car;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


}
