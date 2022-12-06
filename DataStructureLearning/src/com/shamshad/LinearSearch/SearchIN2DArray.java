package com.shamshad.LinearSearch;

import java.util.Scanner;

public class SearchIN2DArray {

	public static void main(String[] args) {
		int[][] arr2D = {

				{ 23, 75, 86 }, { -8, 31, 65 }, { -5, 45, 3 } };
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();

		for (int r = 0; r < arr2D.length; r++) {

			for (int c = 0; c < arr2D[r].length; c++) {
                
				if(target == arr2D[r][c]) {
					System.out.println("FOUND");
				}
				
			}
		}
		

	}

}
