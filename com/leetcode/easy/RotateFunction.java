package com.leetcode.easy;

public class RotateFunction {
	public int maxRotateFunction(int[] A) {
		if(A == null || A.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = 0;
			for (int j = 0; j < A.length; j++) {
				sum += (j * A[j]);
			}
			rotateArray(A);
			max = Math.max(sum, max);
		}
		return max;
	}

	public void rotateArray(int[] arr) {
		int last = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = last;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 6 };
		System.out.println(new RotateFunction().maxRotateFunction(arr));
	}
}
