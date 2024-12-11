package com.capgemini.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		//initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-beans.xml");
		
		Customer cust = (Customer)context.getBean("sanjay");
		System.out.println(cust.getCustomerName() + ", owns a " + cust.getCar().getModel()+" , costs Rs. " + cust.getCar().getCost());
		
		((ConfigurableApplicationContext)context).close();
	}

}
