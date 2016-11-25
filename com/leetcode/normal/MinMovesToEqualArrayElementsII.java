package com.leetcode.normal;

import java.util.Arrays;

public class MinMovesToEqualArrayElementsII {
	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int i = 0, j = nums.length - 1, moves = 0;
		while (i < j) {
			moves += nums[j--] - nums[i++];
		}
		return moves;
	}
}
