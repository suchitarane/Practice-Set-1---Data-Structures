package com.datastructures.timecomplexity;

//add all elements in an array
public class N {

	public static void main(String[] args) {
		
		int i, sum=0;  //simple statement so 1 unit of time = 1
		int[] firstarray= {1,2,3}; //n=3, simple statement so 1 unit of time = 1
		
		 for (i = 0; i < 3; i++) // (1+(n+1)+n)->2n+2 = we consider only n+1
	        { 
			 sum= sum+ firstarray[i];//inside i loop so run n times
	        }

		 System.out.print(sum);//simple statement so 1 unit of time = 1
		 
		 //f(n)= 1+1+ (n+1)+n+ 1 -> 2n+4 -> O(n)
}
}
//space complexity
//firstarray:array of size n 
//i:variable -> 1
//sum: 1
//s(n)= n + 2 -> O(n)
