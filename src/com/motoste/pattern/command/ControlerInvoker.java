package com.motoste.pattern.command;

public class ControlerInvoker {
	private Command command;
	public ControlerInvoker() {	}
	
	public void setCommand(Command command) {
		this.command = command; 
	}
	
	public void execute() {
		this.command.execute();
	}

}
