package com.neotech.review07;

public class World {

	public static void main(String[] args) {

		Human h1 = new Human("Komron");
		System.out.println("The first human is " + h1.name);
		System.out.println("He lives in " + Human.planet);

		Human h2 = new Human("Murat");
		System.out.println("He lives in " + Human.planet);

		Human h3; // Declaring a variable of type Human
		h3 = new Albanian("Evis"); // Creating an Albanian and assign it to h3
		// up-casting

		System.out.println(h3.name + " lives in " + Human.planet);

		Human h4 = new Turkish("Enes"); // up-casting, automatically

		System.out.println("--------- Let's make the people talk :) ");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();

		// Compile error, because h4 is of type Human
		// h4.makeBaklava();

		System.out.println("----------------");
		// down-casting, manually
		Turkish t1 = (Turkish) h4;
		t1.makeBaklava();

		// This will give us a runtime error
		// Turkish t2 = (Turkish) h3;
		// t2.makeBaklava();

		// Polymorphism
		// Method overriding
		// Run time polymorphism/late binding/dynamic binding

		// This is the safe way to down-cast
		if (h4 instanceof Turkish) {
			Turkish turkish = (Turkish) h4;
			turkish.makeBaklava();
		} else if (h4 instanceof Albanian) {
			Albanian albanian = (Albanian) h4;
			albanian.albanianDance();
		}

		System.out.println("------------------------");
		American a1 = new American("Donald", "123-456-7890");
		a1.talk();
		a1.taxReturn();

		Human h5 = a1; // up-casting, automatically
		h5.talk();
		// h5.taxReturn();

		American a2 = (American) h5; // down-casting, manually
		a2.talk();
		a2.taxReturn();

		System.out.println("-------power of polymorhism-------");
		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3; // Albanian, no up-casting
		humans[3] = h4; // Turkish
		humans[4] = a1; // American, up-casting
		humans[5] = new Turkish("Okan"); // up-casting
		// This is possible because of inheritance

		System.out.println("--------------------------");
		for (Human element : humans) {
			System.out.println("----");
			element.talk();

			if (element instanceof Albanian) {
				Albanian alb = (Albanian) element;
				alb.albanianDance();
			} else if (element instanceof Turkish) {
				Turkish tur = (Turkish) element;
				tur.makeBaklava();
			} else if (element instanceof American) {
				American amer = (American) element;
				amer.taxReturn();
			}
		}

	}

}
