package com.capgemini.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library.dto.Book;
import com.capgemini.library.repository.LibraryRepository;

@Service
public class LibraryServices {
	List<Book> book = null;
	
	private LibraryRepository libraryRepo;
	
	public LibraryServices(LibraryRepository libraryRepo) {
		super();
		this.libraryRepo = libraryRepo;
		book = libraryRepo.getAllBooks();
	}

	
	
	public List<Book> getAllBooks() {
		return book;
	}

	public Book findBookByIsbn(Integer isbn) {
		Book searchedBook = book.stream()
								 .filter(book -> book.getBookId().equals(isbn))
								 .findFirst()
								 .orElse(null);
		return searchedBook;
	}
	
	public boolean saveNewBook(Book bk) {
		for(Book book : book) {
			if(book.getBookId().equals(bk.getBookId())) {
				return false;
			}
		}
		book.add(bk);
		return true;		
	}
}
