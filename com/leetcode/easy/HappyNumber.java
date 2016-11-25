package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		if (Math.pow(n, 2) == 1) {
			return true;
		} else {
			Set<Integer> set = new HashSet<>();
			while (!set.contains(n)) {
				set.add(n);
				n = getSum(n);
				if (n == 1)
					return true;
			}
		}
		return false;
	}

	public int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			int temp = n % 10;
			sum += temp * temp;
			n /= 10;
		}
		return sum;
	}
}
