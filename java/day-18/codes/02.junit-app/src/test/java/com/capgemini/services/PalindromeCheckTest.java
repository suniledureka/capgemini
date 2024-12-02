package com.capgemini.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {
	static PalindromeCheck palObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palObj = new PalindromeCheck();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palObj = null;
	}

	@Test
	void testIsPalindrome() {
		String str = "madam";
		boolean actual = palObj.isPalindrome(str);
		assertTrue(actual);
	}
	
	@Test
	void testIsPalindrome1() {
		String str = "MaDam";
		assertTrue(palObj.isPalindrome(str));
	}	

}
