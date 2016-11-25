package com.leetcode.easy;

public class SumLeaftLeaves {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int sumOfLeftLeaves(TreeNode root) {
		int res = 0;
		if (root != null) {
			if (isLeaf(root.left)) {
				res += root.left.val;
			} else {
				res += sumOfLeftLeaves(root.left);
			}
			res += sumOfLeftLeaves(root.right);
		}
		return res;
	}

	public boolean isLeaf(TreeNode node) {
		if (node == null)
			return false;
		else if (node.left == null && node.right == null)
			return true;
		else
			return false;
	}
}
