package com.leetcode.easy;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		int num = 2;
		if (n == 1)
			return true;
		if (n % 2 == 0)
			while (num >= 2) {
				if (num == n)
					return true;
				num *= 2;
			}
		return false;
	}
}
