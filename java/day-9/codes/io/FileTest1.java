package com.capgemini.java.io;

import java.io.File;
import java.util.Date;

public class FileTest1 {

	public static void main(String[] args) {
		File f = new File("src/Welcome.java");
		//File f = new File("C:\\capgemini\\capgemini\\src\\Welcome.java");
		System.out.println("exists = " + f.exists());
		if(f.exists()) {
			System.out.println("is File = " + f.isFile());
			System.out.println("is Directory = " + f.isDirectory());
			System.out.println("name = " + f.getName());
			System.out.println("path = " + f.getPath());
			System.out.println("is absolute path = " + f.isAbsolute());
			System.out.println("absolute path = " + f.getAbsolutePath());
			
			System.out.println("is Hidden = " + f.isHidden());
			System.out.println("is Writable = " + f.canWrite());
			System.out.println("is Readable = " + f.canRead());
			
			System.out.println("file size = " + f.length());
			
			long lastModified = f.lastModified();
			Date modifiedDate = new Date(lastModified);
			System.out.println("welcome.java is modifed on " + modifiedDate);
		}
	}

}
