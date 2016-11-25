package com.leetcode.easy;

public class FirstUniqueCharInStr {
	public int firstUniqChar(String s) {
        int index = -1;
		int [] arr = new int [26];
		for(int i = 0 ; i < s.length() ;i++){
			arr[s.charAt(i)-'a']++;
		}
		for(int i = 0 ; i < s.length() ;i++){
				if(arr[s.charAt(i)-'a'] == 1){
					index = i;
					break;
				}
		}
		return index;
    }
}
