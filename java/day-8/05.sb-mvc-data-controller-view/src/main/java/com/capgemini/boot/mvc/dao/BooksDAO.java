package com.capgemini.boot.mvc.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.boot.mvc.models.Book;

@Repository
public class BooksDAO {

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book(101, "Java Complete Reference", 750.5f));
		books.add(new Book(102, "Python Complete Reference", 975.75f));
		books.add(new Book(103, "React Made Easy", 750.5f));
		books.add(new Book(104, "Angular - A Complete Reference", 650.5f));
		books.add(new Book(105, "Spring Boot with Microservices", 450.5f));
		
		return books;
	}
}
