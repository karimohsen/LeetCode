package com.leetcode.normal;

public class IncreasingTripletSubseq {
	public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
		int bigger = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= smallest) {
				smallest = nums[i];
			} else if (nums[i] <= bigger) {
				bigger = nums[i];
			}else{
				return true;
			}
		}
		return false;
    }
}
