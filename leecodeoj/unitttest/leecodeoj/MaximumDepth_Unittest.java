package leecodeoj;

import static org.junit.Assert.assertEquals;
import leecodeoj.share.TreeNode;

import org.junit.Test;

public class MaximumDepth_Unittest {
	
	@Test
	public void MaximumDepth_Solution() {
		TreeNode root = new TreeNode(1);

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		root.left = node1;
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;

		int expected = 5;
		
		MaximumDepth m = new MaximumDepth();
		int actual = m.maxDepthOfBinaryTree(root);
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void MaximumDepth_0(){
		MaximumDepth m = new MaximumDepth();
		int actual = m.maxDepthOfBinaryTree(null);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void MaximumDepth_5(){
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		TreeNode node12 = new TreeNode(12);
		
		node1.left = node2;
		node1.right = node3;		
		node2.left = node4;
		node2.right = node5;		
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node5.right = node9;
		node7.left = node11;
		node7.right=node10;
		node11.right = node12;
		
		MaximumDepth m = new MaximumDepth();
		int actual = m.maxDepthOfBinaryTree(node1);
		
		assertEquals(5, actual);
	}

}
