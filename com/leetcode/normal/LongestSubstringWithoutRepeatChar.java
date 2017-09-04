package com.leetcode.normal;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatChar {
	public int lengthOfLongestSubstring(String s) {
		int result = 0;
		int maxLength = 0;
		boolean flag = false;
		int firstIndex = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (set.add(c)) {
				if (!flag) {
					firstIndex = i;
					flag = true;
				}
				maxLength++;
				if (maxLength > result) {
					result = maxLength;
				}
			} else {
				set.clear();
				maxLength = 0;
				i = firstIndex;
				flag = false;
			}
		}
		return result;
	}
}
