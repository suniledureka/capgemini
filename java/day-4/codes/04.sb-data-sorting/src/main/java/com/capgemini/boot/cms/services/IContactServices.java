package com.capgemini.boot.cms.services;

import java.util.List;

import com.capgemini.boot.cms.entities.Contact;

public interface IContactServices {
	public List<Contact> getContactsInOrder();
}
