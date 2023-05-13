package com.vaibhav.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static Map<String, Shape> map = new HashMap<>();

	public static Shape getShapeObj(String type) {
		Shape s = null;
		if (map.get(type) == null) {
			if (type.equalsIgnoreCase("Circle")) {
				s = new Circle();
			} else if (type.equalsIgnoreCase("Rectangle")) {
				s = new Rectangle();
			}
			map.put(type, s);
		} else
			s = map.get(type);
		return s;
	}
}
