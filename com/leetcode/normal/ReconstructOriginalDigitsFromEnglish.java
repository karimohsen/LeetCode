package com.leetcode.normal;

public class ReconstructOriginalDigitsFromEnglish {
	 public String originalDigits(String s) {
       int[] arr = new int[10];
		if (s == null || s.length() < 3)
			return "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'z') {
				arr[0]++;
				continue;
			}
			if (c == 'u') {
				arr[4]++;
				continue;
			}
			if (c == 'w') {
				arr[2]++;
				continue;
			}
			if (c == 'x') {
				arr[6]++;
				continue;
			}
			if (c == 'g') {
				arr[8]++;
				continue;
			}
			if (c == 's') {
				arr[7]++;
			}
			if (c == 'f') {
				arr[5]++;
			}
			if (c == 'h') {
				arr[3]++;
			}
			if (c == 'i') {
				arr[9]++;
			}
			if (c == 'o') {
				arr[1]++;
			}
		}
		arr[7] -= arr[6];
		arr[5] -= arr[4];
		arr[3] -= arr[8];
		arr[9] = arr[9] - arr[8] - arr[6] - arr[5];
		arr[1] = arr[1] - arr[2] - arr[4] - arr[0];
		StringBuilder sb = new StringBuilder();
		for(int i  = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < arr[i] ;j++){
				sb.append(i);
			}
		}
		return sb.toString(); 
    }
}
