package com.datastructures.stack;

import java.util.Stack;
//Instead of saving min(or max) value with each element, we can use two stacks. 
//we push the min(or max) value to its respective stack only when the new value is <=(or >=) to the current min(or max) value.
public class MinStack {
	
	Stack<Integer> stack = new Stack<>();

	private Stack<Integer> minStack;
    private Stack<Integer> maxStack;

    public MinStack () {
        minStack = new Stack<Integer>();    
        maxStack = new Stack<Integer>();    
    }

    public void push(int value){
        if (value <= min()) { 
            minStack.push(value);
        }

        if (value >= max()) {
            maxStack.push(value);
        }

        stack.push(value);
    }

    public Integer pop() {
        int value = stack.pop();

        if (value == min()) {
            minStack.pop();         
        }

        if (value == max()) {
            maxStack.pop();         
        }

        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }

    public int max() {
        if (maxStack.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return maxStack.peek();
        }
    }
    
    public static void main(String args[]) 
	{ 
    	MinStack minStack = new MinStack(); 
		minStack.push(5); 
		minStack.push(10); 
		minStack.push(15); 
		minStack.push(11); 
		minStack.push(7); 
		System.out.println("Popped element " + minStack.pop()); 
		System.out.println("Minimum element " + minStack.min()); 
		System.out.println("Maximum element " + minStack.max()); 
		minStack.push(1); 
		minStack.push(2); 
		minStack.push(70); 
		minStack.push(50);
		System.out.println("Maximum element " + minStack.min()); 
		System.out.println("Minimum element " + minStack.max()); 
		
	} 
}