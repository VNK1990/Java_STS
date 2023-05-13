package com.vaibhav.patterns.template.assignment;

public abstract class ComputerManufacturer {

	public void buildComputer() {

		System.out.println(addHardDisk());
		System.out.println(addRAM());
		System.out.println(addKeyBorad());

	}

	public abstract String addHardDisk();

	public abstract String addRAM();

	public abstract String addKeyBorad();
}
