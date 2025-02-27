package com.capgemini.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@Disabled
class LargestTest {
	private static Largest larObj;
	
	@BeforeAll
    public static void testInitialization() {
    	System.out.println("before all test cases");
    	larObj = new Largest();
    }
	@Test
	//@Disabled
	void testFindLargest() {
		//Largest larObj = new Largest();
		int[] data = {78,45,98,10,23,67};
		int expectedValue = 98;
		int actualValue = larObj.findLargest(data);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testFindLargest01() {
		//Largest larObj = new Largest();
		int[] data = {-78,45,-98,10,23,-67};
		int expectedValue = 45;
		int actualValue = larObj.findLargest(data);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	@DisplayName("ALL NEGATUVE NUMBERS")
	void testFindLargest02() {
		//Largest larObj = new Largest();
		int[] data = {-78,-45,-98,-10,-23,-67};
		int expectedValue = -10;
		int actualValue = larObj.findLargest(data);
		assertEquals(expectedValue, actualValue);
	}	
	
	@Test
	void testFindLargest03() {
		//Largest larObj = new Largest();
		int[] data = {};
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(data));
	}	
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("all test cases completed");
		larObj = null;
	}
}
