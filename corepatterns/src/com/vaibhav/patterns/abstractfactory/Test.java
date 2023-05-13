package com.vaibhav.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractfactory daf = DaoFactoryProducer.produce("DB");
		Dao dao = daf.createDao("emp");
		dao.save();
		dao = daf.createDao("dept");
		dao.save();
		
		daf = DaoFactoryProducer.produce("XML");
		dao = daf.createDao("emp");
		dao.save();
		dao = daf.createDao("dept");
		dao.save();
	}
}
