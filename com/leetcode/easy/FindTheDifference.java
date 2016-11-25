package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
        char c = '0';
        Map<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
        	if(map.containsKey(t.charAt(i))){
        		map.put(t.charAt(i), map.get(t.charAt(i))+1);
        	}
        	else{
        		map.put(t.charAt(i), 1);
        	}
        }
        for(int i = 0 ; i < s.length() ; i++){
        	if(map.containsKey(s.charAt(i))){
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        }
        for(Entry<Character,Integer>entry : map.entrySet() ){
        	if(entry.getValue()%2 != 0)
        		return entry.getKey();
        }
        return c;
    }
}
