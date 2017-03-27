package com.leetcode.easy;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxNumOfOnes = 0;
		int numOfOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				numOfOnes++;
				maxNumOfOnes = Math.max(maxNumOfOnes, numOfOnes);
			} else {
				numOfOnes = 0;
			}
		}
		return maxNumOfOnes;
    }
}
