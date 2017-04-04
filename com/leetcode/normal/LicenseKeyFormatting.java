package com.leetcode.normal;

public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		if (K == 0)
			return S;
		int strSize = 0;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '-') {
				str.append(Character.toUpperCase(S.charAt(i)));
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0;) {
			if (sb.length() == 0 || strSize != K) {
				sb.append(str.charAt(i));
				i--;
				strSize++;
			} else {
				sb.append('-');
				strSize = 0;
			}

		}

		return sb.reverse().toString();
	}
}
