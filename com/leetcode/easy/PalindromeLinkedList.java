package com.leetcode.easy;

public class PalindromeLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		ListNode p = head;
		ListNode prev = new ListNode(head.val);
		while (p.next != null) {
			ListNode temp = new ListNode(p.next.val);
			temp.next = prev;
			prev = temp;
			p = p.next;
		}
		ListNode end = prev;
		while (head != null) {
			if (head.val != end.val)
				return false;
			head = head.next;
			end = end.next;
		}
		return true;
	}
}
