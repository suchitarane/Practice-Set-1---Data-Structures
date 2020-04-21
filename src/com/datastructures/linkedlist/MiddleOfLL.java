package com.datastructures.linkedlist;

public class MiddleOfLL {

	private class Node {
		private Node nextNode;
		private int data;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public static void main(String[] args) {

		MiddleOfLL obj = new MiddleOfLL();

		LinkedList linkedList = obj.new LinkedList();

		linkedList.createNode(5);
		linkedList.createNode(3);
		linkedList.createNode(9);
		linkedList.createNode(4);
		linkedList.createNode(7);
		linkedList.createNode(99);
		linkedList.createNode(34);

		System.out.println("Size of LL is " + " " + linkedList.getSize());

		int middle = linkedList.getSize() / 2; //require middle element so divide by 2

		linkedList.findMiddleNode(linkedList, middle);

	}


	class LinkedList {
		private Node head;
		private int size;

		public void createNode(int data) {
			Node node = new Node(data);
			node.nextNode = head;
			head = node;

			size++;// while adding determine size
		}

		public void findMiddleNode(LinkedList linkedList, int middle) {
			Node headnode = linkedList.getHead();
			int count = -1;
			while (headnode != null) 
			{
				count++; //in each iteration incrementing count

				if (count == middle) //compare count with middle-count-> WHILE loop will iterate till middle > O(log n)
				{
					System.out.println(headnode.data);
				} else {
					headnode = headnode.nextNode;
				}

			}
		}

		public Node getHead() {
			return head;
		}

		public int getSize() {
			return size;
		}
	}
}
