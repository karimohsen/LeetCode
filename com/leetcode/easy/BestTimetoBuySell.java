package com.leetcode.easy;

public class BestTimetoBuySell {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 1 || prices.length == 0)
			return 0;
		int maxProfit = 0;
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			maxProfit = Math.max(prices[i] - min, maxProfit);
			min = Math.min(min, prices[i]);
		}
		return maxProfit;
	}
}
