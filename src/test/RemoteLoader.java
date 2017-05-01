package test;

import commandObjects.*;
import equipment.*;
import implementPattern.RemoteControl;
import service.Command;

public class RemoteLoader {
	
	public static void main (String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		
		Command ceilingFanOn = new CeilingFanOn(ceilingFan);
		Command ceilingFanOff = new CeilingFanOff(ceilingFan);
		
		Command garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOff(stereo);
		
		Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		Command ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		Command ceilingFanOffSecond = new CeilingFanOffCommand(ceilingFan);
		
		Command[] partyOn = { livingRoomLightOn, ceilingFanHigh, stereoOnWithCD, garageDoorUp};
		Command[] partyOff = { livingRoomLightOff, ceilingFanOffSecond, stereoOff, garageDoorDown};
		
		Command partyOnMacro = new MacroCommand(partyOn);
		Command partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOffSecond);
		remoteControl.setCommand(6, ceilingFanMedium, ceilingFanOffSecond);
		remoteControl.setCommand(7, ceilingFanLow, ceilingFanOffSecond);
		remoteControl.setCommand(8, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(7);
		remoteControl.offButtonWasPushed(7);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(6);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		System.out.println(remoteControl);
		System.out.println("---- Pushing Macro On ------");
		remoteControl.onButtonWasPushed(8);
		System.out.println("---- Pushing Macro Off ------");
		remoteControl.offButtonWasPushed(8);
		remoteControl.undoButtonWasPushed();
		
		
	}

}
