package com.vaibhav.patterns.factory.assignment;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg + " Male");
	}

}
