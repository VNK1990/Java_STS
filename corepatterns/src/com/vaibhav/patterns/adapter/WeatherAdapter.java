package com.vaibhav.patterns.adapter;

public class WeatherAdapter {
	public String findTemparature(String postCode) {
		if (postCode.equalsIgnoreCase("E143QF"))
			return "London";
		else if (postCode.equalsIgnoreCase("395017"))
			return "Surat";
		else
			return null;
	}
}
