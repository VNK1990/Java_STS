package com.vaibhav.patterns.template.assignment;

public class Test {

	public static void main(String[] args) {
		ComputerManufacturer desktop = new DesktopManufacturer();
		desktop.buildComputer();
		System.out.println("\n");
		ComputerManufacturer laptop = new LaptopManufacturer();
		laptop.buildComputer();
	}
}
