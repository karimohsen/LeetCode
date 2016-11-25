package com.leetcode.easy;

public class InvertBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			invert(root);
		}
		return root;
	}

	public void invert(TreeNode node) {
		TreeNode temp = node.right;
		node.right = node.left;
		node.left = temp;
		if (node.left != null)
			invert(node.left);
		if (node.right != null)
			invert(node.right);
	}

}
