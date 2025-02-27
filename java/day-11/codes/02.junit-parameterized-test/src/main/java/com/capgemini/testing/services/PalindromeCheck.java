package com.capgemini.testing.services;

public class PalindromeCheck {
	public boolean isPalindrome(String str) {
		str = str.toLowerCase();
		
		String strRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev.concat(String.valueOf(str.charAt(i)));
		}

		if (str.equals(strRev))
			return true;
		
		return false;
	}
}
