package com.capgemini.library.models;

public class Book {
	private int isbnNo;
	private String bookName;
	private String author;

	public Book() {
		super();
	}

	public Book(int isbnNo, String bookName, String author) {
		super();
		this.isbnNo = isbnNo;
		this.bookName = bookName;
		this.author = author;
	}

	public int getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		String book = String.format("%-6d  %-25s  %s", this.isbnNo, this.bookName, this.author);
		return book;
	}
}
