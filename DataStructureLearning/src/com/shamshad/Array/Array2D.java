package com.shamshad.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// Scanner in = new Scanner(null);
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};
		
		for(int[] a : arr) 
		{
			System.out.println(Arrays.toString(a));
		}

		/*
		 * for (int row = 0; row < arr.length; row++) {
		 * 
		 * //System.out.println(Arrays.toString(arr[row])); for (int col = 0; col <
		 * arr[row].length; col++) { System.out.print(arr[row][col]);
		 * System.out.println(); } }
		 */
	}


}
