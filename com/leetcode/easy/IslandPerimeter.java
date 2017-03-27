package com.leetcode.easy;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					if (j == 0) {
						perimeter++; // left
					}
					if (j == grid[i].length - 1) {
						perimeter++;// right
					}
					if (i == 0) {
						perimeter++;// up
					}
					if (i == grid.length - 1) {
						perimeter++; // down
					}
					if (j > 0) {
						if (grid[i][j - 1] == 0) {
							perimeter++; // left
						}
					}
					if (j < grid[i].length - 1) {
						if (grid[i][j + 1] == 0) {
							perimeter++; // right
						}
					}
					if (i > 0) {
						if (grid[i - 1][j] == 0) {
							perimeter++; // up
						}
					}
					if (i < grid.length - 1) {
						if (grid[i + 1][j] == 0) {
							perimeter++; // down
						}
					}
				}
			}
		}
		return perimeter;
	}
}
