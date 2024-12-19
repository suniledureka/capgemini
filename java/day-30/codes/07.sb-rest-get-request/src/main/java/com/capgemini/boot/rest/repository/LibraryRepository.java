package com.capgemini.boot.rest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.boot.rest.dto.Book;

@Repository
public class LibraryRepository {
	public List<Book> getBooks(){
		List<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book(100123, "Java Reference", 575.50f);
		Book book2 = new Book(100124, "Python Reference", 750f);
		Book book3 = new Book(100125, "Microservices Reference", 875.50f);
		Book book4 = new Book(100126, "Spring with Spring Boot Reference", 1275.50f);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);		
		return books;
	}
}
