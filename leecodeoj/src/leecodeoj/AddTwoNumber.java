package leecodeoj;

import leecodeoj.share.ListNode;

public class AddTwoNumber {


	public static ListNode addTwoNumbers_origional(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode headNode = null;
		Integer carryDigit = null;

		
		while (l1 != null || l2 != null || carryDigit != null) {

			if (l1 == null && l2 == null) {
				result.next = new ListNode(carryDigit);
				break;
			}

			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
			int digitValue = sum % 10;

			if (result == null && carryDigit == null) {
				result = new ListNode(digitValue);
				headNode = result;
			} else if (carryDigit != null) {
				int nodeValue = (digitValue + carryDigit) % 10;
				result.next = new ListNode(nodeValue);
				result = result.next;
			} else {
				result.next = new ListNode(digitValue);
				result = result.next;
			}

			if (carryDigit != null && digitValue + carryDigit >= 10)
				carryDigit = (digitValue + carryDigit) / 10;
			else
				carryDigit = ((sum / 10 == 0) ? null : sum / 10);

			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
		}
		
		return headNode;
	}

	public static ListNode addTwoNumbers_(ListNode l1, ListNode l2) {

		ListNode node = null;
		ListNode headNode = null;

		int sum = getSumOfNodesValue(l1, l2);
		int digitInOnes = getDigitInOnes(sum);
		int digitInTens = getDigitInTens(sum);

		node = new ListNode(digitInOnes);
		headNode = node;
		l1 = getNextNode(l1);
		l2 = getNextNode(l2);

		while (l1 != null || l2 != null || digitInTens != 0) {

			if (l1 == null && l2 == null) {
				node.next = new ListNode(digitInTens);
				break;
			}

			sum = getSumOfNodesValue(l1, l2) + digitInTens;

			digitInOnes = getDigitInOnes(sum);
			digitInTens = getDigitInTens(sum);
			node.next = new ListNode(digitInOnes);

			node = node.next;
			l1 = getNextNode(l1);
			l2 = getNextNode(l2);
		}

		return headNode;
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode node = dummy;

		int digitInTens = 0;

		while (l1 != null || l2 != null || digitInTens != 0) {

			int sum = getSumOfNodesValue(l1, l2) + digitInTens;
			int digitInOnes = getDigitInOnes(sum);
			
			digitInTens = getDigitInTens(sum);
			node.next = new ListNode(digitInOnes);

			node = node.next;
			l1 = getNextNode(l1);
			l2 = getNextNode(l2);
		}

		return dummy.next;
	}

	private static Integer getDigitInTens(int sum) {
		return (sum / 10);
	}

	private static int getDigitInOnes(int numbers) {
		return numbers % 10;
	}

	private static ListNode getNextNode(ListNode node) {
		return (node == null) ? null : node.next;
	}

	private static int getSumOfNodesValue(ListNode l1, ListNode l2) {
		return ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
	}

}
