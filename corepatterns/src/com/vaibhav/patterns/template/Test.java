package com.vaibhav.patterns.template;

public class Test {

	public static void main(String[] args) {
		DataRenderer d = new XMLDataRenderer();
		d.renderData();

		DataRenderer d1 = new CSVDataRenderer();
		d1.renderData();
	}
}
