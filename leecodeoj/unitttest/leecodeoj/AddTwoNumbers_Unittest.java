package leecodeoj;

import leecodeoj.share.ListNode;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbers_Unittest {

	private void AssertAddTwoNumber(ListNode root1, ListNode root2,
			ListNode expected) {
		ListNode actual = AddTwoNumber.addTwoNumbers(root1, root2);

		while (actual != null && expected != null) {
			Assert.assertEquals(expected.val, actual.val);

			actual = actual.next;
			expected = expected.next;
		}

		if (expected != null || actual != null)
			Assert.fail("Actual or Expected is not null.");
	}

	@Test
	public void AddTwoNumbers_True() {
		ListNode root1 = new ListNode(2);
		ListNode node11 = new ListNode(4);
		ListNode node12 = new ListNode(3);

		root1.next = node11;
		node11.next = node12;

		ListNode root2 = new ListNode(5);
		ListNode node21 = new ListNode(6);
		ListNode node22 = new ListNode(4);
		root2.next = node21;
		node21.next = node22;

		ListNode expected = new ListNode(7);
		ListNode expected1 = new ListNode(0);
		ListNode expected2 = new ListNode(8);
		expected.next = expected1;
		expected1.next = expected2;

		AssertAddTwoNumber(root1, root2, expected);
	}
	
	@Test
	public void AddTwoNumbers_OneElementOver10(){
		ListNode root1 = new ListNode(5);
		ListNode root2 = new ListNode(5);
		
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(1);
		
		AssertAddTwoNumber(root1, root2, expected);
	}
	
	@Test
	public void AddTwoNumbers_TwoElementOver10(){
		ListNode root1 = new ListNode(9);
		root1.next = new ListNode(8);
		
		ListNode root2 = new ListNode(1);
		
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(9);
		
		AssertAddTwoNumber(root1, root2, expected);
	}
	
	@Test
	public void AddTwoNumbers_ThreeElementOver10(){
		ListNode root1 = new ListNode(1);
		
		ListNode root2 = new ListNode(9);
		root2.next = new ListNode(9);
		
		ListNode expected = new ListNode(0);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(1);
		
		AssertAddTwoNumber(root1, root2, expected);
	}
	
	@Test
	public void AddTwoNumbers_TwoElementOver10Twice(){
		ListNode root1 = new ListNode(9);
		root1.next = new ListNode(9);
		
		ListNode root2 = new ListNode(9);
		root2.next = new ListNode(9);
		
		ListNode expected = new ListNode(8);
		expected.next = new ListNode(9);
		expected.next.next = new ListNode(1);
		
		AssertAddTwoNumber(root1, root2, expected);
	}

}
