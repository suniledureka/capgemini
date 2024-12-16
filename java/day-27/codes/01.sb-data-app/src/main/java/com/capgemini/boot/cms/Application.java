package com.capgemini.boot.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.boot.cms.entites.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		
		//----- to get the number of contacts -----
		long noOfContacts = contactRepo.count();
		System.out.println("no of contacts = " + noOfContacts);
		System.out.println("=".repeat(100) + "\n");
		
		//----- to check whether a contact is existing with a contactId or not
		int cid = 1015;
		boolean isContactExists = contactRepo.existsById(cid);
		if(isContactExists)
			System.out.println("contact existing with contact id: " + cid);
		else
			System.err.println("no matching contact found for contact id: " + cid);
		
		System.out.println("=".repeat(100) + "\n");
		
		//----- to get a Contact based on contactId( ID property value)
		Optional<Contact> optContact = contactRepo.findById(101);
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no matchig contact found!!!");
		}
		System.out.println("=".repeat(100) + "\n");
		
		//----- to get Contacts based on multiple contactIds -----
		List<Integer> contactIds = Arrays.asList(102,105, 103, 202, 101);
		Iterable<Contact> contacts = contactRepo.findAllById(contactIds);
		printContacts(contacts);
		System.out.println("=".repeat(100) + "\n");
		
		//-- ----- to get all contacts -----
		Iterable<Contact> allContacts = contactRepo.findAll();
		printContacts(allContacts);
		System.out.println("=".repeat(100) + "\n");
		
		cid = 115;
		contactRepo.deleteById(cid);
		System.out.println("=".repeat(100) + "\n");
		
		context.close();
	}

	private static void printContacts(Iterable<Contact> contacts) {
		contacts.forEach(ct -> {
			System.out.println(ct);		
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		});		
	}

}
