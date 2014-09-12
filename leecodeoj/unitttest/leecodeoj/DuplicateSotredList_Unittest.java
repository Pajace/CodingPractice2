package leecodeoj;


import leecodeoj.share.ListNode;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateSotredList_Unittest {


	private void AssertDuplicateSortedList(ListNode node, ListNode expected) {
		DuplicateSortedList duplicateSortedList = new DuplicateSortedList();
		ListNode actual = duplicateSortedList.removeDuplicates(node);
		
		while(expected != null) {
			Assert.assertEquals(expected.val, actual.val);
			
			actual = actual.next;
			expected = expected.next;
		}
		
		Assert.assertNull(actual);
	}
	
	@Test
	public void Duplicate_ThreeNode_OneDuplicate() {
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		
		ListNode expected = new ListNode(1);
		expected.next = new ListNode(2);
		
		AssertDuplicateSortedList(node, expected);
	}
	
	@Test
	public void Duplicate_EmptyTree_NoDuplicate(){		
		AssertDuplicateSortedList(null, null);
	}
	
	@Test
	public void Duplicate_ThreeNode_TwoDuplicate(){
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(1);
		
		ListNode expected = new ListNode(1);
		
		AssertDuplicateSortedList(node, expected);
	}
}
