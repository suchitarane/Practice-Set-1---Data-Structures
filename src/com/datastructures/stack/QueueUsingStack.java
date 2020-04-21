package com.datastructures.stack;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> stack = new Stack<>();

    private void enqueue(int i) {
        stack.push(i);
    }

    private int dequeue()  { //O(n)
        if (stack.size() == 0)
        	System.out.println("Queue is Empty");

        if (stack.size() == 1)
            return stack.pop();

        else
        {
        int data = stack.pop();//pop data from stack
        int retVal = dequeue(); //store the last dequeued item:function call
        stack.push(data);//push everything back to stack
        return retVal;
        }
    }

    public static void main(String[] args)  {
    	QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(60);
        queue.enqueue(30);
        queue.enqueue(40);

        //LIFO
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}