package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        int [] res;
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet =  new HashSet<>();
        for(int i = 0 ; i < nums1.length ;i++){
        	set.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ;i++){
        	if(set.contains(nums2[i])){
        		resultSet.add(nums2[i]);
        	}
        }
        res = new int [resultSet.size()];
        int i = 0;
        for(Integer num : resultSet){
        	res[i] = num;
        	i++;
        }
        return res;
    }
}
