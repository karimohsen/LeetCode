package com.leetcode.easy;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0)
			return new int[0];
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = carry + digits[i];
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
			digits[i] = sum % 10;
		}
		if (carry == 1) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			System.arraycopy(digits, 0, result, 1, digits.length);
			return result;
		}
		return digits;
	}
}
