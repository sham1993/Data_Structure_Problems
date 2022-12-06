package com.shamshad.LinearSearch;

import java.util.Scanner;

public class SearchIn1D {

	public static void main(String[] args) {
		int[] arr = { 12, 32, -3, 4, 5, 2, 7, 34 };
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("Enter taget"); int
		 * target = in.nextInt(); System.out.println("Enter Start"); int start =
		 * in.nextInt(); System.out.println("Enter End"); int end = in.nextInt();
		 * 
		 * System.out.println("noi is present  : " + search(arr, start, end, target));
		 */
		
		System.out.println("Minimun  :  "+ findMin(arr));
	}

	private static int findMin(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		
		int min = arr[0];
		
		for(int i : arr) {
			if(min>i) {
				min=i;
			}
		}
		return min;
	}

	private static boolean search(int[] arr, int start, int end, int target) {
		if (start > end) {
			return false;
		}
		if (arr.length == 0) {
			return false;
		}

		for (int index = start; index < arr.length; index++) {

			if (target == arr[index]) {
				return true;
			}

		}

		return false;
	}

}
