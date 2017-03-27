package com.leetcode.easy;

public class DetectCapital {
	public boolean detectCapitalUse(String word) {
		boolean firstCapital = false;
		boolean lowercaseLetter = false;
		boolean uppercaseLetter = false;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				if (i == 0) {
					firstCapital = true;
				} else {
					uppercaseLetter = true;
					if (!firstCapital) {
						return false;
					} else if (lowercaseLetter) {
						return false;
					}
				}
			} else {
				if (uppercaseLetter) {
					return false;
				} else {
					lowercaseLetter = true;
				}
			}
		}
		return true;
	}
}
