package com.capgemini.boot.cms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.boot.cms.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
