package leecodeoj;

import leecodeoj.share.ListNode;

public class ReorderList {

	public void reorderList(ListNode head) {

		// Got time limit exceeded
		// if (head == null || head.next == null)
		// return;
		//
		// ListNode currentNode = head;
		// while (currentNode.next != null) {
		// ListNode tmpNode = currentNode.next;
		// if (tmpNode.next == null)
		// break;
		//
		// ListNode preEndNode = currentNode;
		// while (preEndNode.next.next != null)
		// preEndNode = preEndNode.next;
		// ListNode endNode = preEndNode.next;
		//
		// preEndNode.next = null;
		// currentNode.next = endNode;
		// endNode.next = tmpNode;
		// currentNode = endNode.next;
		// }

		// part II
//		if (head == null || head.next == null || head.next.next == null)
//			return;
//
//		// Find middle node and cut the original linked list to two pars
//		ListNode preMiddleNode = head;
//		ListNode tailNode = head;
//		while (tailNode != null && tailNode.next != null) {
//			tailNode = tailNode.next.next;
//			preMiddleNode = preMiddleNode.next;
//		}
//		ListNode reverseStartNode = preMiddleNode.next;
//		preMiddleNode.next = null;
//
//		ListNode reverseHead = reverse(reverseStartNode);
//		ListNode currentNode = head;
//		while(reverseHead != null) {
//			ListNode tmp = reverseHead.next;
//			reverseHead.next = currentNode;
//			currentNode.next = reverseHead;
//			currentNode = currentNode.next.next;
//			reverseHead = tmp;
//		}

		if (head ==null || head.next == null || head.next.next == null)			
			return;
		
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode reverseHead = slow.next;
		slow.next = null;
		reverseHead = reverse(reverseHead);
		ListNode current = head;
		while(reverseHead != null) {
			ListNode tmp = reverseHead.next;
			reverseHead.next = current.next;
			current.next = reverseHead;
			current = current.next.next;
			reverseHead = tmp;
		}
	}

	public ListNode reverse(ListNode reverseHead) {

		if (reverseHead.next == null)
			return reverseHead;

		ListNode currentNode = reverseHead.next;
		ListNode tempNode = null;
		ListNode headNode = reverseHead;

		while (currentNode != null) {
			tempNode = currentNode.next;
			if (headNode.next.val == currentNode.val)
				headNode.next = null;
			currentNode.next = headNode;

			headNode = currentNode;
			currentNode = tempNode;
		}

		return headNode;
	}
}
