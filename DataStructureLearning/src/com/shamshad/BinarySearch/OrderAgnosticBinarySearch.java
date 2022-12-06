package com.shamshad.BinarySearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 12, 15, 45, 67, 87, 88, 98, 234, 525, 999 };

		System.out.println(search(arr, 88));
	}

	static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[end] > arr[start];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			}
		}

		return -1;

	}

}
