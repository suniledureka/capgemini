package com.capgemini.spring.core;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("=".repeat(100));
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("-".repeat(100));
		
		System.out.println("===== BEAN NAMES =====");
		String[] beanNames = context.getBeanDefinitionNames();
		
		Arrays.stream(beanNames).forEach(bn -> System.out.println("--> " +bn));
		
		System.out.println("=".repeat(100)+"\n");
		
		User usr1 = (User)context.getBean("user1");
		System.out.println(usr1);
		
		User usr2 = (User)context.getBean("user1");
		System.out.println(usr2);
		
		User usr3 = (User)context.getBean("user1");
		System.out.println(usr3);
		System.out.println(usr1.hashCode() + " - " + usr2.hashCode() + " - " + usr3.hashCode());
	}

}
