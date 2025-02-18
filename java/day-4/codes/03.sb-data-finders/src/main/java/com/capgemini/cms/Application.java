package com.capgemini.cms;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.cms.entities.Contact;
import com.capgemini.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private ContactRepository contactRepo;
	
	public Application(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Optional<Contact> optContact = contactRepo.findByContactName("Safan");
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("No matching contacts found");
		}
		
		//-------------------------------------------------
		List<Contact> contacts = contactRepo.findAllByContactName("Manoj");
		contacts.stream().forEach(System.out::println);
		
		//-------------------------------------------------
		Contact ct = contactRepo.findByContactNameAndContactNumber("Safan","1234567890");
		System.out.println(ct);
		
		//-------------------------------------------------
		List<String> contactNames = contactRepo.findAllContactNames();
		contactNames.forEach(cname -> System.out.println(cname));
		
		//-------------------------------------------------
		optContact = contactRepo.findContactByContactName("Safan");
		if(optContact.isPresent()) {
			ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("No matching contacts found");
		}
		
		//-------------------------------------------------
		contacts = contactRepo.findContactsWhereNamesWith("M");
		contacts.forEach(System.out::println);
	}
}
