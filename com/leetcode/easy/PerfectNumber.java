package com.leetcode.easy;

public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {
        int sum = 1;
	    for (int i=2;i<Math.sqrt(num);i++) 
	        if (num % i == 0) sum += i + (num/i == i ? 0 : num/i);
	    return num != 1 && sum == num;
    }
}
