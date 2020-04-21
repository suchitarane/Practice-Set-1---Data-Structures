package com.datastructures.timecomplexity;

//program to multiply two matrix
public class Ncube {

	public static void main(String[] args) {

		int i, j, k;// simple statement so 1 unit of time = 1
		int[][] firstMatrix = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };// simple statement so 1 unit of time = 1
		int[][] secondMatrix = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };// simple statement so 1 unit of time = 1
		int[][] mul = new int[3][3]; // n = 3,simple statement so 1 unit of time = 1

		for (i = 0; i < 3; i++) // n+1
		{
			for (j = 0; j < 3; j++) // inside i loop so run n times->n*(n+1) as its itself a loop = n^2+1
			{
				mul[i][j] = 0;// inside i loop so run n times-> inside j loop so (n*n) = n^2

				for (k = 0; k < 3; k++)// inside i loop so run n times->inside j loop so (n*n)->n^2*(n+1) as itself a loop =n^3+n^2
				{
					mul[i][j] = mul[i][j] + firstMatrix[i][k] * secondMatrix[k][j]; // inside i loop so run n times->
																					// inside j loop so run n times = n^2
																					// inside k loop so run n = n^3
																					

				}
			}
		}

		
		for (i = 0; i < 3; i++) { //n+1
			for (j = 0; j < 3; j++) { //n^2+1
				System.out.print(mul[i][j] + " "); //n^2
			}
			System.out.println();//n

		}
		
		// f(n)= 4+ n+1+ n^2+1+ n^2+ n^3+n^2+ n^3+ n+1+ n^2+1+ n^2+ n  -> O(n^3)

	}
}

//space complexity
//firstMatrix: square matrix n*n -> n^2
//secondMatrix:n^2
//mul: n^2
//n: variable -> 1
//i:1
//j: 1
//k:1
//s(n)= 3 n^2 +4 -> O(n^2)