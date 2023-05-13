package com.vaibhav.patterns.template;

public abstract class DataRenderer {

	public void renderData() {
		String data = readData();
		data = processData(data);
		System.out.println(data);
	}

	public abstract String readData();

	public abstract String processData(String data);

}
