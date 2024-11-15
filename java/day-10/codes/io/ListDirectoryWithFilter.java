package com.capgemini.java.io;

import java.io.File;
import java.io.FilenameFilter;

class MyFileFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
	 // if(name.endsWith(".java"))	
	 if(name.startsWith("C") && name.endsWith(".java"))	
		return true;
	  else
		return false;  
	}	
}

public class ListDirectoryWithFilter {

	public static void main(String[] args) {
File dir = new File("c:/capgemini");
		
		if(dir.isDirectory()) {
			String[] fileNames = dir.list(new MyFileFilter());
			
			for(String fileName : fileNames) {
				System.out.println(" ---> " + fileName);
			}
		}
	}

}
