package com.leetcode.easy;

public class PowerofFour {
	public boolean isPowerOfFour(int num) {
		if (num == 1)
			return true;
		if (num % 4 != 0)
			return false;
		while (num > 0) {
			if (num == 4)
				return true;
			if (num % 4 == 0)
				num /= 4;
			else
				return false;
		}
		return false;
	}
}
