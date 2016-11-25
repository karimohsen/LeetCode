package com.leetcode.easy;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		Set<Integer> set = new TreeSet<>();
		for(int i = 0 ; i < nums.length ;i++){
			set.add(nums[i]);
		}
		int[] arr = new int[set.size()];
		int i =0;
		for(Integer x : set){
			arr[i] = x;
			i++;
		}
		return arr.length > 2 ? arr[arr.length-3] : arr[arr.length-1]; 
	}
}
