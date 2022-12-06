package com.shamshad.LinearSearch;

public class SearchInString {

	public static void main(String[] args) {
		String name = "shamshad";
		char target = 'a';

		System.out.println(" find the taget string  : " + search(name, target));

	}

	public static boolean search(String name, char tgt) {

		if (name.length() == 0) {
			return false;
		}

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == tgt) {

				return true;
			}
		}

		return false;
	}

}
