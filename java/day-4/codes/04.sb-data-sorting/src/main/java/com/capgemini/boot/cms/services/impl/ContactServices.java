package com.capgemini.boot.cms.services.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
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
	public List<Contact> getContactsInOrder() {
		//----- appproach - 1 ------
		//List<Contact> contacts = contactRepo.findByOrderByContactName();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameAsc();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameDesc();
		
		//---- approach - 2 --------
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName"));
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName", "contactNumber"));
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").ascending());
		List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").descending());
		return contacts;
	}

}
