package com.leetcode.easy;

import java.util.Stack;

public class JudgeRouteCircle {
	public boolean judgeRouteCircle(String moves) {
		Stack<Character> Lstack = new Stack<>();
		Stack<Character> Rstack = new Stack<>();
		Stack<Character> Ustack = new Stack<>();
		Stack<Character> Dstack = new Stack<>();
		for (int i = 0; i < moves.length(); i++) {
			char c = moves.charAt(i);
			if (c == 'U') {
				if (!Dstack.isEmpty()) {
					Dstack.pop();
				} else {
					Ustack.push(c);
				}
			} else if (c == 'D') {
				if (!Ustack.isEmpty()) {
					Ustack.pop();
				} else {
					Dstack.push(c);
				}
			} else if (c == 'R') {
				if (!Lstack.isEmpty()) {
					Lstack.pop();
				} else {
					Rstack.push(c);
				}
			} else {
				if (!Rstack.isEmpty()) {
					Rstack.pop();
				} else {
					Lstack.push(c);
				}
			}
		}
		return Lstack.isEmpty() && Ustack.isEmpty() && Dstack.isEmpty() && Rstack.isEmpty();
	}

}
