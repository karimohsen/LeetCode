package com.leetcode.easy;

public class ReverseInteger {
	public int reverse(int x) {
		long num = x;
		boolean negative = false;
		if (num < 0) {
			num *= -1;
			negative = true;
		}
		long result = 0;
		while (num > 0) {
			result *= 10;
			result += (num % 10);
			num /= 10;
		}
		if (result > Integer.MAX_VALUE)
			return 0;

		return negative ? (-1 * (int) result) : (int) result;
	}

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(0));
		int high = Integer.MAX_VALUE;
		int overflow = high + 1;
		int low = Integer.MIN_VALUE;
		int underflow = low + 1;
		System.out.println(underflow);
		System.out.println(overflow);
	}
}
