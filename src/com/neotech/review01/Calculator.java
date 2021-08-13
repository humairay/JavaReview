package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// cmd + shift + o --> will import the class
		// ctrl + shift + o --> will import the class

		Scanner evis = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = evis.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = evis.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = evis.next();

		double result = 0;

		if (operator.equals("+")) {
			result = d1 + d2;
		} else if (operator.equals("-")) {
			result = d1 - d2;
		} else if (operator.equals("*")) {
			result = d1 * d2;
		} else if (operator.equals("/")) {
			result = d1 / d2;
		} else {
			System.out.println("Invalid operator");
		}

		System.out.println("The result is " + result);

	}
}
