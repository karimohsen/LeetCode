package com.leetcode.easy;

public class ExcelSheetNumber {
	public int titleToNumber(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != 0) {
				res *= 26;
			}
			res += (int) s.charAt(i) - 64;
		}
		return res;
	}
}
