package com.capgemini.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library.dto.Book;
import com.capgemini.library.repository.LibraryRepository;

@Service
public class LibraryServices {
	@Autowired
	private LibraryRepository libraryRepo;

	public List<Book> getAllBooks() {
		return libraryRepo.getAllBooks();
	}

	public Book findBookByIsbn(Integer isbn) {
		List<Book> books = libraryRepo.getAllBooks();

		Book searchedBook = books.stream()
								 .filter(book -> book.getBookId().equals(isbn))
								 .findFirst()
								 .orElse(null);
		return searchedBook;
	}
}
