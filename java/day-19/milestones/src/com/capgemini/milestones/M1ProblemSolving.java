package com.capgemini.milestones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class M1ProblemSolving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a word: ");
		String word = sc.nextLine();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<word.length(); i++) {
			Character ch = word.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		int count = 0;
		 
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			if(entry.getValue() > 1)
				count++;
		}
		
		System.out.println(count);
		sc.close();
		
		System.out.println(map.entrySet().stream().filter(entry -> entry.getValue() > 1).count());
	}

}
