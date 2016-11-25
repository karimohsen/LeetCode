package com.leetcode.easy;

public class ReverseLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		if(head.next == null || head == null)
			return head;
		ListNode node1 = head;
		ListNode node2 = node1.next;
		head.next = null;
		while (node1 != null && node2 != null){
			ListNode temp = node2.next;
			node2.next = node1;
			node1 = node2;
			node2 = temp;
		}
		return node1;
	}
}
