package com.leetcode.easy;

public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
		int length = str.length();
		for (int i = length / 2; i >= 1; i--) {
			if (length % i == 0) {
				int l = length / i;
				String subStr = str.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < l; j++) {
					sb.append(subStr);
				}
				if (sb.toString().equals(str)) {
					return true;
				}
			}
		}
		return false;
	}
}
