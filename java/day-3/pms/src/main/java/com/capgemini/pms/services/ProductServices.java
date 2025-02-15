package com.capgemini.pms.services;

import com.capgemini.pms.entities.Product;

public interface ProductServices {
	public void saveProduct(Product product);
	
	public Product searchProductById(Integer pid);
	
	public void deleteByProductId(Integer pid);
	
	public void listAllProducts();
}
