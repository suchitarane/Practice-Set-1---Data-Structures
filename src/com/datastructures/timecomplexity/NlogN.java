package com.datastructures.timecomplexity;

//merge sort[ divide and conquer] used for sorting linked lists
class NlogN {
	public static void main(String args[]) {
		int arr[] = { 90, 101, 45, 65, 23, 67, 89, 34, 23 };
		NlogN ob = new NlogN();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}

	void sort(int arr[], int beg, int end) //n
	{
		if (beg < end) {  
			
			int mid = (beg + end) / 2; // n/(2^k)=1 -> k = log n
			
			sort(arr, beg, mid);	//log n
			sort(arr, mid + 1, end); //log n
			
			merge(arr, beg, mid, end); //n
		}
	}

	//f(n)= n log n
}