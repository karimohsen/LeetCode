package com.leetcode.easy;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length != 9 || board[0].length != 9)
			return false;
		for (int i = 0; i < board.length; i++) {
			boolean[] arr = new boolean[9];
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (arr[board[i][j] - '0' - 1] == true || (board[i][j] - '0' - 1) > 8)
						return false;
					else
						arr[board[i][j] - '0' - 1] = true;
				}
			}
		}

		for (int i = 0; i < board.length;) {
			for (int j = 0; j < board[i].length; j++) {
				boolean[] arr = new boolean[9];
				for (int k = 0; k < board.length; k++) {
					if (board[k][j] != '.') {
						if (arr[board[k][j] - '0' - 1] == true || (board[k][j] - '0' - 1) > 8)
							return false;
						else
							arr[board[k][j] - '0' - 1] = true;
					}
				}
			}
			break;
		}
		for (int block = 0; block < 9; block++) {
			boolean[] arr = new boolean[9];
			for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
				for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
					if (board[i][j] != '.') {
						if (arr[board[i][j] - '0' - 1]) {
							return false;
						}
						arr[board[i][j] - '0' - 1] = true;
					}
				}
			}
		}
		return true;
	}
}
