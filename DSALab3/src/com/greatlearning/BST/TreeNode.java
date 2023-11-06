package com.greatlearning.BST;

public class TreeNode {
	int val;
	TreeNode right, left;

	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}

	public TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}
}
