package com.datastructures.linkedlist;

public class NthNodeFromEnd 
{
	
	class Node
	{
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	public static void main(String[] args)
	{
		int[] nodes = { 1, 2, 3, 4, 5 };
		
		NthNodeFromEnd obj = new NthNodeFromEnd();

		Node head = null;
		for (int i = nodes.length - 1; i >= 0; i--) //start from end
		{
			 head =  obj.new Node(nodes[i], head);
		}

		int n = 2;
		getnthFromtheEnd(head, n);
	}
	
		// Recursive function 
		public static int getnthFromtheEnd(Node node, int n)
		{
		
			if (node == null) {
				return 0;
			}

			int count = getnthFromtheEnd(node.next, n) + 1; //iterate the LL

			if (count == n) {
				System.out.println("nth node from the end is " + node.data);
			}

			return count;
		}


		
	}


