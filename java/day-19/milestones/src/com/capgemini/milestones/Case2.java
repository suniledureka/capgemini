package com.capgemini.milestones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Case2 {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
						Arrays.asList("1", "01-01-2023","01:30", "ERROR", "failed"),
						Arrays.asList("2", "01-01-2023","14:00", "ERROR", "failed"),
						Arrays.asList("3", "01-01-2023","15:00", "INFO", "established"),
						Arrays.asList("4", "01-01-2022","18:00", "CRITICAL", "failed")
				);
		
		List<List<String>> criticalList = list.stream().filter(innerList -> innerList.get(3).equalsIgnoreCase("ERROR") || innerList.get(3).equalsIgnoreCase("CRITICAL")).collect(Collectors.toList());
		//criticalList.forEach(x -> System.out.println(x));
		
		List<List<String>> sortedList1 = criticalList.stream().sorted((data1, data2) -> {
			String str1 = data1.get(1) + " " + data1.get(2);
			String str2 = data2.get(1) + " " + data2.get(2);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			LocalDateTime d1 = LocalDateTime.parse(str1, formatter);
			LocalDateTime d2 = LocalDateTime.parse(str2, formatter);
			return d1.compareTo(d2);
		}).collect(Collectors.toList());
		
		sortedList1.forEach(item -> System.out.println(item));		
	}

}
