package com.sapient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

class NumberTest {
	
	private Number number;
	
	@Before
	public void setUp() throws Exception {
		number = new Number();
	}

	//Tests for Prime Numbers
	@Test
	public void testCheckPrime_True() {
		int res = number.checkPrime(11);
		assertEquals(1, res);
	}
	
	@Test
	public void testCheckPrime_False() {
		int res = number.checkPrime(12);
		assertEquals(0, res);
	}
	
	@Test
	public void testCheckPrime_Input_1() {
		int res = number.checkPrime(1);
		assertEquals(0, res);
	}
	
	@Test
	public void testCheckPrime_Input_0() {
		int res = number.checkPrime(0);
		assertEquals(0, res);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckPrime_IllegalArgument() {
		number.checkPrime(-1);
	}
	
	//Tests for Armstrong Numbers
	@Test
	public void testCheckArmstrong_True() {
		Boolean res = number.checkArmstrong(153);
		assertTrue(res);
	}
	
	@Test
	public void testCheckArmstrong_False() {
		Boolean res = number.checkArmstrong(152);
		assertFalse(res);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckArmstrong_IllegalArgument() {
		number.checkArmstrong(-1);
	}
	
	//Tests for Palindrome Numbers
	@Test 
	public void testCheckPalindrome_True() {
		Boolean res = number.checkPalindrome(121);
		assertTrue(res);
	}
	
	@Test 
	public void testCheckPalindrome_False() {
		Boolean res = number.checkPalindrome(123);
		assertFalse(res);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckPalindrome_IllegalArgument() {
		number.checkPalindrome(-20);
	}
}
