package com.capgemini.spring.core;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("=".repeat(100));
		
		((ConfigurableApplicationContext)context).close();
	}

}
