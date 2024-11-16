package com.capgemini.library.services;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.library.models.Book;

public class LibraryServiceImpl implements LibraryService {
	List<Book> books; 
	
	public LibraryServiceImpl() {
		books = new ArrayList<Book>();
	}

	@Override
	public void addBook(Book bobj) {
		//logic to check whether a book with the same isbnNo in List
		books.add(bobj);
		System.out.println("###--- Book added to Library ---###");
	}

	@Override
	public boolean isEmpty() {
		return books.isEmpty();
	}

	@Override
	public List<Book> viewAllBooks() {
		return books;
	}

	@Override
	public List<Book> viewBooksByAuthor(String author) {
		List<Book> booksWithAuthorName = new ArrayList<Book>();
		//-- checking each book for author name
		for(Book bk : books) {
			String authorName = bk.getAuthor();
			
			if(authorName.equalsIgnoreCase(author)) {
				booksWithAuthorName.add(bk);
			}
		}
		return booksWithAuthorName;
	}

	@Override
	public int countNoOfBook(String bname) {
		int bookCount = 0;
		
		for(Book bk : books) {
			String bkName = bk.getBookName();
			if(bkName.equalsIgnoreCase(bname)) {
				bookCount++;
			} //if
		} //for
		
		return bookCount;
	}

}
