package com.capgemini.cms.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cms.entities.Contact;
@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {
	Optional<Contact> findByContactName(String cname);

	List<Contact> findAllByContactName(String string);

	Contact findByContactNameAndContactNumber(String cname, String mobile);
	
	List<Contact> findByContactNameOrContactNumber(String cname, String cnumber);
	
	//@Query("select contactName from com.capgemini.cms.entities.Contact") //HQL
	@Query(value = "select contact_name from contact_master", nativeQuery = true) //SQL
	List<String> findAllContactNames();
	
	@Query("from com.capgemini.cms.entities.Contact ct where contactName = :cname")
	//@Query("select ct from com.capgemini.cms.entities.Contact ct where contactName = :cname")
	//@Query(value = "select * from contact_master where contact_name = :cname", nativeQuery = true)
	Optional<Contact> findContactByContactName(String cname);
	
	@Query("select ct from com.capgemini.cms.entities.Contact ct where contactName LIKE :cnameLike%")
	List<Contact> findContactsWhereNamesWith(String cnameLike);
}
