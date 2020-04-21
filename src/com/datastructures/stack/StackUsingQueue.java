package com.datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;
//implement stack using single queue
public class StackUsingQueue {

	private Queue<Integer> q = new LinkedList<>();//queue interface
		
	// Push element x onto stack.
	/*
	 When we push an element into a queue, it will be stored at back of the queue due to queue's properties. 
	 But we need to implement a stack, where last inserted element should be in the front of the queue, not at the back. 
	 To achieve this we can invert the order of queue elements when pushing a new element.
	 */
	public void push(int x) { //O(1)
	    q.add(x);
	    int size = q.size();
	    while (size > 1)
	    {
	        q.add(q.remove());
	        size--;
	    }
	}
		
	public void pop() { //O(1)
	    q.remove();
	}
		
		// Returns top of stack 
	public int top() { //O(1)
	    return q.peek();
	}
		
		// Returns true if Stack is empty else false 
		public boolean empty() { //O(1)
		    return q.isEmpty();
		}

		public static void main(String[] args) 
		{ 
			StackUsingQueue s = new StackUsingQueue(); 
			s.push(1); 
			s.push(2); 
			System.out.println("Top element :" + s.top()); 
			s.pop(); 
			s.push(3); 
			s.pop(); 
			System.out.println("Top element :" + s.top()); 
		} 
	} 

