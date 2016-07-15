package com.motoste.pattern.command;


public class LightCommand implements Command {

	Light light;
	
	public LightCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
