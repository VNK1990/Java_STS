package com.vaibhav.patterns.factory.assignment;

public class PersonFactory {

	public static Person createPerson(String msg) {
		Person p = null;

		if (msg.equals("male"))
			p = new Male();
		else if (msg.equals("female"))
			p = new Female();
		else
			throw new RuntimeException("Not a valid wish");

		return p;
	}
}
