package com.leetcode.easy;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			char ch = (char) ((n % 26) + 'A');
			sb.append(ch);
			n /= 26;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(new ExcelSheetColumnTitle().convertToTitle(676));
	}
}
