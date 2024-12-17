package com.capgemini.boot.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.capgemini.boot.cms.entites.Contact;
import com.capgemini.boot.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private ContactRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Page<Contact> page = repo.findAll(Pageable.ofSize(4));
		List<Contact> contacts = page.getContent();
		contacts.stream().forEach(System.out::println);
		*/
		
		/*
		//int pageNo = 0;
		int pageNo=1;
		int pageSize = 80;
		
		PageRequest pageReq = PageRequest.of(pageNo, pageSize);
		Page<Contact> page = repo.findAll(pageReq);
		List<Contact> contacts = page.getContent();
		contacts.stream().forEach(System.out::println);		
		*/
		
		int pageSize = 4;
		long noOfPages = repo.count() / pageSize;
		if(repo.count() % pageSize > 0) {
			noOfPages++;
		}
		
		for(int i=0 ; i<noOfPages; i++) {
			System.out.println("--------------- Page " + (i+1) + " / " + noOfPages + " ---------------" );
			PageRequest pageReq = PageRequest.of(i, pageSize);
			Page<Contact> page = repo.findAll(pageReq);
			List<Contact> contacts = page.getContent();
			contacts.stream().forEach(System.out::println);	
			
			System.out.println();
		}
	}

}
