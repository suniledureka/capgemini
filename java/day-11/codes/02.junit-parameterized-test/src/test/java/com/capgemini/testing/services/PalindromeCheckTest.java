package com.capgemini.testing.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {
	private static PalindromeCheck palCheck;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palCheck = new PalindromeCheck();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palCheck = null;
	}

	@ParameterizedTest
	@ValueSource(strings = {"eye", "malayalam", "racecar", "Radar", "liril", "madam"})
	void testIsPalindrome(String str) {
		System.out.println(str);
		boolean actual = palCheck.isPalindrome(str);
		assertTrue(actual);
	}

}
