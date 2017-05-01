package implementPattern;

import service.Command;

public class SimpleRemoteControl {
	
	Command slot;
	
	public void setCommand (Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
