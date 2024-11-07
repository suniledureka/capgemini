package com.capgemini.java.strings;

public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb + " | size="+sb.length() + " |capacity=" + sb.capacity());
		
		sb.append("Capgemini");
		System.out.println(sb + " | size="+sb.length() + " |capacity=" + sb.capacity());
		
		sb.append(" Limite");
		System.out.println(sb + " | size="+sb.length() + " |capacity=" + sb.capacity());
		
		sb.append("d.");
		System.out.println(sb + " | size="+sb.length() + " |capacity=" + sb.capacity());
		
		sb.insert(0, 101);
		System.out.println(sb + " | size="+sb.length() + " |capacity=" + sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
	}
}
