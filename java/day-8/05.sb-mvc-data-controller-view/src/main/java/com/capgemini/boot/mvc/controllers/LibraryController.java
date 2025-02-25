package com.capgemini.boot.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.boot.mvc.dao.BooksDAO;
import com.capgemini.boot.mvc.models.Book;

import lombok.AllArgsConstructor;

@Controller
public class LibraryController {
	private BooksDAO booksDAO;
	private List<Book> books;
	
	public LibraryController(BooksDAO booksDAO) {
		super();
		this.booksDAO = booksDAO;
		this.books = booksDAO.getAllBooks();
	}

	@GetMapping("library/{isbn}")
	public String findBookById(@PathVariable Integer isbn, Model model) {
		Book book = booksDAO.getAllBooks().stream().filter(bk -> bk.getBookId().equals(isbn))
																.findFirst()
																.orElse(null);
		
		model.addAttribute("book", book);
		
		return "bookDetails";
	}
	
	@GetMapping(path = "/library/all")
	public String findAllBooks(Model model) {	
		
		model.addAttribute("books", books);
		
		return "booksDetail";
	}
	
	@GetMapping("/library")
	public String deleteBookByIsbn(@RequestParam("isbn") Integer isbn, Model model) {
		for(int i=0; i<books.size(); i++) {
			Book bk = books.get(i);
			if(bk.getBookId().equals(isbn)) {
				books.remove(i);
			}
		}
		model.addAttribute("books", books);
		return "booksDetail";
	}
}
