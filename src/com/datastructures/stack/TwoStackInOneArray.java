package com.datastructures.stack;

//below is same program from geeksforgeeks
//Alternate solution: storing stack1 at odd index with top1 pointer and stack 2 at even index of array with top2 pointer
//But for this array should be dynamic-> ArrayList
public class TwoStackInOneArray {

		int size; 
		int top1, top2; 
		int arr[]; 

		// Constructor 
		TwoStackInOneArray(int n) 
		{ 
			arr = new int[n]; 
			size = n; 
			top1 = -1; 
			top2 = size; 
		} 
		
		public static void main(String args[]) 
		{ 
			TwoStackInOneArray ts = new TwoStackInOneArray(5); 
			ts.push1(5); 
			ts.push2(10); 
			ts.push2(15); 
			ts.push1(11); 
			ts.push2(7); 
			System.out.println("Popped element from" + 
							" stack1 is " + ts.pop1()); 
			ts.push2(40); 
			System.out.println("Popped element from" + 
							" stack2 is " + ts.pop2()); 
		} 

		// Method to push an element x to stack1 
		void push1(int x) 
		{ 
			// There is at least one empty space for 
			// new element 
			if (top1 < top2 - 1) 
			{ 
				top1++; 
				arr[top1] = x; 
			} 
			else
			{ 
				System.out.println("Stack Overflow"); 
				System.exit(1); 
			} 
		} 

		// Method to push an element x to stack2 
		void push2(int x) 
		{ 
			// There is at least one empty space for 
			// new element 
			if (top1 < top2 -1) 
			{ 
				top2--; 
				arr[top2] = x; 
			} 
			else
			{ 
				System.out.println("Stack Overflow"); 
				System.exit(1); 
			} 
		} 

		// Method to pop an element from first stack 
		int pop1() 
		{ 
			if (top1 >= 0) 
			{ 
				int x = arr[top1]; 
				top1--; 
				return x; 
			} 
			else
			{ 
				System.out.println("Stack Underflow"); 
				System.exit(1); 
			} 
			return 0; 
		} 

		// Method to pop an element from second stack 
		int pop2() 
		{ 
			if(top2 < size) 
			{ 
				int x =arr[top2]; 
				top2++; 
				return x; 
			} 
			else
			{ 
				System.out.println("Stack Underflow"); 
				System.exit(1); 

			} 
			return 0; 
		} 


	} 
