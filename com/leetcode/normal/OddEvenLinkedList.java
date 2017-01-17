package com.leetcode.normal;

public class OddEvenLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;

		ListNode result = head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenNodes = head.next;

		while (odd != null && even != null) {
			if (even.next == null)
				break;
			odd.next = even.next;
			odd = odd.next;

			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenNodes;
		return result;
	}
}
