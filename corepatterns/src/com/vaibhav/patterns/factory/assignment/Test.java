package com.vaibhav.patterns.factory.assignment;

public class Test {

	public static void main(String[] args) {
		Person p = PersonFactory.createPerson("male");
		p.wish("Hello kd");
		
		Person p1 = PersonFactory.createPerson("female");
		p1.wish("Hello kd");
		
		Person p2 = PersonFactory.createPerson("gsgf");
		p2.wish("Hello kd");
	}
}
