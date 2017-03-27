package com.leetcode.easy;

public class ReverseStringII {
	public String reverseStr(String s, int k) {
		int i = 0;
		int n = s.length();
		char[] strArr = s.toCharArray();
		while (i < n) {
			int j = Math.min(i + k - 1, n - 1);
			swap(strArr, i, j);
			i += 2 * k;
		}
		return String.valueOf(strArr);
	}

	public void swap(char[] strArr, int i, int j) {
		while (i < j) {
			char temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
			j--;
			i++;
		}
	}
}
