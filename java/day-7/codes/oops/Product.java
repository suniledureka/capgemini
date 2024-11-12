package com.capgemini.java.oops;

public class Product {
	private int productId;
	private String productName;

	public Product() {
		System.out.println("no args constructor");
	}

	public Product(int productId, String productName) {
		super();
		System.out.println("inside 2 args constructor");
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [Product ID= " + productId + " | Product Name= " + productName + "]";
	}

	/*--- initialization block ---*/
	{
		System.out.println("inside initialization block");
		this.productId=1234;
		this.productName="Computer";
	}
	
	/*-- static block ---*/
	static {
		System.out.println("inside static block of Product");
	}
}
