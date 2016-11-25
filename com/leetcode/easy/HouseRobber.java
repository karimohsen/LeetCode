package com.leetcode.easy;

public class HouseRobber {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] tempResult = new int[nums.length];
		tempResult[0] = nums[0];
		tempResult[1] = nums[1] > nums[0] ? nums[1] : nums[0];
		for (int i = 2; i < nums.length; i++) {
			tempResult[i] = Math.max(tempResult[i - 2] + nums[i], tempResult[i - 1]);
		}
		return tempResult[nums.length - 1] > tempResult[nums.length - 2] ? tempResult[nums.length - 1]
				: tempResult[nums.length - 2];
	}
}
