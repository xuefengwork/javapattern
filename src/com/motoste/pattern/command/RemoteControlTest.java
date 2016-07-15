package com.motoste.pattern.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		ControlerInvoker invoker = new ControlerInvoker();
		
		Light receiver = new Light();
		LightCommand command = new LightCommand(receiver);
		
		invoker.setCommand(command);
		invoker.execute();
	}
}
