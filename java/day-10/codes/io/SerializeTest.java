package com.capgemini.java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws Exception {
		Product prod = new Product(1001, "Mobile");
		System.out.println(prod);
		
		FileOutputStream fout = new FileOutputStream("src/com/capgemini/java/io/products.ser", true);
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(prod);
		System.out.println("product Saved");
		
		fout.close();
		oos.close();
	}

}
