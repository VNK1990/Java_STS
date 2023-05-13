package com.vaibhav.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		DateUtil instance1 = DateUtil.getInstance();
		DateUtil instance2 = null;

		Constructor[] declaredConstructors = DateUtil.class.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			constructor.setAccessible(true);

			try {
				instance2 = (DateUtil) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
