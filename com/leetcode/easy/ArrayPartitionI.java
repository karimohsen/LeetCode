package com.leetcode.easy;

import java.util.Arrays;

public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length) {
			sum += Math.min(nums[i], nums[i + 1]);
			i += 2;
		}
		return sum;
	}
}
