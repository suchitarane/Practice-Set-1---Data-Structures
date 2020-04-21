package com.datastructures.linkedlist;

import java.util.Stack;

public class InsertionPointOfTwoLL {

	public static void main(String[] args) {
		Node head1;
		Node head2;

		InsertionPointOfTwoLL insertionPointOfTwoLL = new InsertionPointOfTwoLL();
		Node node1 = insertionPointOfTwoLL.new Node(12);
		head1 = node1;
		Node node2 = insertionPointOfTwoLL.new Node(1);
		Node node3 = insertionPointOfTwoLL.new Node(2);
		Node node4 = insertionPointOfTwoLL.new Node(3);
		Node node5 = insertionPointOfTwoLL.new Node(4);
		head1.next = node2;
		head1.next.next = node3;
		head1.next.next.next = node4;
		head1.next.next.next.next = node5;

		Node node12 = insertionPointOfTwoLL.new Node(10);
		head2 = node12;
		Node node22 = insertionPointOfTwoLL.new Node(20);
		Node node32 = insertionPointOfTwoLL.new Node(30);
		Node node42 = insertionPointOfTwoLL.new Node(3);
		Node node52 = insertionPointOfTwoLL.new Node(4);
		Node node62 = insertionPointOfTwoLL.new Node(5);

		head2.next = node22;
		head2.next.next = node32;
		head2.next.next.next = node42;
		head2.next.next.next.next = node52;
		head2.next.next.next.next.next = node62;
		node62.next = node4;

		System.out.print("Linked list 1: ");
		iterateLinedList(head1);
		System.out.print("Linked list 2: ");
		iterateLinedList(head2);

		Node commonNode3 = findCommonNodeUsingStacks(head1, head2);

		System.out.println("Common node of two linked list is  " + commonNode3.data);

	}

	private static Node findCommonNodeUsingStacks(Node head1, Node head2) {
		Node commonNode = null;
		Node previousTempCommonNode = null;
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();

		while (head1 != null) {
			stack1.push(head1);
			head1 = head1.next;
		}

		while (head2 != null) {
			stack2.push(head2);
			head2 = head2.next;
		}
		while (!stack1.isEmpty() && !stack2.isEmpty()) { // O(p+q)
			if (stack1.peek().equals(stack2.peek())) { //check if common node in LL
				previousTempCommonNode = stack1.peek();
				stack1.pop();
				stack2.pop();
			} else {
				break;
			}
		}

		// Check whether temporary node is null or not, if not that node is common node
		if (previousTempCommonNode != null) {
			commonNode = previousTempCommonNode;
		}
		return commonNode;
	}

	class Node {

		private int data;
		private Node next; 
		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}
	}


	private static void iterateLinedList(Node head) {
		Node current = head;
		if (head != null) {

			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println();

		} else {
			System.out.println("Linked list is empty.");
		}

	}

}