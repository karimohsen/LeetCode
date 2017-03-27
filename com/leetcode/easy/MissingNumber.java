package com.leetcode.easy;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int left = 0, right = nums.length;
		while (right > left) {
			int middle = (right + left) / 2;
			if (nums[middle] > middle) {
				right = middle;
			} else {
				left = middle + 1;
			}
		}
		return right;
	}
}
