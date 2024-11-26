package com.capgemini.milestones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("01-01-2023", "01:30"),
				Arrays.asList("01-01-2023", "14:00"), 
				Arrays.asList("01-01-2023", "15:00"),
				Arrays.asList("01-01-2022", "18:00"), 
				Arrays.asList("11-11-2000", "23:59"),
				Arrays.asList("01-01-2021", "11:59"));
		
		list.forEach(item -> System.out.println(item));
		System.out.println("=".repeat(100));
		
		List<List<String>> sortedList = list.stream().sorted((data1, data2) -> {
			String str1 = data1.get(0) + " " + data1.get(1);
			String str2 = data2.get(0) + " " + data2.get(1);
			return str1.compareTo(str2);
		}).collect(Collectors.toList());
		
		sortedList.forEach(item -> System.out.println(item));
		System.out.println("=".repeat(100));
		
		List<List<String>> sortedList1 = list.stream().sorted((data1, data2) -> {
			String str1 = data1.get(0) + " " + data1.get(1);
			String str2 = data2.get(0) + " " + data2.get(1);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			LocalDateTime d1 = LocalDateTime.parse(str1, formatter);
			LocalDateTime d2 = LocalDateTime.parse(str2, formatter);
			return d1.compareTo(d2);
		}).collect(Collectors.toList());
		
		sortedList1.forEach(item -> System.out.println(item));
	}

}
