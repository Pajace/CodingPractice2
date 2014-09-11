package leecodeoj;

import java.util.Stack;

import leecodeoj.share.TreeNode;

public class BinarySearchTree {

	public static boolean isValidBST(TreeNode root) {
		
		if (root==null) return true;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			
			if (node.left != null && node.left.val >= node.val)
				return false;
			if (node.right != null && node.right.val <= node.val)
				return false;
			
			if (node.left!=null)
				stack.push(node.left);
			if (node.right!=null)
				stack.push(node.right);
		}
		
		return true;
	}

}
