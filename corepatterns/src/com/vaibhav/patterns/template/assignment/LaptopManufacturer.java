package com.vaibhav.patterns.template.assignment;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Laptop 500 GB Hard Disk Added";
	}

	@Override
	public String addRAM() {
		return "Laptop 16 GB RAM added";
	}

	@Override
	public String addKeyBorad() {
		return "Laptop inbuilt KeyBoard Added";
	}

}
