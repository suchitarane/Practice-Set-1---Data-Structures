package com.datastructures.strings;

public class UniqueCharacter {

	static void nonrepeatingchar(String str) {

		for (char ch : str.toCharArray()) // O(n)
		{
			// indexOf( ) Searches for the first occurrence of a character or substring.; O(m*n) n is input length and m is parameter length
			// lastIndexOf( ) Searches for the last occurrence of a character or substring.O(m*n)
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {// 1==1 occurance of char is once
				System.out.println("Non repeating: " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";

		nonrepeatingchar(str);

	}

}
