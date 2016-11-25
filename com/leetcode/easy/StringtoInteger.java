package com.leetcode.easy;

public class StringtoInteger {
	public int myAtoi(String str) {
		boolean negative = false;
		double result = 0;
		int i = 0;
		str = str.trim();
		if (str != null && str.length() != 0) {
			if (str.charAt(0) == '-') {
				negative = true;
				i = 1;
			} else if (str.charAt(0) == '+') {
				i = 1;
			}
			for (int j = i; j < str.length(); j++) {
				if (Character.isDigit(str.charAt(j))) {
					result *= 10;
					result += str.charAt(j) - '0';
				} else {
					break;
				}

			}
			if (negative)
				result *= -1;
		}
		if(result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int)result;
	}

	public static void main(String[] args) {
		new StringtoInteger().myAtoi("-9223372036854775809");
	}
}
