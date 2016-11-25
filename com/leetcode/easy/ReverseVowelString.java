package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelString {
	public String reverseVowels(String s) {
		char[] stringArr = s.toCharArray();
		Set<Character> vowelSet = new HashSet<>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('i');
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (!vowelSet.contains(Character.toLowerCase(stringArr[i]))) {
				i++;
				continue;
			}
			if (!vowelSet.contains(Character.toLowerCase(stringArr[j]))) {
				j--;
				continue;
			}
			char temp = stringArr[i];
			stringArr[i] = stringArr[j];
			stringArr[j] = temp;
			i++;
			j--;
		}
		return new String(stringArr);
	}

	public static void main(String[] args) {
		System.out.println(new ReverseVowelString().reverseVowels("race car"));
	}
}
