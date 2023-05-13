package com.vaibhav.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Vaibhav");
		System.out.println(instance.getName());
	}

}
