package com.leetcode.easy;

public class RemoveLinkedListElements {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode temp = head;
		while (temp != null) {
			if (temp.val == val && temp == head) {
				if (temp.next != null) {
					temp = temp.next;
					head = temp;
					continue;
				} else {
					return null;
				}
			} else if (temp.next != null && temp.next.val == val) {
				if (temp.next.next != null) {
					temp.next = temp.next.next;
					continue;
				} else {
					temp.next = null;
					break;
				}
			}

			temp = temp.next;

		}

		return head;
	}
}
