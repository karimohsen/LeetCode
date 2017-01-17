package com.leetcode.normal;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer, Integer> firstMap = new HashMap<>();
		Map<Integer, Integer> secondMap = new HashMap<>();
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (firstMap.containsKey(A[i] + B[j])) {
					firstMap.put(A[i] + B[j], firstMap.get(A[i] + B[j]) + 1);
				} else {
					firstMap.put(A[i] + B[j], 1);
				}
				if (secondMap.containsKey(C[i] + D[j])) {
					secondMap.put(C[i] + D[j], secondMap.get(C[i] + D[j]) + 1);
				} else {
					secondMap.put(C[i] + D[j], 1);
				}
			}
		}
		for (int n : firstMap.keySet()) {
			if (secondMap.containsKey(-n)) {
				result += secondMap.get(-n) * firstMap.get(n);
			}
		}
		return result;
	}
}
