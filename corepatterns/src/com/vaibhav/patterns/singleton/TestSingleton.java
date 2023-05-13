package com.vaibhav.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateInstance1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(
				"/home/vaibhav/Desktop/Spring_Hibernate/UDEMY/Java Design Patterns/singleton_pattern_test/singleton.ser")));
		oos.writeObject(dateInstance1);

		DateUtil dateInstance2 = null;//DateUtil.getInstance();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(
				"/home/vaibhav/Desktop/Spring_Hibernate/UDEMY/Java Design Patterns/singleton_pattern_test/singleton.ser")));
		 dateInstance2 = (DateUtil) ois.readObject();

		System.out.println(dateInstance1 == dateInstance2);
		
		oos.close();
		ois.close();
//
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				DateUtil dateInstance = DateUtil.getInstance();
//				System.out.println("Thread 1: " + dateInstance);
//			}
//		};
//
//		Thread t = new Thread(r);
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			DateUtil dateInstance = DateUtil.getInstance();
//			System.out.println("Thread 2: " + dateInstance);
//		}
	}
}
