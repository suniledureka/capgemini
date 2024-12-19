package com.capgemini.boot.rest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.boot.rest.dto.Book;
import com.capgemini.boot.rest.services.LibraryServices;

@RestController
@RequestMapping("/library")
public class LibraryRestController {
	private LibraryServices libService;
	
	//constructor injection
	public LibraryRestController(LibraryServices libService) {
		super();
		this.libService = libService;
	}

	@GetMapping(path = "/book",
				produces = {"application/json", "application/xml"})
	public ResponseEntity<Book> getBookDetails(){
		Book book = new Book();
		
		book.setBookId(10001);
		book.setBookTitle("Java Complete Reference");
		book.setBookPrice(750.50f);
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	@GetMapping(path = "/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = libService.getAllBooks();
		return ResponseEntity.ok(books);
	}

}
