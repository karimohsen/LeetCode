package com.leetcode.easy;

public class SumOfTwoIntegers {
	public int getSum(int a, int b) {
		while (b!=0){
			int c = a&b;
			a = a^b;
			b = c << 1;
		}
		return a;
	}
	public static void main (String [] args){
		System.out.println(new SumOfTwoIntegers().getSum(2147483647,-2147483648));
	}
}
