package com.vaibhav.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractfactory {
	public Dao createDao(String type) {
		Dao d = null;
		if (type.equalsIgnoreCase("EMP"))
			d = new DBEmpDao();
		else if (type.equalsIgnoreCase("DEPT"))
			d = new DBDeptDao();
		return d;
	}
}
