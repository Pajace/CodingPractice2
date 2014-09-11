package leecodeoj;

import static org.junit.Assert.assertEquals;
import leecodeoj.share.TreeNode;

import org.junit.Test;

public class SameTree_Unittest {

	private void assertIsTheSameTree(TreeNode root1, TreeNode root2,
			boolean expected) {
		SameTree st = new SameTree();
		boolean actual = st.isSameTree(root1, root2);

		assertEquals(expected, actual);
	}

	@Test
	public void SameTree_isSameTree_True() {
		TreeNode root1 = createTreeNode9NodeType1_value1();
		TreeNode root2 = createTreeNode9NodeType1_value1();

		boolean expected = true;
		assertIsTheSameTree(root1, root2, expected);
	}

	@Test
	public void SameTree_isSameTree_false() {
		TreeNode root1 = createTreeNode9NodeType1_value1();
		TreeNode root2 = createTreeNode9NodeType1_value2();

		boolean expected = false;
		assertIsTheSameTree(root1, root2, expected);
	}

	@Test
	public void SameTree_isSameTree_Both0() {
		assertIsTheSameTree(null, null, true);
	}

	// 1
	// / \
	// 2 3
	// / \ /\
	// 4 5 6 7
	// / \
	// 8 9
	private TreeNode createTreeNode9NodeType1_value1() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node7.right = node9;

		return node1;
	}

	// 1
	// / \
	// 2 5
	// / \ /\
	// 3 4 6 7
	// / \
	// 8 9
	private TreeNode createTreeNode9NodeType1_value2() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);

		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node2.right = node4;
		node3.left = node8;
		node5.left = node6;
		node5.right = node7;
		node7.right = node9;

		return node1;
	}

}
