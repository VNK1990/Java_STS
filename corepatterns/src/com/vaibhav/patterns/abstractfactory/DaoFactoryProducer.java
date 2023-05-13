package com.vaibhav.patterns.abstractfactory;

public class DaoFactoryProducer {

	public static DaoAbstractfactory produce(String factoryType) {

		DaoAbstractfactory d = null;

		if (factoryType.equalsIgnoreCase("DB"))
			d = new DBDaoFactory();
		else if (factoryType.equalsIgnoreCase("XML"))
			d = new XMLDaoFactory();

		return d;
	}
}
