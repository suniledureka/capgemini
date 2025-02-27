package com.capgemini.testing.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenOrOddUtilityTest {

	@ParameterizedTest
	@CsvSource(value = {"11, odd", "12, even","13, odd","14, even"}, delimiter = ',')
	void testIsPalindrome(String input, String expected) {
		EvenOrOddUtility eoUtilObj = new EvenOrOddUtility();
		String actual = eoUtilObj.checkOddOrEven(Integer.parseInt(input));
		assertEquals(expected, actual);
	}

}
