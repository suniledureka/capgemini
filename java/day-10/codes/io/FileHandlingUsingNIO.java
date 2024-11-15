package com.capgemini.java.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileHandlingUsingNIO {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("src/com/capgemini/java/io/sample.txt");
		
		List<String> data = Arrays.asList("This is my first Line", 
				"This is my second Line",
				"This is my Third Line");
		
		//Files.write(filePath, data, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
		//Files.write(filePath, data, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		Files.write(filePath, data, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		System.out.println("file saved!!");
		System.out.println();
		
		List<String> lines = Files.readAllLines(filePath);
		//System.out.println(lines);
		for(String line : lines) {
			System.out.println(line);
		}
	}
}
