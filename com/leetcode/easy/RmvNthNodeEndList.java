package com.leetcode.easy;

public class RmvNthNodeEndList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = head;
		int size = 0;
		if (head.next == null)
			return null;
		while (node != null) {
			size++;
			node = node.next;
		}
		int index = size - n;
		node = head;
		if (index == 0)
			return head.next;
		while (index != 0) {
			if (index == 1) {
				if (node.next.next != null) {
					node.next.val = node.next.next.val;
					node.next = node.next.next;
				} else {
					node.next = null;
				}
				break;
			} else {
				index--;
				node = node.next;
			}
		}
		return head;
	}
}
