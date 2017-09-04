package com.leetcode.easy;

import java.util.Arrays;

public class KthLargestElemInArray {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
