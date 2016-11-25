package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MinStack {
	 /** initialize your data structure here. */
		Stack<Integer> stack;
		List<Integer> tempList;

		public MinStack() {
			stack = new Stack<>();
			tempList = new ArrayList<>();
		}

		public void push(int x) {
			stack.push(x);
			tempList.add(x);
		}

		public void pop() {
			tempList.remove(stack.pop());
		}

		public int top() {
			return stack.peek();
		}

		public int getMin() {
			Collections.sort(tempList);
			return tempList.get(0);
		}
		
		public static void main(String[] args){
			MinStack minStack = new MinStack();
			minStack.push(-2);
			minStack.push(0);
			minStack.push(3);
			System.out.println(minStack.getMin());
			minStack.pop();
			System.out.println(minStack.top());
			System.out.println(minStack.getMin());
		}
}
