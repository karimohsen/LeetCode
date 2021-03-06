package com.leetcode.easy;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		if (num == 1)
			return true;
		int m = num / 2;
		for (int i = m; i >= 2; i--) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}
}
