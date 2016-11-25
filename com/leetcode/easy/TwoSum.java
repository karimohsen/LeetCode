package com.leetcode.easy;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		boolean flag = false;
		for (int i = 0; i < nums.length-1; i++) {
			if (flag)
				break;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					flag = true;
					res[0] = i;
					res[1] = j;
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] res = twoSum(nums, target);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
