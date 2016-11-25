package com.leetcode.easy;

public class AddStrings {
	public String addStrings(String num1, String num2) {
		if (num1.length() == 1 && num2.length() == 1) {
			Integer num = (num1.charAt(0) - '0') + (num2.charAt(0) - '0');
			return num.toString();
		} else if (num1.length() == 1 && num2.length() == 0) {
			return num1;
		} else if (num1.length() == 0 && num2.length() == 1) {
			return num2;
		}
		int size = Math.max(num1.length(), num2.length());
		int[] numArr1 = new int[size];
		int[] numArr2 = new int[size];
		char[] result = new char[size + 1];
		int factor = 1;
		for (int i = num1.length() - 1; i >= 0; i--) {
			numArr1[size - factor] = num1.charAt(i) - '0';
			factor++;
		}
		factor = 1;
		for (int i = num2.length() - 1; i >= 0; i--) {
			numArr2[size - factor] = num2.charAt(i) - '0';
			factor++;

		}
		int carry = 0;
		for (int i = size - 1; i >= 0; i--) {
			result[size--] = (char) (((numArr1[i] + numArr2[i] + carry) % 10) + '0');
			carry = (numArr1[i] + numArr2[i] + carry) / 10;
		}
		result[0] = (char) (carry + '0');
		int count = 0;
		while (result[count] == '0') {
			count++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = count; i < result.length; i++) {
			sb.append(result[i]);
		}
		return sb.toString();
	}
}
