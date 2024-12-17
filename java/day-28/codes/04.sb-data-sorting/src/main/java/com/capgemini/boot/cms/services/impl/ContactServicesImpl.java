package com.capgemini.boot.cms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.boot.cms.entites.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;
import com.capgemini.boot.cms.services.IContactServices;

@Service
public class ContactServicesImpl implements IContactServices {
	private ContactRepository contactRepo;
	
	//-- constructor injection
	@Autowired //optional as there is only one constructor in this class
	public ContactServicesImpl(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}

	@Override
	public List<Contact> getContactsInOrder() {
		//-- approach -1 -- using findBy orderBy 
		//List<Contact> contacts = contactRepo.findByOrderByContactName();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameAsc();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameDesc();
		
		//-- approach -2 -- findAll(Sort)
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName"));
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName", "contactNumber"));
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").ascending());
		List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").descending());
		return contacts;
	}

}
