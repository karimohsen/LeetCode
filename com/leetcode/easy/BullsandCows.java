package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BullsandCows {
	public String getHint(String secret, String guess) {
		Map<Integer, Character> map = new HashMap<>();
		int bulls = 0;
		int cows = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < secret.length(); i++) {
			if (guess.charAt(i) == secret.charAt(i)) {
				bulls++;
				set.add(i);
			} else {
				map.put(i, secret.charAt(i));
			}
		}
		for (Entry<Integer, Character> entry : map.entrySet()) {
			for (int i = 0; i < guess.length(); i++) {
				if (guess.charAt(i) == entry.getValue() && !set.contains(i)) {
					set.add(i);
					cows++;
					break;
				}
			}
		}
		return bulls + Character.toString('A') + cows + Character.toString('B');
	}
}
