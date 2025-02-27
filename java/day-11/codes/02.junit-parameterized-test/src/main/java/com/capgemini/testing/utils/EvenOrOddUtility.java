package com.capgemini.testing.utils;

public class EvenOrOddUtility {
	public String checkOddOrEven(int num) {
		int rem = num %2;
		
		if(rem == 0)
			return "even";
		
		return "odd";
	}
}
