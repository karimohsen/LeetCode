package com.leetcode.normal;

import java.util.Random;

public class ShuffleAnArray {
	int[] arr;
	int[] originalArray;
	Random rand;

	public ShuffleAnArray(int[] nums) {
        arr = nums;
        rand = new Random();
		originalArray = new int[nums.length];
		System.arraycopy(nums, 0, originalArray, 0, nums.length);
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return originalArray;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int randIndex = rand.nextInt(len - i);
			int temp = arr[i];
			arr[i] = arr[randIndex + i];
			arr[randIndex + i] = temp;
		}
		return arr;
	}
}
