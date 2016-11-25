package com.leetcode.easy;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (nums != null && k > nums.length)
			k = k % nums.length;
		if (nums.length != 1 && k != 0) {
			int[] res = new int[nums.length];
			for (int i = 0; i < k; i++) {
				res[i] = nums[nums.length - k + i];
			}
			int j = k;
			for (int i = 0; i < nums.length - k; i++) {
				res[j] = nums[i];
				j++;
			}
			System.arraycopy(res, 0, nums, 0, res.length);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1 };
		int k = 10;
		new RotateArray().rotate(arr, k);
	}
}
