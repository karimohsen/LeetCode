package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		if (p.length() > s.length())
			return list;
		for (int i = 0; i < s.length(); i++) {
			try {
				String temp = s.substring(i, i + p.length());
				if (checkifContainsAll(temp, p)) {
					list.add(i);
				}
			} catch (Exception ex) {
				break;
			}
		}
		return list;
	}

	public boolean checkifContainsAll(String str1, String str2) {
		int[] arr = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			arr[str2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0)
				return false;
		}
		return true;
	}
}
