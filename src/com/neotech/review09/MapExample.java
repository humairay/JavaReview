package com.neotech.review09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {
		Map<Integer, String> phonebook = new HashMap<>();
		phonebook.put(123456789, "Brad Pitt");
		phonebook.put(345678901, "Donald Trump");
		phonebook.put(222222222, "Obama");
		phonebook.put(111111111, "Brad Pitt");
		phonebook.put(444444444, "James Smith");

		// replacing James Smith with Julia Roberts
		// phonebook.put(444444444, "Julia Roberts");
		// replace is doing the same thing
		phonebook.replace(444444444, "Julia Roberts");

		System.out.println(phonebook);

		// Map is one-directional, from Key to Value
		String name = phonebook.get(222222222); // get the value by using the key
		System.out.println("Calling.... " + name);

		System.out.println("Calling.... " + phonebook.get(999999999));

		boolean containsKey = phonebook.containsKey(999999999);
		System.out.println(999999999 + " exists in my phonebook " + containsKey);

		boolean containsJulia = phonebook.containsValue("Julia Roberts");
		System.out.println("My phonebook has Julia Roberts: " + containsJulia);

		phonebook.remove(345678901); // Will remove the entry (key/value pair) from the map
		System.out.println(phonebook);
		System.out.println("The size of my phonebook: " + phonebook.size());

		System.out.println("--------phonebook.keySet()------------");
		// I will get all the keys and store them in a SET
		Set<Integer> keys = phonebook.keySet();
		System.out.println(keys);

		for (Integer number : keys) {
			System.out.println(number);
			System.out.println(phonebook.get(number)); // Finding the value using the key
			System.out.println("-----");
		}

		System.out.println("--------phonebook.values()------------");
		Collection<String> names = phonebook.values();
		// I will get all the values and store them in a COLLECTION
		System.out.println(names);

		for (String element : names) {
			System.out.println(element);
		}

		// From the value you CANNOT find the key
	}

}
