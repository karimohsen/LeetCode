package com.leetcode.normal;

public class AddTwoNumbers {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		ListNode res = new ListNode(0);
		ListNode head = res;
		int carry = 0;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			head.next = new ListNode(carry % 10);
			carry /= 10;
			head = head.next;

		}
		if (carry != 0) {
			head.next = new ListNode(carry);
		}
		return res.next;
	}
}
