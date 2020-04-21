package com.datastructures.arrays;

import java.util.Scanner;

public class SubarraySum { // o(n)

	static void subArrayIndexes(int[] arr, int sum, int n) {

		int window_size = arr[0], start = 0, i;

		for (i = 1; i < n; i++) { // n
			while (window_size > sum && start < i - 1) {
				window_size = window_size - arr[start];
				start++;
			}

			if (window_size == sum) {

				System.out.println("Sum at index" + " " + (start) + " to" + " " + (i - 1));
				return;
			}

			window_size = window_size + arr[i];
		}
		System.out.println("-1");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, a, sum;

		int[] arr = new int[100];

		System.out.println("Enter n, sum");
		n = sc.nextInt();
		sum = sc.nextInt();
		
		System.out.println("Enter array");
		for (a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		subArrayIndexes(arr, sum, n);

	}
}