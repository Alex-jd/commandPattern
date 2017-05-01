package test;

import commandObjects.GarageDoorOpenCommand;
import commandObjects.LightOnCommand;
import equipment.GarageDoor;
import equipment.Light;
import implementPattern.SimpleRemoteControl;
import service.Command;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Command lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
		
	}

}
