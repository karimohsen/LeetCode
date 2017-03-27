package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
		String[] res = new String[nums.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		Arrays.sort(nums);
		int j = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i == nums.length - 1) {
				res[map.get(nums[i])] = "Gold Medal";
				j++;
			} else if (i == nums.length - 2) {
				res[map.get(nums[i])] = "Silver Medal";
				j++;
			} else if (i == nums.length - 3) {
				res[map.get(nums[i])] = "Bronze Medal";
				j++;
			} else {
				j++;
				res[map.get(nums[i])] = Integer.toString(j);
			}
		}
		return res;
	}
}
