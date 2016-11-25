package com.leetcode.easy;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		StringBuilder strResult = new StringBuilder();
		int step = (2 * numRows) - 2;
		for (int count = 0; count < numRows; count++) {
			if (count == 0 || count == numRows - 1) {
				for (int i = count; i < s.length(); i += step) {
					strResult.append(s.charAt(i));
				}
			} else {
				int j = count;
				int step1 = 2 * (numRows - 1 - count);
				int step2 = step - step1;
				boolean flag = true;
				while (j < s.length()) {
					strResult.append(s.charAt(j));
					if (flag)
						j += step1;
					else
						j += step2;
					flag = !flag;
				}
			}
		}
		return strResult.toString();
	}

	public static void main(String[] args) {
		System.out.println(new ZigZagConversion().convert("ABCDEFG", 3));
	}
}
