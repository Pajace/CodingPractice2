package leecodeoj;

import java.util.Stack;

import leecodeoj.share.TreeNode;

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;
		else if (p == null || q == null)
			return false;

		Stack<TreeNode> rootStack1 = new Stack<TreeNode>();
		Stack<TreeNode> rootStack2 = new Stack<TreeNode>();

		rootStack1.push(p);
		rootStack2.push(q);

		while (!rootStack1.empty()) {
			TreeNode node1 = rootStack1.pop();
			TreeNode node2 = rootStack2.pop();

			if (node1.val != node2.val)
				return false;

			if (node1.left != null && node2.left != null) {
				rootStack1.push(node1.left);
				rootStack2.push(node2.left);
			} else if (node1.left == null && node2.left == null) {
			} else {
				return false;
			}

			if (node1.right != null && node2.right != null) {
				rootStack1.push(node1.right);
				rootStack2.push(node2.right);
			} else if (node1.right == null && node2.right == null) {
			} else {
				return false;
			}
		}

		return true;
	}

}
