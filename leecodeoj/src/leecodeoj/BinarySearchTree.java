package leecodeoj;

import java.util.Stack;

import leecodeoj.share.TreeNode;

public class BinarySearchTree {

	public static boolean isValidBST(TreeNode node) {
		
		boolean isBST = true;
//		TreeNode node = root;
		Stack<TreeNode> parentStack = new Stack<TreeNode>();
		int minValue = Integer.MIN_VALUE;
		
		while( !parentStack.isEmpty() || node != null){
			if (node != null){
				parentStack.add(node);
				node = node.left;
			} else {
				node = parentStack.pop();
				System.out.print(node.val + ", ");
				if (minValue >= node.val){
					isBST = false;
					break;
				} else {
					minValue = node.val;
				}
				node = node.right;
			}
		}
		return isBST;
	}

}
