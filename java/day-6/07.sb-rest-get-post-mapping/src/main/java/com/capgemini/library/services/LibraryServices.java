package com.capgemini.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library.dto.Book;
import com.capgemini.library.repository.LibraryRepository;

@Service
public class LibraryServices {
	List<Book> books = null;
	
	private LibraryRepository libraryRepo;
	
	public LibraryServices(LibraryRepository libraryRepo) {
		super();
		this.libraryRepo = libraryRepo;
		books = libraryRepo.getAllBooks();
	}

	
	
	public List<Book> getAllBooks() {
		return books;
	}

	public Book findBookByIsbn(Integer isbn) {
		Book searchedBook = books.stream()
								 .filter(book -> book.getBookId().equals(isbn))
								 .findFirst()
								 .orElse(null);
		return searchedBook;
	}
	
	public boolean saveNewBook(Book bk) {
		for(Book book : books) {
			if(book.getBookId().equals(bk.getBookId())) {
				return false;
			}
		}
		books.add(bk);
		return true;		
	}
}
