package com.capgemini.library.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.library.models.Book;
import com.capgemini.library.services.LibraryService;
import com.capgemini.library.services.LibraryServiceImpl;

public class LibraryManagement {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		LibraryService libService = new LibraryServiceImpl();
		
		while(true) {
			System.out.println("1. Add Book");
			System.out.println("2. Display all Book Details");
			System.out.println("3. Search Book(s) by Author");
			System.out.println("4. Count Number of books - by book name");
			System.out.println("5. Exit");
			
			System.out.print("enter your choice: ");
			int myChoice = sc.nextInt();
			sc.nextLine();
			
			switch(myChoice) {
			 case 1:
				Book book = generateBook(); 
				libService.addBook(book);
				break;
			 case 2:
				 List<Book> books = libService.viewAllBooks();
				 printBooksInLibrary(books);
				break;	
			 case 3:
				 System.out.print("enter the Author Name: ");
				 String author = sc.nextLine();
				 List<Book> booksByAuthor = libService.viewBooksByAuthor(author);
				 if(booksByAuthor.isEmpty()) {
					 System.err.println("$$$-- No Books in Library of \""+ author + "\" ---$$$");
				 }else {
					 printBooksInLibrary(booksByAuthor);
				 }
				break;
			 case 4:
				 System.out.print("enter book title: ");
				 String title = sc.nextLine();
				 int countOfBooks = libService.countNoOfBook(title);
				 System.out.println("No of Books with Title: \""+ title + "\" = " + countOfBooks);
				break;	
			 case 5:
				System.out.println("application designed & developed by");
				System.out.println("team @ capgemini - 2024");
				sc.close();
				System.exit(0);
				break;	
			 default:{
				 System.err.println("Invalid Option .... Option can be 1-5 .... Try Again!!!");
			 }
			}//switch
			System.out.println("-".repeat(90)+"\n");
		}//while

	} //main

	private static void printBooksInLibrary(List<Book> books) {
		System.out.println("\n ======== CAPGEM | KNOWLEDGE CENTER ==========");
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book bk = it.next();
			System.out.println(bk);
		}
	}

	private static Book generateBook() {
		System.out.print("enter ISBN No: ");
		int isbn = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter book name: ");
		String bName = sc.nextLine();
		
		System.out.print("enter author name: ");
		String authorName = sc.nextLine();
		
		Book bk = new Book(isbn, bName, authorName);
		return bk;
	}//generateBook

}//class
