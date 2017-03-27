package com.leetcode.easy;

public class ConstructTheRectangle {
	public int[] constructRectangle(int area) {
		int[] resArr = new int[2];
		for (int i = 1; i <= area; i++) {
			if (area % i == 0) {
				if (resArr[1] < i && i <= (area / i)) {
					resArr[0] = area / i;
					resArr[1] = i;
				}
			}
		}
		return resArr;
	}
}
