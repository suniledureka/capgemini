package com.capgemini.boot.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.boot.cms.entites.Contact;
import com.capgemini.boot.cms.services.IContactServices;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private IContactServices contactService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Contact> contactsInAsc = contactService.getContactsInOrder();
		contactsInAsc.stream().forEach(System.out::println);
		System.out.println("=".repeat(100) + "\n");
	}

}
