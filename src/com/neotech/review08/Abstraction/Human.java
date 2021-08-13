package com.neotech.review08.Abstraction;

// abstract - abstrakte - soyut - referat - abstracto -
// veqeti - mavhum - abstraktnyy - Khalasah
public abstract class Human {
	String name;
	static final String planet = "World";

	public Human(String name) {
		this.name = name;
	}

	public abstract void talk(); // unimplemented method

	public void sleep() {
		// implemented method, has a method body
		System.out.println("All human sleep the same.");
	}

}
