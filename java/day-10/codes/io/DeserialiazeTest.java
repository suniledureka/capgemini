package com.capgemini.java.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialiazeTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/com/capgemini/java/io/products.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Object obj = null;
		
		while(fin.available() > 0) {
			obj = oin.readObject();
			if(obj instanceof Product) {
				Product prod = (Product)obj;
				System.out.println(prod);
			}
		}
		fin.close();
	}

}
