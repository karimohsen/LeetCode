package com.leetcode.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] arr = strs[i].toCharArray();
			Arrays.sort(arr);
			String str = new String(arr);
			if (!map.containsKey(str)) {
				List<String> tempList = new ArrayList<>();
				tempList.add(strs[i]);
				map.put(str, tempList);
			} else {
				map.get(str).add(strs[i]);
			}

		}
		list.addAll(map.values());
		return list;
	}
}
