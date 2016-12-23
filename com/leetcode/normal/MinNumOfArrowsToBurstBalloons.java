package com.leetcode.normal;

import java.util.Arrays;
import java.util.Comparator;

public class MinNumOfArrowsToBurstBalloons {
	public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0)
			return 0;
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return 0;
				return o1[0] - o2[0];
			}
		});
		int minArrows = 1;
    	int arrowLimit = points[0][1];
    	for(int i=1;i<points.length;i++) {
    		if (points[i][0] > arrowLimit) {
				minArrows++;
				arrowLimit = points[i][1];
			} else {
				arrowLimit = Math.min(arrowLimit, points[i][1]);
			}
    	}
	return minArrows;
    }
}
