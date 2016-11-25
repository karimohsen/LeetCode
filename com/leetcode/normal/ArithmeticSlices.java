package com.leetcode.normal;

public class ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] A) {
		int count = 0;
		if (A.length < 3)
			return 0;
		int diff = calculateDiff(A[0], A[1]);
		int size = 2;
		for (int i = 1; i < A.length - 1; i++) {
			if (calculateDiff(A[i], A[i + 1]) == diff) {
				size++;
			} else {
				count += calculateNumberOfIntersections(size);
				size = 2;
				diff = calculateDiff(A[i], A[i + 1]);
			}
		}
		count += calculateNumberOfIntersections(size);
		return count;
	}

	int calculateNumberOfIntersections(int num) {
		int numOfIntersections = 3;
		if (num < 3)
			return 0;
		else if (num == 3)
			return 1;
		else if (num == 4)
			return 3;
		else {
			int n = num - 4;
			int diff = 2;
			for (int i = 0; i < n; i++) {
				diff += 1;
				numOfIntersections += diff;
			}
			return numOfIntersections;
		}
	}

	int calculateDiff(int num1, int num2) {
		int diff;
		diff = num1 - num2;
		return diff;
	}
}
