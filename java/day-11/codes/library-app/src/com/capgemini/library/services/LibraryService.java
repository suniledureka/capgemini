package com.capgemini.library.services;

import java.util.List;
import com.capgemini.library.models.Book;

public interface LibraryService {
	void addBook(Book bobj);
	boolean isEmpty();
	List<Book> viewAllBooks();
	List<Book> viewBooksByAuthor(String author);
	int countNoOfBook(String bname);
}