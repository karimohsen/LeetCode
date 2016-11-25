package com.leetcode.easy;

public class ConvertNumtoHexa {
	public String toHex(int num) {
		if (num == 0)
			return "0";
		char[] hexArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		String str = "";
		while (num != 0) {
			str = hexArr[num & 15] + str;
			num = num >>> 4;
		}
		return str;
	}
}
