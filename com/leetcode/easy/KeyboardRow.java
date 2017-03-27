package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
	public String[] findWords(String[] words) {
		if (words == null)
			return null;
		String[] res = null;
		Set<Set<Character>> set = new HashSet<>();
		Set<Character> temp1 = new HashSet<>();
		temp1.add('q');
		temp1.add('w');
		temp1.add('e');
		temp1.add('r');
		temp1.add('t');
		temp1.add('y');
		temp1.add('u');
		temp1.add('i');
		temp1.add('o');
		temp1.add('p');
		set.add(temp1);
		Set<Character> temp2 = new HashSet<>();
		temp2.add('a');
		temp2.add('s');
		temp2.add('d');
		temp2.add('f');
		temp2.add('g');
		temp2.add('h');
		temp2.add('j');
		temp2.add('k');
		temp2.add('l');
		set.add(temp2);
		Set<Character> temp3 = new HashSet<>();
		temp3.add('z');
		temp3.add('x');
		temp3.add('c');
		temp3.add('v');
		temp3.add('b');
		temp3.add('n');
		temp3.add('m');
		set.add(temp3);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			boolean flag = false;
			for (Set<Character> tempSet : set) {
				if (flag == true)
					break;
				flag = false;
				int size = 0;
				for (int j = 0; j < words[i].length(); j++) {
					if (tempSet.contains(Character.toLowerCase(words[i].charAt(j)))) {
						flag = true;
						size++;
						continue;
					} else {
						break;
					}
				}
				if (size == words[i].length())
					list.add(words[i]);
			}
		}
		if (list.size() == 0) {
			res = new String[0];
			return res;
		}
		res = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
			res[i] = list.get(i);
		return res;
	}
}
