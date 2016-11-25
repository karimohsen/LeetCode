package com.leetcode.easy;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if (n == 1)
			return true;
		int num = 3;
		if (n % 3 == 0)
			while (n >= num) {
				if (num == n) {
					return true;
				}
				num *= 3;
			}
		return false;
	}
}
