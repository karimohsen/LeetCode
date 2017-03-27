package com.leetcode.easy;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int maxSubArray = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum < 0)
				sum = nums[i];
			else
				sum += nums[i];
			if (maxSubArray < sum)
				maxSubArray = sum;
		}
		return maxSubArray;
	}
}
