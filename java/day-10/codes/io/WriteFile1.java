package com.capgemini.java.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/com/capgemini/java/io/capgem1.txt");
				
		String str = "Capgemini SE is a French multinational information technology services and "
				+ "consulting company, headquartered in Paris, France.\n";
		
		fout.write(str);
		System.out.println("file saved!!");
		fout.close();
	}

}
