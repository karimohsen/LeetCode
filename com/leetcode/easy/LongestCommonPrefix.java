package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		String res = "";
		int minLength = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < strs.length; i++) {
			if (minLength > strs[i].length()) {
				minLength = strs[i].length();
				minIndex = i;
			}
		}
		Set<String> set = new HashSet<>();
		for (int j = 0; j < strs.length; j++) {
			if (j != minIndex) {
				res = "";
				for (int k = 0; k < strs[j].length(); k++) {
					if (k < minLength) {
						if (strs[minIndex].charAt(k) == strs[j].charAt(k)) {
							res += Character.toString(strs[minIndex].charAt(k));
						} else {
							set.add(res);
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		for (String str : set) {
			if (str.length() < res.length())
				res = str;
		}
		return res;
	}

	public static void main(String[] args) {
		String[] arr = { "aaab", "aba", "abca" };
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(arr));
	}

}
