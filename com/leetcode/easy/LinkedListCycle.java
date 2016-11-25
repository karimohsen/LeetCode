package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public boolean hasCycle(ListNode head) {
        Set<ListNode> setListNode = new HashSet<>();
        while(head != null){
        	if(setListNode.add(head)){
        		head = head.next;
        	}
        	else{
        		return true;
        	}
        	
        }
        return false;
    }
}
