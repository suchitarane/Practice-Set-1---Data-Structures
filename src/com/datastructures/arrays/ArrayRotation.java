package com.datastructures.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println("Input Array"+" "+Arrays.toString(arr));

		Integer[] result = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = Integer.valueOf(arr[i]);
		}

		// right rotate -->
		Collections.rotate(Arrays.asList(result), 2);
		System.out.println("Right Rotate Array"+" "+Arrays.toString(result));

		//left rotate <--
		leftRotate(arr, 2);
		System.out.println("Left Rotate Array"+" "+Arrays.toString(arr));
	}

	
	public static void swap(int[] arr, int i, int j) {
		int data = arr[i];
		arr[i] = arr[j];
		arr[j] = data;
	}

	public static void reverse(int[] arr, int low, int high) {
		for (int i = low, j = high; i < j; i++, j--) {
			swap(arr, i, j);
		}
	}

	
	public static void leftRotate(int[] arr, int r) {
		// Reverse the first r elements
		reverse(arr, 0, r - 1);
		// Reverse the remaining n-r elements
		reverse(arr, r, arr.length - 1);
		// Reverse the whole array
		reverse(arr, 0, arr.length - 1);
	}
}