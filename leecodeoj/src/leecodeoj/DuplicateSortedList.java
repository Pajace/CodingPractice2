package leecodeoj;

import leecodeoj.share.ListNode;

public class DuplicateSortedList {

	public ListNode removeDuplicates(ListNode head) {

		if (head == null)
			return null;

		ListNode node = head;
		ListNode nextNode = null;

		while (node != null) {

			nextNode = node.next;
			
			if (nextNode == null) {
				node.next = nextNode;
				node = node.next;
			} else if (node.val == nextNode.val) { //
				node.next = nextNode.next;
			} else {
				node = node.next;
			}
		}

		return head;
	}

}
