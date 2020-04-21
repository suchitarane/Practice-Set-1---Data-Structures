package com.datastructures.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String input;
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();

		System.out.println("The reversed string is: " + reverseString(input));
	}

	public static String reverseString(String input) {
		if (input.isEmpty())
			return input;
		// Calling Function Recursively using substring(int begIndex)
		return reverseString(input.substring(1)) + input.charAt(0); // O(n)
	}

}
