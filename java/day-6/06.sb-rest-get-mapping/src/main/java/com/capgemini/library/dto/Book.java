package com.capgemini.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	@JsonProperty("bid")
	@XmlElement(name = "isbn")	
	private Integer bookId;
	
	@JsonProperty("title")
	@XmlElement(name = "title")
	private String bookTitle;
	
	@XmlElement(name = "price")
	@JsonProperty(value = "price")
	private Float bookPrice;
}
