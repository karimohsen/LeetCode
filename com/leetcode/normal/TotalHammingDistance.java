package com.leetcode.normal;

public class TotalHammingDistance {
	public int totalHammingDistance(int[] nums) {
		int total = 0;
		for (int i = 0; i < 32; i++) {
			int numOnes = 0;
			for (int j = 0; j < nums.length; j++)
				numOnes += (nums[j] >> i) & 1;
			int numZeros = nums.length - numOnes;
			total += numZeros * numOnes;
		}
		return total;
	}
}
