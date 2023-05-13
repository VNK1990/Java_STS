package com.vaibhav.patterns.template.assignment;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Desktop 1 TB Hard Disk Added";
	}

	@Override
	public String addRAM() {
		return "Desktop 8 GB RAM added";
	}

	@Override
	public String addKeyBorad() {
		return "Desktop Querity KeyBoard Added";
	}

}
