package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> mapToIndex = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			mapToIndex.put(nums[i], i);
		}
		int[] res = new int[findNums.length];
		for (int i = 0; i < findNums.length; i++) {
			res[i] = -1;
			for (int j = mapToIndex.get(findNums[i]) + 1; j < nums.length; j++) {
				if (nums[j] > findNums[i]) {
					res[i] = nums[j];
					break;
				}
			}
		}
		return res;
	}
}
