package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		List<Integer> list;
		Map<Character, List<Integer>> map = new HashMap<>();
		Map<Character, List<Integer>> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				list = map.get(s.charAt(i));
				list.add(i);
			} else {
				list = new ArrayList<>();
				list.add(i);
				map.put(s.charAt(i), list);
			}
			if (map2.containsKey(t.charAt(i))) {
				list = map2.get(t.charAt(i));
				list.add(i);
			} else {
				list = new ArrayList<>();
				list.add(i);
				map2.put(t.charAt(i), list);
			}
		}
		List<Integer> list2;
		for (int i = 0; i < t.length(); i++) {
			list = map.get(s.charAt(i));
			list2 = map2.get(t.charAt(i));
			if (!list.equals(list2))
				return false;
		}
		return true;
	}
}
