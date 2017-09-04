package com.leetcode.easy;

public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if ((r * c) > (nums.length * nums[0].length))
			return nums;
		else {
			int column = 0, row = 0;
			int[][] tempArr = new int[r][c];
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[i].length; j++) {
					tempArr[row][column] = nums[i][j];
					if (column < c) {
						column++;
						if (column >= c) {
							column = 0;
							row++;
						}
					}
				}
			}
			return tempArr;
		}
	}
}
