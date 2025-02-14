package com.capgemini.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.capgemini.boot.beans.Car;
import com.capgemini.boot.utils.PasswordUtility;

@SpringBootApplication
//@ComponentScan(basePackages = "com.capgemini")
@ComponentScan(basePackages = {"com.capgemini.boot", "com.capgemini.fsbu"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		int noOfbeans = context.getBeanDefinitionCount();
		System.out.println("no of beans = " + noOfbeans);
		System.out.println();
		
		//Car car = (Car) context.getBean("car");
		//Car car = (Car) context.getBean("mycar");
		//Car car = context.getBean("mycar", Car.class);
		Car car = context.getBean(Car.class);
		
		car.startJourney();
		System.out.println();
		
		//PasswordUtility pwdUtilRef = (PasswordUtility) context.getBean("getPassswordUtility");
		PasswordUtility pwdUtilRef = context.getBean(PasswordUtility.class);
		
		String password = "mypassword123";
		String encodedPass = pwdUtilRef.encodePassword(password);
		System.out.println("encoded password = " + encodedPass);
		
		context.close();
	}
}
