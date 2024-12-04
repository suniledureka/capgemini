package com.capgemini.milestones;


import java.util.Scanner;

public class M1ProblemSolving1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a word: ");
		String word = sc.nextLine();
		
		int startIndex = -1;
		int endIndex = -1;
		
		boolean found = false;
	    for(int i=1; i<word.length()-1; i++) {
	    	for(int j=i-1; j>=0; j--) {
	    		if(word.charAt(i) == word.charAt(j)) {
	    			startIndex = i;
	    			found = true;
	    			break;
	    		}
	    	}//inner loop
	    	if(found) {
	    		found = false;
	    		break;
	    	}
	    }

	    for(int i=startIndex+1; i<word.length(); i++) {
	    	for(int j=i-1; j>=0; j--) {
	    		if(word.charAt(i) == word.charAt(j) && i != startIndex) {
	    			endIndex = i;
	    			found = true;
	    			break;
	    		}
	    	}//inner loop
	    	if(found) {
	    		found = false;
	    		break;
	    	}
	    }
	       
		//System.out.println(startIndex);
		//System.out.println(endIndex);
		
	    if(startIndex > -1 && endIndex>-1)
	    	System.out.println(word.substring(startIndex, endIndex).length());
		sc.close();
		
		
	}

}
