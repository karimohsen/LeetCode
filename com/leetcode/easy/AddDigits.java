package com.leetcode.easy;

public class AddDigits {
	public int addDigits(int num) {
		int res = 0;
		while (num > 9) {
			res += num % 10;
			num /= 10;
		}
		res += num;
		if (res > 9) {
			return addDigits(res);
		} else
			return res;
	}
}
