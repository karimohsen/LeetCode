package com.leetcode.easy;

public class ReverseString {
	public String reverseString(String s) {
       char [] arr = s.toCharArray();
       int i = 0;
       int j = s.length()-1;
       while(j > i){
    	   char temp = arr[j];
    	   arr[j] = arr[i];
    	   arr[i] = temp;
    	   j--;
    	   i++;
       }
       return new String(arr);
    }
}
