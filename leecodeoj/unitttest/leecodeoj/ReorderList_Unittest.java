package leecodeoj;

import leecodeoj.share.ListNode;

import org.junit.Assert;
import org.junit.Test;


public class ReorderList_Unittest {

	private void AssertReorderList(ListNode actualHead, ListNode expectedHead) {
		ReorderList list = new ReorderList();
		list.reorderList(actualHead);

		ListNode expectedNode = expectedHead;
		while (actualHead != null && expectedNode != null) {
			Assert.assertEquals(expectedNode.val, actualHead.val);
			actualHead = actualHead.next;
			expectedNode = expectedNode.next;
		}

		Assert.assertNull(expectedNode);
		Assert.assertNull(actualHead);
	}


	@Test
	public void ReorderList_0Element() {
		AssertReorderList(null, null);
	}

	@Test
	public void ReorderList_1Element() {
		ListNode L1 = new ListNode(1);

		ListNode expectedL1 = new ListNode(1);
		AssertReorderList(L1, expectedL1);
	}

	@Test
	public void ReorderList_2Element() {
		ListNode L1 = new ListNode(1);
		ListNode L2 = new ListNode(2);
		L1.next = L2;

		ListNode expectedL1 = new ListNode(1);
		ListNode expectedL2 = new ListNode(2);
		expectedL1.next = expectedL2;

		AssertReorderList(L1, expectedL1);
	}

	@Test
	public void ReorderList_3Element() {
		ListNode L1 = new ListNode(1);
		ListNode L2 = new ListNode(2);
		ListNode L3 = new ListNode(3);
		L1.next = L2;
		L2.next = L3;
		
		ListNode expectedL1 = new ListNode(1);
		ListNode expectedL2 = new ListNode(2);
		ListNode expectedL3 = new ListNode(3);
		expectedL1.next = expectedL3;
		expectedL3.next = expectedL2;
		
		AssertReorderList(L1, expectedL1);
	}
	
	@Test
	public void ReorderList_4Element() {
		 ListNode L1 = new ListNode(1);
		 ListNode L2 = new ListNode(2);
		 ListNode L3 = new ListNode(3);
		 ListNode L4 = new ListNode(4);
		
		 L1.next = L2;
		 L2.next = L3;
		 L3.next = L4;
		 L4.next = null;

		ListNode expectedL1 = new ListNode(1);
		ListNode expectedL2 = new ListNode(2);
		ListNode expectedL3 = new ListNode(3);
		ListNode expectedL4 = new ListNode(4);
		expectedL1.next = expectedL4;
		expectedL4.next = expectedL2;
		expectedL2.next = expectedL3;
		expectedL3.next = null;

		AssertReorderList(L1, expectedL1);
	}
	
	@Test
	public void ReorderList_reverse_5Element(){
		 ListNode L1 = new ListNode(1);
		 ListNode L2 = new ListNode(2);
		 ListNode L3 = new ListNode(3);
		 ListNode L4 = new ListNode(4);
		 ListNode L5 = new ListNode(5);
		
		 L1.next = L2;
		 L2.next = L3;
		 L3.next = L4;
		 L4.next = L5;
		 L5.next = null;
		 
		 ListNode expectedL1 = new ListNode(1);
		 ListNode expectedL2 = new ListNode(2);
		 ListNode expectedL3 = new ListNode(3);
		 ListNode expectedL4 = new ListNode(4);
		 ListNode expectedL5 = new ListNode(5);
		 
		 expectedL5.next = expectedL4;
		 expectedL4.next = expectedL3;
		 expectedL3.next = expectedL2;
		 expectedL2.next = expectedL1;
		 expectedL1.next = null;
		 
		 ReorderList list = new ReorderList();
		 
		 
		 ListNode actual = list.reverse(L1);
		 ListNode expected = expectedL5;
		 while( expected != null && actual != null ) {
			 Assert.assertEquals(expected.val, actual.val);
			 
			 actual = actual.next;
			 expected = expected.next;
		 }
	}
	
	@Test
	public void ReorderList_reverse_2Element(){
		 ListNode L1 = new ListNode(1);
		 ListNode L2 = new ListNode(2);
		
		 L1.next = L2;
		 L2.next = null;
		 
		 ListNode expectedL1 = new ListNode(1);
		 ListNode expectedL2 = new ListNode(2);
		 
		 expectedL2.next = expectedL1;
		 expectedL1.next = null;
		 
		 ReorderList list = new ReorderList();
		 
		 
		 ListNode actual = list.reverse(L1);
		 ListNode expected = expectedL2;
		 while( expected != null && actual != null ) {
			 Assert.assertEquals(expected.val, actual.val);
			 
			 actual = actual.next;
			 expected = expected.next;
		 }
	}

}
