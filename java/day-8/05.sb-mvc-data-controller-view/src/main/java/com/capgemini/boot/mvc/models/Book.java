package com.capgemini.boot.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Book {
	private Integer bookId;
	private String bookTitle;
	private Float bookPrice;
}
