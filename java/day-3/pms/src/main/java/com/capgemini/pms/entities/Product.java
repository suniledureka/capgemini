package com.capgemini.pms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Float productPrice;

	@Override
	public String toString() {
		return String.format("%-5d | %-15s | %.2f", productId, productName, productPrice);
	}

}
