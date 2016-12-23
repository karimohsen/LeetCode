package com.leetcode.normal;

public class IntegerBreak {
	public int integerBreak(int n) {
		if (n == 2)
			return 1;
		else if (n == 3)
			return 2;
		else if (n == 4)
			return 4;
		int result = 1;
		if (n % 3 == 0) {
			result = (int) Math.pow(3, n / 3);
		} else if (n % 3 == 1) {
			result = ((int) Math.pow(3, (n - 4) / 3)) * 4;
		} else {
			result = ((int) Math.pow(3, (n - 2) / 3)) * 2;
		}
		return result;
	}
}
