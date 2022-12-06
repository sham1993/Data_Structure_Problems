package com.shamshad.Array;

import java.util.Arrays;

public class ArrayExample {

	public static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 34, 8 };

		// Edge cases

		System.out.println("orginal array :  " + Arrays.toString(arr));
		swap(arr, 1, 4);
		System.out.println("swap  :  " + Arrays.toString(arr));

		System.out.println("maximun no is  :   " + maxNumber(arr));
		System.out.println("maximun no  range is  :   " + maxNumberRange(arr, 1, 5));

		reverser(arr);
		System.out.println("reverse  :  " + Arrays.toString(arr));
	}

	private static int[] reverser(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		for (int i = 0; i <= end; i++) {
			swap(arr, start, end);
			start++;
			end--;
			if (start > end) {
				return arr;
			}
		}

		return arr;
	}

	private static int maxNumberRange(int[] arr, int start, int end) {
		if (end < start) {
			return -1;
		}
		if (arr.length == 0) {
			return -1;
		}

		int maxNum = Integer.MIN_VALUE;
		for (int i = start; i <= end; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}

		}
		return maxNum;
	}

	private static int maxNumber(int[] arr) {
		if (arr == null) {
			return -1;
		}
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}

		}
		return maxNum;

	}

}
