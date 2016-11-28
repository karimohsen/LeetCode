package com.leetcode.normal;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int[] right = new int[nums.length];
		int[] left = new int[nums.length];
		right[nums.length - 1] = 1;
		left[0] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			result[i] = left[i] * right[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		new ProductOfArrayExceptSelf().productExceptSelf(nums);
	}
}
