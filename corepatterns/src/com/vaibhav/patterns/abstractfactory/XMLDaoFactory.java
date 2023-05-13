package com.vaibhav.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractfactory {

	public Dao createDao(String type) {
		Dao d = null;
		if (type.equalsIgnoreCase("EMP"))
			d = new XMLEmpDao();
		else if (type.equalsIgnoreCase("DEPT"))
			d = new XMLDeptDao();
		return d;
	}
}
