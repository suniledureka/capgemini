package com.capgemini.boot.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.boot.data.entity.Product;
import com.capgemini.boot.data.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {
	@Autowired
	private ProductRepository productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void setUp() {
		List<Product> products = Arrays.asList(
				  new Product(1001, "Laptop", 750005f),
				  new Product(1002, "Mobile", 35000f),
				  new Product(1003, "Tablet", 45750.75f)
				);
		
		productRepo.saveAll(products);
	}
}
