package com.capgemini.boot.cms;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.boot.cms.entites.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private ContactRepository contactRepo;
	
	public static void main(String[] args) {
		System.out.println("starting main method");
		SpringApplication.run(Application.class, args);		
		System.out.println("spring container initialized");
	}

	@Override
	public void run(String... args) throws Exception {
		Contact ct = null;
		System.out.println("inside run()");
		
		Optional<Contact> optContact = contactRepo.findByContactName("Pankaj");
		if(optContact.isPresent()) {
			ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no matching contact with specified name");
		}
		System.out.println("=".repeat(100) + "\n");
		
		ct = contactRepo.findByContactNumber("8529631230");
		System.out.println(ct);
		System.out.println("=".repeat(100) + "\n");
		
		optContact = contactRepo.findByContactNameAndContactNumber("Sanjay", "9848586878");
		if(optContact.isPresent()) {
			ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no matching contact with specified name");
		}
		
		System.out.println("=".repeat(100) + "\n");
		List<Contact> listContacts = contactRepo.findByContactNameOrContactNumber("Sanjay", "7878454514");
		listContacts.stream().forEach(System.out::println);		
		System.out.println("=".repeat(100) + "\n");
		
		List<String> contactNames = contactRepo.findContactNames();
		contactNames.stream().forEach(cont -> System.out.println(cont));
		System.out.println("=".repeat(100) + "\n");
		
		optContact = contactRepo.findContactByContactName("Sanjay");
		if(optContact.isPresent()) {
			ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no matching contact with specified name");
		}
		System.out.println("=".repeat(100) + "\n");
		
		listContacts = contactRepo.findContactsWhereNamesWith("S");
		listContacts.stream().forEach(System.out::println);		
	}

}
