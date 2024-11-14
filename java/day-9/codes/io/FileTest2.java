package com.capgemini.java.io;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) throws Exception {
		/*
		File dir = new File("c:/capgemini/java");
		if(!dir.exists()) {
			boolean dirCreationStatus = dir.mkdir();
			System.out.println("directory created = " + dirCreationStatus);
		}
		*/
		
		File dir = new File("c:/capgemini/java/io/file");
		if(!dir.exists()) {
			boolean dirCreationStatus = dir.mkdirs();
			System.out.println("directory created = " + dirCreationStatus);
		}
		
		File f = new File(dir, "test.txt");
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
			
	}

}
