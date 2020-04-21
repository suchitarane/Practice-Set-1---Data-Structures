package com.datastructures.arrays;

import java.util.Arrays;

public class SecondLargestElement {
	public static int getSecondLargest(int[] a, int total) {
		Arrays.sort(a);//Arrays.sort() function uses Merge Sort -<O(nlogn) 
		return a[total - 2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a, 6));
		System.out.println("Second Largest: " + getSecondLargest(b, 7));
	}
}
