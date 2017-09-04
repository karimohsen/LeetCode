package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
		int LHS = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (map.containsKey(entry.getKey() - 1)) {
				int tempSize = entry.getValue() + map.get(entry.getKey() - 1);
				if (tempSize > LHS) {
					LHS = tempSize;
				}
			}
			if (map.containsKey(entry.getKey() + 1)) {
				int tempSize = entry.getValue() + map.get(entry.getKey() + 1);
				if (tempSize > LHS) {
					LHS = tempSize;
				}
			}
		}
		return LHS;
	}
}
