package com.datastructures.timecomplexity;

//program to add two square matrix [m==n]
public class Nsquare {

	public static void main(String[] args) {
		
		 int i, j; //simple statement so 1 unit of time = 1
		
		int[][] firstMatrix= { {1,1,1}, {2,2,2}, {3,3,3} }; //simple statement so 1 unit of time = 1
		int[][] secondMatrix= { {1,1,1}, {2,2,2}, {3,3,3}}; //simple statement so 1 unit of time = 1
		int[][] sum =  new int[3][3]; //m,n = 3, //simple statement so 1 unit of time = 1
		
		
	        for (i = 0; i < 3; i++) //(1;n+1;n) -> n+1
	        { 
	            for (j = 0; j < 3; j++) //inside i loop so run n times->n*(n+1) as its itself a loop =n^2+1
	            { 
	                          
	                	sum[i][j] = firstMatrix[i][j]+ secondMatrix[i][j]; //inside i loop so run n times-> inside j loop so run n times n*n
	                	System.out.print(sum[i][j]);//inside i loop so run n times-> inside j loop so run n times n*n

	            } 
	            
	            System.out.print(" ");//inside i loop so run n times
	        } 
	        //f(n)= 4+ (n+1)+ (n^2+1)+ n^2+ n^2+ n  -> O(n^2)
	        
	        
}
}

//space complexity
//firstMatrix: square matrix n*n -> n^2
//secondMatrix:n^2
//sum: n^2
//n: variable -> 1
//i:1
//j: 1
//s(n)= 3 n^2 +3 -> O(n^2)