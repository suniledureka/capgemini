package com.capgemini.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.library.dto.Book;
import com.capgemini.library.repository.LibraryRepository;
import com.capgemini.library.services.LibraryServices;

@RestController
@RequestMapping("/library")
public class LibraryRestController {
	@Autowired
	private LibraryServices libService;
	
	@GetMapping("/all")
	public List<Book> showAllBooks(){
		return libService.getAllBooks();
	}
	
	
	//@GetMapping("/search/{isbn}")
	@GetMapping(path = "/search/{isbn}",
				produces = {"application/json", "application/xml"})
	public ResponseEntity<Book> searchBookById(@PathVariable Integer isbn){
		Book searchedBook = libService.findBookByIsbn(isbn);
		
		if(searchedBook != null)
			return ResponseEntity.ok().body(searchedBook);
		else
			return ResponseEntity.notFound().build();
	}
}
