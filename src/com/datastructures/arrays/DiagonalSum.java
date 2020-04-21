package com.datastructures.arrays;

public class DiagonalSum { 
	
public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},
				{ 4,3,2,1},
				{7,8,9,6},
				{6,5,4,3}};
		
		int principalDiagonal = 0;
		int secondaryDiagonal=0;
		
		int row = a.length;
		
		for(int i=0,j=row-1; i<row && j>=0; i++,j--) //O(n)
		{
			if(i!=j)
			{
				principalDiagonal = principalDiagonal+a[i][i];
				secondaryDiagonal= secondaryDiagonal+a[i][j];
			}
			
		}
		
		System.out.println("diagonal sum "+principalDiagonal+" "+secondaryDiagonal);
	}

}
