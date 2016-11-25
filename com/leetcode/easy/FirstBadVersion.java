package com.leetcode.easy;

public class FirstBadVersion {
	boolean intialized = true;
	public int badVersion;

	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		int mid = ((high - low) / 2) + low;
		while (low < high) {
			if (!isBadVersion(mid)) {
				low = mid + 1;
				mid = low + (high - low) / 2;
			} else {
				high = mid;
				mid = low + (high - low) / 2;
			}
		}
		return mid;
	}

	public boolean isBadVersion(int num) {
		if (intialized) {
			intialized = false;
			badVersion = (int) (Math.random() * num + 1);
			return true;
		} else {
			if (badVersion >= num)
				return true;
			else
				return false;
		}
	}
}
