package com.capgemini.library.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Book {
	@NotNull(message = "bookId required")
	private Integer bookId;
	
	//@NotNull(message = "bookTitle required")
	//@NotEmpty(message = "bookTitle required")
	@NotBlank(message = "bookTitle required, a non-empty string")
	@Size(min = 3, max = 100)
	private String bookTitle;
	
	@NotNull(message = "bookPrice required")
	@Min(value = 100, message = "bookPrice should not be < 100")
	@Max(value = 999)
	private Float bookPrice;
}
