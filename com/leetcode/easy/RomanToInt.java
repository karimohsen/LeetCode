package com.leetcode.easy;

public class RomanToInt {
	public int romanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result += romanValue(s.charAt(i));
			if (i != 0) {
				if (romanValue(s.charAt(i - 1)) < romanValue(s.charAt(i))) {
					result -= (romanValue(s.charAt(i - 1))+romanValue(s.charAt(i - 1)));
				}
			}
		}
		return result;
	}

	public int romanValue(char ch) {
		int num;
		switch (ch) {
		case 'I':
			num = 1;
			break;
		case 'V':
			num = 5;
			break;
		case 'X':
			num = 10;
			break;
		case 'L':
			num = 50;
			break;
		case 'C':
			num = 100;
			break;
		case 'D':
			num = 500;
			break;
		case 'M':
			num = 1000;
			break;
		default:
			num = 0;
			break;
		}
		return num;
	}
	
	public static void main (String [] args){
		System.out.println(new RomanToInt().romanToInt("MXXIV"));
	}
}
