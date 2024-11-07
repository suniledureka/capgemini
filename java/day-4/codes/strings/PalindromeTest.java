package com.capgemini.java.strings;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string : ");
		
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String strRev = sb.toString();
		
		if(str.toLowerCase().equals(strRev.toLowerCase()))
			System.out.printf("\"%s \" is Palindrome", str);
		else
			System.out.printf("\"%s \" is NOT Palindrome", str);
		sc.close();
		System.out.println();
		strRev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			strRev+=str.charAt(i);
		}
		if(str.toLowerCase().equals(strRev.toLowerCase()))
			System.out.printf("\"%s \" is Palindrome", str);
		else
			System.out.printf("\"%s \" is NOT Palindrome", str);
		System.out.println();
		
		int flag = 0;
		String str1 = str.toLowerCase();
		if(str.length()%2 == 1) {
			for(int i=0, j=str1.length()-1; i<j; i++, j--) {
				if(str1.charAt(i) != str1.charAt(j)) {
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.printf("\"%s \" is Palindrome", str);
			else
				System.out.printf("\"%s \" is NOT Palindrome", str);
		}else
			System.out.printf("\"%s \" is NOT Palindrome", str);
			
	}

}
