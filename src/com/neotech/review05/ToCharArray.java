package com.neotech.review05;

public class ToCharArray {

	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is not Monday";
		System.out.println(longStr.length());

		char[] charArray = longStr.toCharArray();
		System.out.println(charArray.length);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		for (char letter : charArray) {
			int code = letter; // find the ASCI code for the character
			System.out.println(letter + " -> " + code);
		}

		System.out.println("------------------");
		// Don't use replace method
		// Task: Print the whole array, but replace the letter "a" with "e"

		System.out.println("\tReplace \"a\" with \"e\"");
		for (char letter : charArray) {

			// if there is only one statement inside if
			// we can remove the curly brackets
			if (letter == 'a')
				System.out.print('e');
			else
				System.out.print(letter);

		}
		System.out.println();

	}
}
