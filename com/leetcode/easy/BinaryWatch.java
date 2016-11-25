package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();
		for (int hours = 0; hours < 12; hours++) {
			for (int minutes = 0; minutes < 60; minutes++) {
				int digits = countDigits(hours) + countDigits(minutes);
				if (digits == num) {
					String minutesTime;
					if (minutes < 10)
						minutesTime = "0" + minutes;
					else
						minutesTime = Integer.toString(minutes);
					list.add(Integer.toString(hours) + ":" + minutesTime);
				}
			}
		}
		return list;
	}

	public int countDigits(int num) {
		int digits = 0;
		String numBinaryRep =Integer.toBinaryString(num);
		for(int i = 0 ; i < numBinaryRep.length() ;i++){
			if(numBinaryRep.charAt(i)=='1'){
				digits++;
			}
		}
		return digits;
	}
}
