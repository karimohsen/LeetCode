package com.leetcode.easy;

import java.util.Stack;

public class ImplQueueUsingStack {
	Stack<Integer> temp;
	Stack<Integer> result = new Stack<>();

	public void push(int x) {
		temp = new Stack<>();
		if (result.empty()) {
			result.push(x);
		} else {
			while (!result.isEmpty()) {
				temp.push(result.pop());
			}
			result.add(x);
			while (!temp.isEmpty()) {
				result.push(temp.pop());
			}
		}
	}

	// Removes the element from in front of queue.
	public void pop() {
		result.pop();
	}

	// Get the front element.
	public int peek() {
		return result.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return result.isEmpty();
	}
}
