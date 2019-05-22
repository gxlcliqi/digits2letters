package com.test.converter;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class StageTwoTest extends TestCase {

	public void testDigitsToLetter() {
		int[] digits = { 2, 3 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

	public void testDigitsToLetter2() {
		int[] digits = { 0 };
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

	public void testDigitsToLetter4() {
		int[] digits = { 23, 10 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

	public void testDigitsToLetter5() {
		int[] digits = { 10 };
		List<String> result = Solution.digitsToLetter(digits);
		String[] expectResult = { "" };
		assertTrue(result.size() == expectResult.length && result.containsAll(Arrays.asList(expectResult)));
	}

	public void testDigitsToLetter6() {
		int[] digits = { 99 };
		List<String> result = Solution.digitsToLetter(digits);

		int[] digits2 = { 9, 9 };
		List<String> expectResult = Solution.digitsToLetter(digits2);
		assertTrue(result.size() == expectResult.size() && result.containsAll(expectResult));
	}

	public void testDigitsToLetter7() {
		int[] digits = { 23, 4 };
		List<String> result = Solution.digitsToLetter(digits);

		int[] digits2 = { 2, 3, 4 };
		List<String> expectResult = Solution.digitsToLetter(digits2);
		assertTrue(result.size() == expectResult.size() && result.containsAll(expectResult));
	}
}
