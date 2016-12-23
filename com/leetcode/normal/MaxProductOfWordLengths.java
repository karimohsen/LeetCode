package com.leetcode.normal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxProductOfWordLengths {
	public int maxProduct(String[] words) {
        int result = 0;
		List<Set<Character>> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			Set<Character> set = new HashSet<>();
			for (int j = 0; j < words[i].length(); j++) {
				set.add(words[i].charAt(j));
			}
			list.add(set);
		}
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			for (int k = i + 1; k < list.size(); k++) {
			    flag = false;
				for (Character ch : list.get(i)){
					if (list.get(k).contains(ch)) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					int temp = words[k].length() * words[i].length();
					if (result < temp) {
						result = temp;
					}
				}
			}
		}
		return result;   
    }
}
