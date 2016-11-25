package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0) {
			return result;
		} else if (numRows == 1) {
			List<Integer> list1 = new ArrayList<>();
			list1.add(1);
			result.add(list1);
			return result;
		} else if (numRows == 2) {
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			list1.add(1);
			result.add(list1);
			list2.add(1);
			list2.add(1);
			result.add(list2);
			return result;
		} else {
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			list1.add(1);
			result.add(list1);
			list2.add(1);
			list2.add(1);
			result.add(list2);
			for (int i = 2; i < numRows; i++) {
				List<Integer> temp = new ArrayList<>();
				temp.add(1);
				for (int j = 1; j < result.get(i - 1).size(); j++) {
					temp.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
				}
				temp.add(1);
				result.add(temp);
			}
			return result;
		}
	}
}
