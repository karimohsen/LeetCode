package com.leetcode.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructByHeight {
	public int[][] reconstructQueue(int[][] people) {
		if (people.length == 0)
			return people;
		Arrays.sort(people, new CustomComparator());
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			list.add(people[i][1], people[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			people[i] = list.get(i);
		}
		return people;
	}

	class CustomComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] o1, int[] o2) {
			if (o1[0] > o2[0])
				return -1;
			else if (o1[0] < o2[0])
				return 1;
			else {
				return o1[1] - o2[1];
			}
		}
	}
}
