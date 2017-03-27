package com.leetcode.easy;

public class NumberComplement {
	public int findComplement(int num) {
        if (num == 0)
			return 1;
		return num ^ ((Integer.highestOneBit(num) << 1) - 1);
    }
}
