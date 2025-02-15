package com.capgemini.pms.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.pms.entities.Product;
import com.capgemini.pms.repository.ProductRepository;
import com.capgemini.pms.services.ProductServices;

@Service
public class ProductServicesImpl implements ProductServices {
	private ProductRepository productRepo;
	
	public ProductServicesImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
		System.out.println("Product added to Stock");
	}

	@Override
	public Product searchProductById(Integer pid) {
		Product prod = null;
		Optional<Product> optProduct =  productRepo.findById(pid);
		if(optProduct.isPresent()) {
			prod = optProduct.get();
		}
		return prod;
	}

	@Override
	public void deleteByProductId(Integer pid) {
		productRepo.deleteById(pid);

	}

	@Override
	public void listAllProducts() {
		Iterable<Product> products = productRepo.findAll();
		for(Product prod : products) {
			System.out.println(prod);
		}
	}

}
