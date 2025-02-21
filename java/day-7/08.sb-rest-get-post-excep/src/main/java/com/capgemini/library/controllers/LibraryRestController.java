package com.capgemini.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.library.dto.Book;
import com.capgemini.library.except.BookNotFoundException;
import com.capgemini.library.services.LibraryServices;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/library")
@Tag(name = "LibraryRestController", description = "Add New Book to Library, Search for a Book, List all Books")
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
			throw new BookNotFoundException("No book with id: " + isbn + " present in library");
	}
	
	@PostMapping(path = "/save",
				consumes = {"application/json", "application/xml"})
	public ResponseEntity<?> saveBook(@Valid @RequestBody Book book){
		boolean bookAddStatus = libService.saveNewBook(book);
		
		if(bookAddStatus) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		else {
			return ResponseEntity.badRequest().build();
		}
	}
}
