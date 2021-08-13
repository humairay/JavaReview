package com.neotech.review07;

public class American extends Human {
	String ssn;

	public American(String name, String ssn) {
		super(name);
		this.ssn = ssn;
	}

	@Override
	public void talk() {
		System.out.println("I speak English. My name is " + name);
	}

	public void taxReturn() {
		System.out.println("I am doing my tax return.");
	}
}
