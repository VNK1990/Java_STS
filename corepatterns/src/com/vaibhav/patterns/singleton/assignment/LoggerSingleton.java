package com.vaibhav.patterns.singleton.assignment;

import java.io.Serializable;

public class LoggerSingleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private static volatile LoggerSingleton instance;

	private LoggerSingleton() {
	}

	public LoggerSingleton getInstance() {

		if (instance == null) {
			synchronized (LoggerSingleton.class) {
				if (instance == null)
					instance = new LoggerSingleton();
			}
		}
		return instance;
	}

	public void log(String message) {
		System.out.println(message);
	}

	public Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
