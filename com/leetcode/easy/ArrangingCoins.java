package com.leetcode.easy;

public class ArrangingCoins {
	public int arrangeCoins(int n) {
		if (n == 0)
			return n;
		int rowNum = 1;
		long numOfConis = 0;
		while (numOfConis < n) {
			numOfConis += rowNum;
			if (numOfConis < n)
				rowNum++;
			else if (numOfConis > n)
				rowNum--;
			else
				break;
		}
		return rowNum;
	}

	public static void main(String[] args) {
		System.out.println(new ArrangingCoins().arrangeCoins(6));
	}
}
