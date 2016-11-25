package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		Map<Character, String> map = new HashMap<>();
		String[] strArr = str.split(" ");
		if (strArr.length != pattern.length())
			return false;
		for (int i = 0; i < strArr.length; i++) {
			if (map.containsKey(pattern.charAt(i))) {
				String tempStr = map.get(pattern.charAt(i));
				if (!tempStr.equals(strArr[i])) {
					return false;
				}
			} else if (map.containsValue(strArr[i])) {
				return false;
			}
			map.put(pattern.charAt(i), strArr[i]);

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
	}
}
