package com.capgemini.boot.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.boot.cms.entities.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	//@Autowired
	private ContactRepository contactRepo;
	/*
	public Application(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}
	*/
	
	@Autowired
	public void setContactRepo(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}
	
	public static void main(String[] args) {
		System.out.println("spring container initialization started");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("spring container initialized");

		context.close();
	}



	private static void printContacts(Iterable<Contact> contactsIterable) {
		for(Contact contact : contactsIterable) {
			System.out.println(contact);
		}
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run() method");
		//--- save a contact ---
		Contact ct = new Contact();
		ct.setContactId(101);
		ct.setContactName("Praveen");
		ct.setContactNumber("9848586878");
		
		contactRepo.save(ct);
		
		//-- save multiple contacts
		List<Contact> contacts = Arrays.asList(
					new Contact(102, "Valerie", "7418529632"),
					new Contact(103, "Jeffery", "8418529632"),
					new Contact(104, "Chris", "9418529632"),
					new Contact(105, "Manoj", "6418529632")
				);
		
		contactRepo.saveAll(contacts);
		
		//-- to get the number of contacts
		long noOfContacts = contactRepo.count();
		System.out.println("no of contacts = " + noOfContacts);
		
		//-- check whether a contact is existing with a contactId or not
		boolean isExists = contactRepo.existsById(1015);
		if(isExists)
			System.out.println("Contact Exists");
		else
			System.out.println("Contact with contactId: 1015 does not exists");
		
		//-- get a Contact based on contactId
		int contactId = 101;
		
		Optional<Contact> optContact = contactRepo.findById(contactId);
		if(optContact.isPresent()) {
			Contact cont = optContact.get();
			System.out.println(cont);
		}else {
			System.err.println("No contact found for contact ID: " + contactId);
		}
		
		//- get Contacts based on multiple contactIds
		Iterable<Contact> contactsIterable = contactRepo.findAllById(Arrays.asList(101,102,307,104));
		printContacts(contactsIterable);
		
		contactsIterable = contactRepo.findAll();
		printContacts(contactsIterable);		
		
	}

}
