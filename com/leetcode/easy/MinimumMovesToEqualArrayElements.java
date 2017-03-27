package com.leetcode.easy;

public class MinimumMovesToEqualArrayElements {
	public int minMoves(int[] nums) {
		int result = 0;
		if (nums == null || nums.length == 0)
			return 0;
		int min = nums[0];
		for (int i = 0; i < nums.length; i++)
			min = Math.min(min, nums[i]);
		for (int i = 0; i < nums.length; i++)
			result += nums[i] - min;
		return result;
	}
}
