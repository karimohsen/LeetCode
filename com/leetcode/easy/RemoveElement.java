package com.leetcode.easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0)
			return 0;
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		return i;
	}
}
