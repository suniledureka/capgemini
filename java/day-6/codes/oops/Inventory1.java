package com.capgemini.java.oops;

public class Inventory1 {

	public static void main(String[] args) {
		Product prod = new Product();
		
		System.out.println("\"prod is of type\" --> " + prod.getClass().getName());
		System.out.println("\"prod is of type\" --> " + prod.getClass().getSimpleName());
		System.out.println();
		
		System.out.println(("hashCode() = " + prod.hashCode()));
		System.out.println(("hashCode() in hex_decimal form  = " + Integer.toHexString(prod.hashCode())));
		System.out.println();
		
		System.out.println(prod); //toString()
		
		prod.setProductId(1001);
		prod.setProductName("Mobile Phone");
		System.out.println(prod);
	}

}
