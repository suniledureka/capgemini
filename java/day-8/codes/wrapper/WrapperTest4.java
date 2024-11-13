package com.capgemini.java.wrapper;

public class WrapperTest4 {

	public static void main(String[] args) {
		int n = Integer.parseInt("456");
		System.out.println(n);
		
		float f = Float.parseFloat("234.56");
		System.out.println(f);
		
		byte b = Byte.parseByte("127");
		System.out.println(b);
		
		//boolean bool = Boolean.parseBoolean("true");
		boolean bool = Boolean.parseBoolean("falses");
		System.out.println(bool);
	}

}
