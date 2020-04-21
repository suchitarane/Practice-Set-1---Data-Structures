package com.datastructures.arrays;

//divide and conquer -> O(n)
public class LargestSumContigousSubArray {

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSumSubarray(a, 0, 7));
	}

	static int maxSumSubarray(int ar[], int startIndex, int endIndex) {
		if (endIndex == startIndex) // only one element in an array
		{
			return ar[endIndex];
		}

		// middle element of the array
		int mid = (endIndex + startIndex) / 2;

		// maximum sum in the left subarray
		int maximumSumLeftSubarray = maxSumSubarray(ar, startIndex, mid);
		// maximum sum in the right subarray
		int maximumSumRightSubarray = maxSumSubarray(ar, mid + 1, endIndex);
		// maximum sum in the array containing the middle element
		int maximumSumCrossingSubarray = maxCrossingSubarray(ar, startIndex, mid, endIndex);

		// returning the maximum among the above three numbers
		return maximum(maximumSumLeftSubarray, maximumSumRightSubarray, maximumSumCrossingSubarray);
	}

	// function to return maximum number among three numbers
	static int maximum(int maxLeft, int maxRight, int maxCombine) {
		if (maxLeft >= maxRight && maxLeft >= maxCombine)
			return maxLeft;
		else if (maxRight >= maxLeft && maxRight >= maxCombine)
			return maxRight;
		return maxCombine;
	}

	// function to find maximum sum of subarray crossing the middle element
	static int maxCrossingSubarray(int ar[], int startIndex, int mid, int endIndex) {

		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		int i;

		/*
		  iterating from middle element to the lowest element to find the maximum sum
		  of the left subarray containing the middle element also.
		 */
		for (i = mid; i >= startIndex; i--) {
			sum = sum + ar[i];
			if (sum > leftSum)
				leftSum = sum;
		}

		/*
		  finding the maximum sum of right subarray containing the adjacent right
		  element to the middle element.
		 */
		int rightSum = Integer.MIN_VALUE;
		sum = 0;

		for (i = mid + 1; i <= endIndex; i++) {
			sum = sum + ar[i];
			if (sum > rightSum)
				rightSum = sum;
		}

		return (leftSum + rightSum);
	}

}