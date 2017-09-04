package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int sum = ( nums.length * (nums.length+1))/2;
        int sum2 = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.add(nums[i])){
                res[0] = nums[i];
            }
            sum2+= nums[i];
        }
        res[1]=(sum-sum2)+res[0];
        return res;
    }
}
