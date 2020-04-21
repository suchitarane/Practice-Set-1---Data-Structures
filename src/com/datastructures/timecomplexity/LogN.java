package com.datastructures.timecomplexity;

//binarysearch (divide and conquer)
public class LogN {

	public int binarySearch(int[] sortedArray, int key, int low, int high) {
		
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2; //n/(2^k)=1 -> k = log n
			
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}

	public static void main(String args[])

	{

		LogN obj = new LogN();

		int arr[] = { 2, 3, 4, 10, 40 };

		int n = arr.length;

		int searchElement = 10;

		int result = obj.binarySearch(arr, searchElement, 0, n - 1);

		if (result == -1)

			System.out.println("Element not present");

		else

			System.out.println("Element found at index" + " " + result);

	}

}
