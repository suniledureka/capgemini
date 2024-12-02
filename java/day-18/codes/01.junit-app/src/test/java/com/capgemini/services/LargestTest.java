package com.capgemini.services;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestTest {
   private static Largest larObj;
   
   @BeforeAll
   public static void setUp() {
	System.out.println("testing initialization");
	larObj = new Largest();   
   }
   
	@Test
	void testFindLargest() {
		int[] data = {15,25,14,76,18,23,41};
		//Largest larObj = new Largest();
		int expected = 76;
		int actual = larObj.findLargest(data);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindLargest1() {
		int[] data = {15,-25,14,-76,18,-23,41};
		//Largest larObj = new Largest();
		int expected = 41;
		int actual = larObj.findLargest(data);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindLargest2() {
		int[] data = {-15, -25, -14, -76, -18, -23, -41};
		//Largest larObj = new Largest();
		int expected = -14;
		int actual = larObj.findLargest(data);
		assertEquals(expected, actual);
	}	
	
	@Test
	void testFindLargest3() {
		int[] data = {};
		//Largest larObj = new Largest();		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(data));
	}
	
	@AfterAll
	public static void testCompleted() {
		System.out.println("test completed");
		larObj = null;
	}
	
	@BeforeEach
	public void testStart() {
		System.out.println("----> starting test" );
	}
	
	@AfterEach
	public void testComplete() {
		System.out.println("----> test completed" );
	}	
}
