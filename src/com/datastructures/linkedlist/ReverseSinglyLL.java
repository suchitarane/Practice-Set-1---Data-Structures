package com.datastructures.linkedlist;

	// using stack 
	import java.util.*; 
	class ReverseSinglyLL 
	{ 

	 
	static Node head = null; 


	public static void main(String[] args) 
	{ 
		createNode( 5); 
		createNode( 4); 
		createNode( 3); 
		createNode( 2); 
		createNode( 1); 

		printList(head); 
		
		head = reverseList(head); 

		printList(head); 
	} 
	static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
	
	static void createNode( int data) 
	{ 
		Node new_node = new Node (data); 

		new_node.data = data; 
		new_node.next = head; 
		head = new_node; 
	} 

	
	static Node reverseList(Node head) 
	{ 
		// Stack to store elements of list 
		Stack<Node > stack = new Stack<Node> (); 

		// Push the elements of list to stack 
		Node ptr = head; 
		while (ptr.next != null) 
		{ 
			stack.push(ptr); 
			ptr = ptr.next; 
		} 

		// Pop from stack and replace 
		// current nodes value' 
		head = ptr; 
		while (!stack.isEmpty()) 
		{ 
			ptr.next = stack.peek(); 
			ptr = ptr.next; 
			stack.pop(); 
		} 
		ptr.next = null; 
		
		return head; 
	} 

	
	static void printList(Node head) 
	{ 
		while (head != null) 
		{ 
			System.out.print(head.data + " "); 
			head = head.next; 
		} 
		System.out.println();
	} 

	
	
	} 

