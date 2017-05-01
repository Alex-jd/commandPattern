package commandObjects;

import equipment.Light;
import service.Command;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand (Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
