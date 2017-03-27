package com.leetcode.easy;

public class TwoSumIIArraySorted {
	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0)
			return null;
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			int tempTarget = numbers[i] + numbers[j];
			if (tempTarget > target) {
				j--;
			} else if (tempTarget < target) {
				i++;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}
}
