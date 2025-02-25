package com.capgemini.boot.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
}
