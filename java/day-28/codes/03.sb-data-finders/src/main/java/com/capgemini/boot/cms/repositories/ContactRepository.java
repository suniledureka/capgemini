package com.capgemini.boot.cms.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.boot.cms.entites.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	Optional<Contact> findByContactName(String cname);

	Contact findByContactNumber(String cnumber);

	Optional<Contact> findByContactNameAndContactNumber(String cname, String cnumber);

	List<Contact> findByContactNameOrContactNumber(String cname, String cnumber);
	
	//@Query("select contactName from com.capgemini.boot.cms.entites.Contact") //HQL
	@Query(value = "select contact_name from contact_master", nativeQuery = true)
	List<String> findContactNames();
	
	@Query("from com.capgemini.boot.cms.entites.Contact ct where contactName = :cname")
	//@Query("select ct from com.capgemini.boot.cms.entites.Contact ct where contactName = :cname")
	//@Query(value = "select * from contact_master where contact_name = :cname", nativeQuery = true)
	Optional<Contact> findContactByContactName(String cname);
	
	@Query("select ct from com.capgemini.boot.cms.entites.Contact ct where contactName LIKE :cnameLike%")
	List<Contact> findContactsWhereNamesWith(String cnameLike);
}
