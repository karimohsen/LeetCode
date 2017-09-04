package com.leetcode.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombOfPhoneNum {
	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.equals("") || digits.length() == 0)
			return new ArrayList<String>();
		List<String> list = new ArrayList<>();
		Map<Character, String> map = new HashMap<>();
		map.put('0', "0");
		map.put('1', "1");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		list.add("");
		for (int j = 0; j < digits.length(); j++) {
			String str = map.get(digits.charAt(j));
			List<String> tempList = new ArrayList<>();
			for (int k = 0; k < list.size(); k++) {
				for (int i = 0; i < str.length(); i++) {
					tempList.add(list.get(k) + str.charAt(i));
				}
			}
			list = tempList;
		}
		return list;
	}
}
