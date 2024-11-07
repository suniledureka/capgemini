package com.capgemini.java.strings;

public class SBTest2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.append("Capgemini");
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.ensureCapacity(100);
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		//sb.setLength(4);
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.trimToSize();
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
	}

}
