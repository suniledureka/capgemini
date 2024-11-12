package com.capgemini.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		Product prod1 = new Product();
		Product prod2 = new Product();
		Product prod3 = new Product(8976, "Laptop");
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
		System.out.println("in main() method");
	}
	
	static {
		System.out.println("inside static block of Inventory");
	}
	static {
		System.out.println("inside second static block of Inventory");
	}
}
