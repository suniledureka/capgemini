package com.capgemini.spring.core;

import java.util.Arrays;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// -- initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("=".repeat(100));

		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("=".repeat(100));

		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println(" =========== BEAN NAMES =========");
		/*
		 * for(String beanName : beanNames) { 
		 	System.out.println("----> " + beanName); 
		   }
		 */

		Arrays.stream(beanNames).forEach(bn -> {
			System.out.println("---> " + bn);
		});
	}

}
