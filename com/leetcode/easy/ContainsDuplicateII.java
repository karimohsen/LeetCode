package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		int min = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
        	if(map.containsKey(nums[i])){
        		int index = map.get(nums[i]);
        		min = Math.min(min, i-index);
        	}
        	map.put(nums[i], i);
        }
        if(min <= k)
        	return true;
        return false;
    }
}
