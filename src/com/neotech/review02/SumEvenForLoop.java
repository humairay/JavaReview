package com.neotech.review02;

public class SumEvenForLoop {
	// Add Even numbers
	// Also add Odd numbers
	// Also add All numbers
	// Between 1 && 50
	// Using for loop

	public static void main(String[] args) {

		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;

		for (int num = 1; num <= 50; num++) {

			if (num % 2 == 0) {
				// even
				sumEven += num;
			} else {
				// odd
				sumOdd += num;
			}

			total += num;
		}

		System.out.println("The sum of even number is " + sumEven);
		System.out.println("The sum of odd number is " + sumOdd);

		System.out.println("The sum of all number is " + total);

	}

}
