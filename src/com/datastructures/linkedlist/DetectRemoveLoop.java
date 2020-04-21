package com.datastructures.linkedlist;

import java.util.*;

public class DetectRemoveLoop {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		DetectRemoveLoop list = new DetectRemoveLoop();

		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next; // 50->20->15->4->10=>15

		if (loopDetector(head)) {
			System.out.println("Linked List after removing loop");
			list.printList(head);
		} else
			System.out.println("No Loop found");
	}

	static boolean loopDetector(Node head) {
		Node t = head;
		Node prev = null;

		Map<Node, Node> map = new IdentityHashMap<Node, Node>(); // why used: IdentityHashMap to track already visited nodes -> O(N)
		while (t != null) {
			if (map.containsKey(t)) {// visit node N twice -> node N must be start of a cycle
				System.out.println("Loop is at Node having value :" + t.data);
				prev.next = null; // point duplicate nodes next to null(remove loop)
				return true;

			} else {
				map.put(t, t);
				prev = t;
				t = t.next;
			}

		}
		return false;
	}

	// Function to print the linked list
	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
