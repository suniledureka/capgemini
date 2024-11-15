package com.capgemini.java.io;

import java.io.File;

public class ListDirectory {

	public static void main(String[] args) throws Exception {
		File dir = new File("c:/capgemini");
		
		if(dir.isDirectory()) {
			String[] fileNames = dir.list();
			
			System.out.println("==== contents of directory ====");
			/*
			for(int i=0; i<fileNames.length; i++) {
				System.out.println(String.format("%2d. %s", (i+1), fileNames[i]));
				Thread.sleep(300);
			}
			*/
			int n = 0;
			for(int i=0; i<fileNames.length; i++) {
				File temp = new File(dir, fileNames[i]);
				if(temp.isFile()) {
					System.out.println(String.format("%2d. %s", (++n), fileNames[i]));
				}
				Thread.sleep(300);
			}
		}
	}

}
