package com.capgemini.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		//System.out.println(prod.productId + " | " + prod.productName);
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		
		//prod.productId = 101;
		prod.setProductId(1001);
		prod.setProductName("Mobile Phone");
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		System.out.println();
		
		System.out.println("\"prod\" is an instance of type - " + prod.getClass().getName());
		System.out.println("\"prod\" is an instance of type - " + prod.getClass().getSimpleName());
		
		System.out.println(prod instanceof Product); 
	}

}
