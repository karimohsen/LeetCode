package com.leetcode.easy;

public class GuessNumHighOrLow {
	boolean intialized = true;
	public int guessedNum;

	public int guessNumber(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			int result = guess(mid);
			if (result == 0)
				return mid;
			else if (result == 1) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public int guess(int num) {
		if (intialized) {
			intialized = false;
			guessedNum = (int) (Math.random() * num + 1);
			return guessedNum;
		} else {
			if (guessedNum > num)
				return 1;
			else if (guessedNum < num)
				return -1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		GuessNumHighOrLow guessNum = new GuessNumHighOrLow();
		guessNum.guess(100);
		System.out.println(guessNum.guessNumber(100));
	}
}
