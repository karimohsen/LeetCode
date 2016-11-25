package com.leetcode.easy;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null)
			return true;
		int i = 0;
		int j = s.length() - 1;
		while (i < s.length() && j >= 0) {
			if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {
				if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
					return false;
				}
			}
			else if(!Character.isLetterOrDigit(s.charAt(i))){
				i++;
				continue;
			}
			else if(!Character.isLetterOrDigit(s.charAt(j))){
				j--;
				continue;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(new ValidPalindrome().isPalindrome("v' 5:UxU:5 v'"));
	}
}
