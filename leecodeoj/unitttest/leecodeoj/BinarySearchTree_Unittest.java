package leecodeoj;

import leecodeoj.share.TreeNode;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTree_Unittest {

	private void validateBST(TreeNode root, boolean expected) {
		boolean actual = BinarySearchTree.isValidBST(root);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void ValidateBST_ItsBST() {
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node8 = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node10 = new TreeNode(10);

		node5.left = node4;
		node5.right = node8;
		node4.left = node3;
		node8.left = node6;
		node8.right = node10;

		validateBST(node5, true);
	}

	@Test
	public void ValidateBST_ItsNotBST() {
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node8 = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node10 = new TreeNode(10);

		node5.left = node4;
		node5.right = node8;
		node4.right = node3;
		node8.left = node6;
		node8.right = node10;

		validateBST(node5, false);
	}

	@Test
	public void ValidateBST_EmptyBST() {
		validateBST(null, true);
	}

	@Test
	public void ValidateBST_LeftSkewBST() {
		TreeNode node10 = new TreeNode(10);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);

		node10.left = node5;
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		node2.left = node1;

		validateBST(node5, true);
	}

	@Test
	public void ValidateBST_RightSkewBST() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		node5.right = node6;

		validateBST(node5, true);
	}

	@Test
	public void ValidateBST_NotBST(){
		TreeNode root = new TreeNode(10);
		TreeNode node5 = new TreeNode(5);
		TreeNode node15 = new TreeNode(15);
		TreeNode node6 = new TreeNode(6);
		TreeNode node20 = new TreeNode(20);
		
		root.left = node5;
		root.right = node15;
		node15.left = node6;
		node15.right = node20;
		
		validateBST(root, false);
	}
}
