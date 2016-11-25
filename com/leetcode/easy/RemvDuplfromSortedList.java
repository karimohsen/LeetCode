package com.leetcode.easy;

public class RemvDuplfromSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode node = head;
		while (node != null && node.next != null) {
			int currentVal = node.val;
			int nextVal = node.next.val;
			if (currentVal == nextVal) {
				deleteNode(node);
			} else {
				node = node.next;
			}
		}
		return head;
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val; // needless as they are already equal
		if (node.next.next != null)
			node.next = node.next.next;
		else
			node.next = null;
	}
}
