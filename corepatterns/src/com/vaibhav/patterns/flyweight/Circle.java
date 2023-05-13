package com.vaibhav.patterns.flyweight;

public class Circle extends Shape {

	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Circle() {
		label = "Circle";
	}

	public void draw(int radious, String fillColour, String lineColour) {
		System.out.println("Drawing a " + label + " with radious " + radious + " fill colour " + fillColour
				+ " line colour " + lineColour);
	}
}
