package com.vaibhav.patterns.command;

public class Person {

	public static void main(String[] args) {
		Television t = new Television();
		Command c = null;

		RemoteControl r = new RemoteControl();
		c = new OnCommand(t);
		r.setCommand(c);
		r.pressButton();

		c = new OffCommand(t);
		r.setCommand(c);
		r.pressButton();
	}
}
