package com.shamshad.LinearSearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] arr = {12,1323,45,13,-1,-34,6554,212,778,34,90};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the element you want to search   : " );
		int target = in.nextInt();
		//System.out.println("index no is  " + saerch(arr, target) );
		if(saerch(arr, target)== -1) {
			System.out.println("NOT FOUND");
		}
		else {
			System.out.println("FOUND at index no   : " + saerch(arr, target));
		}

	}

	public static int saerch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] == target) {
				return index;
			}
		}

		return -1;

	}

}
