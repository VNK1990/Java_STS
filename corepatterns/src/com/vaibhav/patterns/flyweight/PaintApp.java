package com.vaibhav.patterns.flyweight;

public class PaintApp {

	public void render(int numberOfShapes) {
		Shape shape = null;

		for (int i = 1; i <= numberOfShapes; i++) {
			if (i % 2 == 0) {
				shape = ShapeFactory.getShapeObj("Circle");
				shape.draw(i, "red", "white");
			} else {
				shape = ShapeFactory.getShapeObj("rectangle");
				shape.draw(i, i + i, "dotted");
			}
		}
	}
}
