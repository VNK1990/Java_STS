package com.vaibhav.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int find(String city) {
		if (city.equalsIgnoreCase("London"))
			return 12;
		else if (city.equalsIgnoreCase("Surat"))
			return 38;
		return 0;
	}
}
