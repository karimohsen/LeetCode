package com.leetcode.easy;

public class ReverseWordsInaStringIII {
	public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
		String[] strArr = s.split(" ");
		for(int i = 0 ; i < strArr.length ; i++){
			for(int j = strArr[i].length()-1 ; j >= 0 ; j--){
				sb.append(strArr[i].charAt(j));
			}
			if(i != strArr.length-1)
				sb.append(' ');
		}	
		return sb.toString();
    }
}
