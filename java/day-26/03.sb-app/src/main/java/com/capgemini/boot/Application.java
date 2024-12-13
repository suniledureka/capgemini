package com.capgemini.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.boot.beans.DBConnection;
import com.capgemini.boot.beans.Ticket;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Ticket tkt = context.getBean(Ticket.class);		
		System.out.println(tkt);
		
		DBConnection dbCon = context.getBean(DBConnection.class);
		System.out.println(dbCon);
		
		context.close();
	}

}
