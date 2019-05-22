package com.test.converter;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class StageOneTest extends TestCase {

	public void testDigitsToLetter() {
		int[] digits = { 2, 3 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

	public void testDigitsToLetter2() {
		int[] digits = { 1 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

	public void testDigitsToLetter3() {
		int[] digits = { 7 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "p", "q", "r", "s" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

}
