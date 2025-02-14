package com.capgemini.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.capgemini.boot.beans.DBConnection;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DBConnection dbCon = context.getBean(DBConnection.class);
		
		System.out.println(dbCon);
	}

}
