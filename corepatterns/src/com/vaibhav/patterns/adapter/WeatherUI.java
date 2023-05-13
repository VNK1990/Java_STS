package com.vaibhav.patterns.adapter;

public class WeatherUI {

	public int find(String postCode) {
		WeatherFinderImpl w = new WeatherFinderImpl();
		WeatherAdapter wd = new WeatherAdapter();
		return w.find(wd.findTemparature(postCode));
	}

	
	public static void main(String[] args) {
		WeatherUI w = new WeatherUI();
		System.out.println(w.find("395017"));
	}
}
