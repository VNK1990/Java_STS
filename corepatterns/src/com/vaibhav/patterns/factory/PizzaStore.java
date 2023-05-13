package com.vaibhav.patterns.factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza p = Pizzafactory.createPizza(type);

		p.prepare();
		p.bake();
		p.cut();

		return p;
	}

}
