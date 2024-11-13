package com.capgemini.java.wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(128);

		byte b = in.byteValue();
		short s = in.shortValue();
		int n = in.intValue();
		long l = in.longValue();
		
		float f = in.floatValue();
		double d = in.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
	}
}
