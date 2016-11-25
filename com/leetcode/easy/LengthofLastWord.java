package com.leetcode.easy;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0)
			return 0;
		String[] arr = s.split(" ");
		return arr.length >= 1 ? arr[arr.length - 1].length() : 0;
	}
}
