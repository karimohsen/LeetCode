package com.leetcode.easy;

public class CountAndSay {
	public String countAndSay(int n) {
		String result = "1";
		int count, loopCount = 1;
		while (loopCount < n) {
			count = 1;
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j - 1) == result.charAt(j)) {
					count++;
				} else {
					strBuilder.append(Integer.toString(count) + result.charAt(j - 1));
					count = 1;
				}
			}
			strBuilder.append(Integer.toString(count) + result.charAt(result.length() - 1));
			result = strBuilder.toString();
			loopCount++;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(3));
	}
}
