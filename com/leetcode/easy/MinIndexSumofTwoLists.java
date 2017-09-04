package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> stringList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				if ((i + map.get(list2[i])) <= minSum) {
					if ((i + map.get(list2[i]) < minSum)) {
						stringList.clear();
					}
					stringList.add(list2[i]);
					minSum = i + map.get(list2[i]);
				}
			}
		}
		String[] res = new String[stringList.size()];
		for (int i = 0; i < stringList.size(); i++) {
			res[i] = stringList.get(i);
		}
		return res;
	}

}
