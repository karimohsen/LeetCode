package com.leetcode.normal;

public class CountingBits {
	public int[] countBits(int num) {
		int[] res = new int[num + 1];
		int pow = 1;
		int index = 1;
		for (int i = 1; i <= num; i++) {
			if (i == pow) {
				res[i] = 1;
				pow *= 2;
				index = i;
			} else {
				res[i] = res[index] + res[i - index];
			}
		}
		return res;
	}
}
