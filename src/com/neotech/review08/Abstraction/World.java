package com.neotech.review08.Abstraction;

public class World {

	public static void main(String[] args) {
		Human h1 = new Albanian("Flori"); // Up-casting
		h1.talk();
		h1.sleep();
		// h1.albanianDance();

		Albanian a1 = (Albanian) h1; // Down-casting
		a1.albanianDance();

		Human h2 = new Turkish("Ivonne");
		h2.talk();
		h2.sleep();

		if (h2 instanceof Albanian) {
			Albanian a2 = (Albanian) h2;
		}
	}

}
