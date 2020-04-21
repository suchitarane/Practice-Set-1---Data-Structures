package com.datastructures.strings;

public class AnagramCheck {

	public static boolean checkAnagram(String firstString, String secondString) {

		//case check
		String first = firstString.toUpperCase();
		String second = secondString.toUpperCase();

		//length check
		if (first.length() != second.length()) {
			return false;
		}

		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch); //search: O(m*n)
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(checkAnagram("Hello", "ollhe"));

	}

}
