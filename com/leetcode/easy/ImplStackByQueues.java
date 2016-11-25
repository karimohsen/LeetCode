package com.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplStackByQueues {
	Queue<Integer> q = new LinkedList<>();

	public void push(int x) {
		Queue<Integer> temp = new LinkedList<>();
		while (!q.isEmpty()) {
			temp.add(q.poll());
		}
		q.add(x);
		while (!temp.isEmpty()) {
			q.add(temp.poll());
		}

	}

	// Removes the element on top of the stack.
	public void pop() {
		q.poll();
	}

	// Get the top element.
	public int top() {
		return q.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q.isEmpty();
	}
}
