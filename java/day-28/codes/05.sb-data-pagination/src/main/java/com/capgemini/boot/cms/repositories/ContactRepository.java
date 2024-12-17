package com.capgemini.boot.cms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.boot.cms.entites.Contact;

@Repository //optional
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
