package com.capgemini.boot.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.boot.rest.dto.Book;
import com.capgemini.boot.rest.repository.LibraryRepository;

@Service
public class LibraryServicesImpl implements LibraryServices {
	private LibraryRepository libRepo;
	private List<Book> books = null;
	
	//constructor injection
	public LibraryServicesImpl(LibraryRepository libRepo) {
		super();
		this.libRepo = libRepo;
		books = libRepo.getAllBooks();
	}

	@Override
	public List<Book> getAllBooks() {		
		return books;
	}

	@Override
	public Book searchBookById(Integer bid) {
		Book book = books.stream().filter(bk -> bk.getBookId().equals(bid)).findFirst().orElse(null);
		return book;
	}

	@Override
	public boolean saveBook(Book book) {
		Book bok = books.stream().filter(bk -> bk.getBookId().equals(book.getBookId())).findAny().orElse(null);
		
		if(bok == null) {
			books.add(book);
			return true;
		}
		return false;
	}

}
