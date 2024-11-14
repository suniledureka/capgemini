package com.capgemini.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("src/com/capgemini/java/io/java.txt");
		
		/*
		System.out.println("no of bytes to be read = " + in.available());
		System.out.println(in.read());
		System.out.println(in.read());
		System.out.println("no of bytes to bea read = " + in.available());
		*/
		
		/*
		//-- read file contents character-by-character
		int n = in.read();
		while(n != -1) {
			System.out.print((char)n);
			n = in.read();
			Thread.sleep(100);
		}
		*/
		
		/*
		//-- read file contents as a whole
		byte[] b = new byte[in.available()];
		in.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		//-- read file contents line-by-line
		Reader file = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
			Thread.sleep(2000);
		}
		in.close();
	}
}
