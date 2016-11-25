package com.leetcode.easy;

public class MaxDepthTree {
	public class Node {
		int val;
		Node left;
		Node right;

		Node(int x) {
			val = x;
		}
	}

	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		int biggerNum = Math.max(left, right);
		return biggerNum + 1;
	}
}
