package com.vaibhav.patterns.command;

public class OffCommand implements Command {

	private Television tele;

	public OffCommand(Television tele) {
		this.tele = tele;
	}

	@Override
	public void execute() {
		tele.off();
	}
}
