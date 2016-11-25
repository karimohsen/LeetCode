package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int num = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > nums.length / 2) {
				num = entry.getKey();
				break;
			}
		}
		return num;
	}
}
