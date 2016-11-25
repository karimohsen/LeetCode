package com.leetcode.easy;

public class SwapNodesPairs {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		ListNode node = head;
		while (node != null && node.next != null) {
			int temp = node.next.val;
			node.next.val = node.val;
			node.val = temp;
			node = node.next.next;
		}
		return head;
	}
}
