package com.capgemini.boot.rest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(path = "/search/{isbn}",
				produces = {"application/json", "application/xml"})
	public ResponseEntity<Book> getBookDetails(@PathVariable("isbn") Integer bid){
		Book book = libService.searchBookById(bid);
		
		if(book != null)		
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping(path = "/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = libService.getAllBooks();
		return ResponseEntity.ok(books);
	}

	
	@PostMapping(path = "/book",
			    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> saveNewBook(@RequestBody Book book){
		boolean addStatus = libService.saveBook(book);
		
		if(addStatus)
			return new ResponseEntity<String>("book added to library stock", HttpStatus.CREATED);
		return ResponseEntity.badRequest().build();
	}
}
