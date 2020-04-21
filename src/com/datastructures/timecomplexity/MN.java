package com.datastructures.timecomplexity;

//jagged array
public class MN {

	public static void main(String[] args) {
		int[][] arr = new int[2][];

		// first row has 3 columns; m
		arr[0] = new int[3];

		// second row has 4 columns; n
		arr[1] = new int[4];

		int counter = 0;
		// initializing array
		for (int row = 0; row < arr.length; row++) { //m

			for (int col = 0; col < arr[row].length; col++) { //n
				arr[row][col] = counter++;
			}
		}

		// printing array
		for (int row = 0; row < arr.length; row++) {
			System.out.println();
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
		}
	}
}