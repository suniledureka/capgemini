package com.capgemini.boot.cms.services.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.capgemini.boot.cms.entities.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;
import com.capgemini.boot.cms.services.IContactServices;

@Service
public class ContactServices implements IContactServices {
	private ContactRepository contactRepo;
	
	public ContactServices(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}

	@Override
	public void getContactsInPages() {
		/*
		Page<Contact> contactPage = contactRepo.findAll(Pageable.ofSize(4));
		List<Contact> contacts = contactPage.getContent();
		contacts.forEach(ct -> System.out.println(ct));
		*/
		
		/*
		//int pageNo = 0;
		int pageNo = 1;
		int pageSize = 5;
		
		PageRequest pageReq = PageRequest.of(pageNo, pageSize);
		Page<Contact> contactPage = contactRepo.findAll(pageReq);
		List<Contact> contacts = contactPage.getContent();
		contacts.forEach(ct -> System.out.println(ct));
		*/
		
		int pageSize = 5;
		long noOfContacts = contactRepo.count();
		long noOfPages = noOfContacts / pageSize;
		if(noOfContacts %  pageSize > 0) {
			noOfPages++;
		}
		
		for(int i=0; i < noOfPages; i++) {
			PageRequest pageReq = PageRequest.of(i, pageSize);
			Page<Contact> contactPage = contactRepo.findAll(pageReq);
			List<Contact> contacts = contactPage.getContent();
			
			System.out.println(String.format("------------ Page %d / %d ----------", (i+1), noOfPages));
			contacts.forEach(ct -> System.out.println(ct));
			System.out.println();
		}
	}

}
