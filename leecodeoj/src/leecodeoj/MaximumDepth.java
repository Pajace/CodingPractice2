package leecodeoj;

import java.util.Stack;

import leecodeoj.share.TreeNode;

public class MaximumDepth {

	public int maxDepthOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;

		int depth = 0;
		Stack<TreeNode> wq = new Stack<TreeNode>();
		Stack<TreeNode> path = new Stack<TreeNode>();

		wq.push(root);
		while (!wq.empty()) {
			root = wq.peek();
			if (!path.empty() && root == path.peek()) {
				if (path.size() > depth)
					depth = path.size();
				path.pop();
				wq.pop();
			} else {
				path.push(root);
				if (root.right != null)
					wq.push(root.right);
				if (root.left != null)
					wq.push(root.left);
			}
		}

		return depth;
	}
}
