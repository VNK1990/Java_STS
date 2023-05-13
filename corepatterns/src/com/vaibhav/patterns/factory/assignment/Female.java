package com.vaibhav.patterns.factory.assignment;

public class Female implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg + " Female");
	}

}
