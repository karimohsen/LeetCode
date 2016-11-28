package com.leetcode.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> resultList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int count = map.get(nums[i]);
				count++;
				map.put(nums[i], count);
			} else {
				map.put(nums[i], 1);
			}
		}
		Map<Integer, Integer> sortedMap = sortMapByValue(map);
		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			if (k == 0)
				break;
			resultList.add(entry.getKey());
			k--;
		}
		return resultList;
	}

	public Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> map) {
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});
		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
		for (int i = 0; i < list.size(); i++) {
			sortedMap.put(list.get(i).getKey(), list.get(i).getValue());
		}
		return sortedMap;
	}

}
