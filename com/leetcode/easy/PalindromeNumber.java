package com.leetcode.easy;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		else {
			int div = 1;
			while (x / div >= 10) {
				div *= 10;
			}
			while (x != 0) {
				int num1 = x / div;
				int num2 = x % 10;
				if (num1 != num2)
					return false;
				x = (x % div) / 10;
				div /= 100;

			}
			return true;
		}
	}
	
	public static void main(String[] args){
		System.out.println(new PalindromeNumber().isPalindrome(1001));
	}
}
