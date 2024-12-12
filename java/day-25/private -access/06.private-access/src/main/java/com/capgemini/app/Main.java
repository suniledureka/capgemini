package com.capgemini.app;

import java.lang.reflect.Field;

import com.capgemini.app.models.Product;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Product prod = new Product();
		System.out.println(prod);
		//System.out.println(prod.productName); //The field Product.productName is not visible
		
		Class<?> clzRef = Class.forName("com.capgemini.app.models.Product");
		
		Field productNameField = clzRef.getDeclaredField("productName");
		productNameField.setAccessible(true);
		
		productNameField.set(prod, "Mobile Phone");
		System.out.println(prod);
	}
}
