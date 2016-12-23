package com.leetcode.normal;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
	public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
		Map<Integer,String> map = new HashMap<>();
		map.put(1000, "M");
		map.put(900,"CM");
		map.put(500, "D");
		map.put(400,"CD");
		map.put(100, "C");
		map.put(90,"XC");
		map.put(50, "L");
		map.put(40,"XL");
		map.put(10, "X");
		map.put(9,"IX");
		map.put(5, "V");
		map.put(4,"IV");
		map.put(1, "I");
		int [] keys = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i = 0 ; i < keys.length ; i++){
			while(num >= keys[i]){
				sb.append(map.get(keys[i]));
				num -= keys[i];
			}
		}
		return sb.toString();
    }
}
