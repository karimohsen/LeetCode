package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i < ransomNote.length() ;i++){
        	if(map.containsKey(ransomNote.charAt(i))){
        	map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))+1);
        	}
        	else{
        		map.put(ransomNote.charAt(i), 1);
        	}
        }
        for(int i = 0 ; i < magazine.length() ;i++){
        	if(map.containsKey(magazine.charAt(i))){
        		map.put(magazine.charAt(i), map.get(magazine.charAt(i))-1);	
        	}
        }
        for(Entry<Character, Integer>entry : map.entrySet()){
        	if(entry.getValue() > 0){
        		return false;
        	}
        }
        return true;
    }
}
