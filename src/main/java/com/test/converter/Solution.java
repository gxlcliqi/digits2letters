package com.test.converter;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution for mini test - digits to letter
 * 
 * @author Jacky Li
 *
 */
public class Solution {

	private static final String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
			"wxyz" };

	/**
	 * Digits to letter converter
	 * 
	 * @param digits
	 * @return result letter combinations
	 */
	public static List<String> digitsToLetter(int[] digits) {

		int[] singleDigits = toSingleDigitArray(digits);

		return convertAllDigits(singleDigits);
	}

	/**
	 * Convert digit greater than 9 to single digits
	 * 
	 * @param digits array
	 * @return single digits array, for example, if the input array is {22, 15},
	 *         then the output will be {2, 2, 1, 5}
	 */
	private static int[] toSingleDigitArray(int[] digits) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}

		String s = sb.toString();
		int[] digits2 = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			digits2[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		return digits2;
	}

	private static List<String> convertAllDigits(int[] digits) {
		List<String> res = new LinkedList<>();
		if (digits == null || digits.length == 0) {
			return res;
		}
		convertDigitAtIndex(digits, 0, new StringBuilder(), res);
		return res;
	}

	private static void convertDigitAtIndex(int[] s, int idx, StringBuilder sb, List<String> res) {
		if (idx == s.length) {
			res.add(sb.toString());
			return;
		}

		int n = s[idx];
		char[] chs = map[n].toCharArray();

		if (chs.length == 0) {
			convertDigitAtIndex(s, idx + 1, sb, res);
		} else {
			for (char c : chs) {
				sb.append(c);
				convertDigitAtIndex(s, idx + 1, sb, res);
				sb.deleteCharAt(sb.length() - 1);
			}
		}

		return;
	}
}
