package com.neotech.review06;

public class Animal {
	String name;
	int legs;

	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	void displayInfo() {
		System.out.println(name + " has " + legs + " legs");
	}

}

class Wolf extends Animal {
	Wolf(String name, int legs) {
		super(name, legs);
	}
}

class Fox extends Animal {
	// extra variable
	String furColor;

	Fox(String name, int legs, String furColor) {
		super(name, legs);
		this.furColor = furColor;
	}
}

class Bear extends Animal {
	Bear(String name, int legs) {
		super(name, legs);
	}

	// extra method
	public void roar() {
		System.out.println("Bear roars");
	}
}
