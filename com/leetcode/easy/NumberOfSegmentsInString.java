package com.leetcode.easy;

public class NumberOfSegmentsInString {
	public int countSegments(String s) {
		int count = 0;
		if (s == null || s.length() == 0)
			return 0;
		boolean notSpaceCharFound = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && notSpaceCharFound) {
				notSpaceCharFound = false;
				count += 1;
			} else if (s.charAt(i) != ' ') {
				notSpaceCharFound = true;
			}
		}
		if (notSpaceCharFound)
			count += 1;
		return count;
	}
}
