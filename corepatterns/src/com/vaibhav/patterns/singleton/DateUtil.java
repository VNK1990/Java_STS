package com.vaibhav.patterns.singleton;

import java.io.Serializable;

/**
 * It's a singleton class.It will provide one single object using getInstance()
 * static method.
 */
public class DateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	/**
	 * Define a private static variable of same class DateUtil which will be
	 * returned to other classes on demand using getIntance() static method.
	 * Variable is static because we will instantiate it from static method
	 */
	private static volatile DateUtil instance; //

	/**
	 * Private default constructor to make sure no other class can instantiate an
	 * object.
	 */
	private DateUtil() {
	}

	/**
	 * getInstance method is static and will be called from other classes to get
	 * instance of DateUtil class We are using Static because other classes won't
	 * required to create an instance first to get an object We need to perform null
	 * check so that only 1 object is created.. Marking it Synchronized is important
	 * to make it thread safe
	 */
	public static DateUtil getInstance() {

		if (instance == null) { // Improving the multithreading because synchronized is a very expensive process
								// and we should not call it every time
			synchronized (DateUtil.class) {
				if (instance == null)
					instance = new DateUtil();
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
