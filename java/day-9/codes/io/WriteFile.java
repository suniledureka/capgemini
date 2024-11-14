package com.capgemini.java.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/com/capgemini/java/io/capgem.txt");
		//FileOutputStream fout = new FileOutputStream("src/com/capgemini/java/io/capgem.txt", true); //true - appending mode
		
		String str = "Capgemini SE is a French multinational information technology services and consulting company, headquartered in Paris, France.\n";
		
		/*
		for(int i=0; i<str.length(); i++) {
			fout.write((int)str.charAt(i));
		}
		*/
		
		byte[] b = str.getBytes();
		fout.write(b);
		System.out.println("file saved!!");
		fout.close();
	}

}
