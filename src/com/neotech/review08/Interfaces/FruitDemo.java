package com.neotech.review08.Interfaces;

public class FruitDemo {

	public static void main(String[] args) {
		Apple a = new Apple("Yellow");
		a.wash();
		a.peel();

		Coconut c = new Coconut("Brown");
		c.crack();

		Fruit f = new Apple("Red"); // up-casting
		f.color = "Black";

		if (f instanceof Apple) {
			// you can safely downcast it to Apple
			Apple apple = (Apple) f;
			apple.wash();
			apple.peel();
		} else if (f instanceof Coconut) {
			// you can safely downcast it to Coconut
			Coconut coco = (Coconut) f;
			coco.crack();
		}

		// Task 1
		// Create an Orange class that extends Fruit and implements Peelable
		// And create an object in FruitDemo

		Orange o = new Orange("Orange");
		o.peel();

		Peelable p1 = new Apple("Green");
		Peelable p2 = new Orange("Orange");
		// I can only call peel() method
		p1.peel();
	}

}
