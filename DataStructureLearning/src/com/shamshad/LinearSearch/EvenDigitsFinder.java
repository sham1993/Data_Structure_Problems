package com.shamshad.LinearSearch;

public class EvenDigitsFinder {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 654, 1233, 67, 333, 12, 12 };
		System.out.println("find even digit   :" + find(arr));

	}

	private static int find(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (isEven(i)) {
				count++;
			}
		}

		return count;
	}

	private static boolean isEven(int num) {

		int digitsnum = checkDigits2(num);
		System.out.println(digitsnum);

		return digitsnum % 2 == 0;
	}

	static int checkDigits(int num) {
		int digit = 0;
		if (num < 1) {
			num = num * -1;
		}

		while (num > 0) {
			num = num / 10;
			digit++;
		}
		return digit;
	}

	static int checkDigits2(int num) {// to inrs space complexity
		return (int) (Math.log10(num)) + 1;
	}

}
