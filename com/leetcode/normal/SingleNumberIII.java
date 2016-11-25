package com.leetcode.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				int count = map.get(nums[i]);
				count++;
				map.put(nums[i], count);
			}
		}
		List<Integer> list = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
