package com.capgemini.boot;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.capgemini.boot.beans.DBConnection;
import com.capgemini.boot.beans.Ticket;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		Ticket ticket = context.getBean(Ticket.class);
		System.out.println(ticket);
		
		
		DBConnection dbCon = context.getBean(DBConnection.class);
		System.out.println(dbCon);
		
		//System.getProperties().list(System.out);
		
	}

}
