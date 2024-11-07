package com.capgemini.java.strings;

public class SBTest1 {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuffer sb = new StringBuffer("capgem");
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		sb.append("1234567890123456");
		
		System.out.println(sb.length()+ " | " + sb.capacity());
		
		sb.insert(0, "*");
		System.out.println(sb.length()+ " | " + sb.capacity());
	}

}
