package commandObjects;

import equipment.CeilingFan;
import service.Command;

public class CeilingFanOff implements Command{
	CeilingFan ceilingFan;
	
	public CeilingFanOff(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
		
	}
	
	@Override
	public void undo() {
		ceilingFan.on();
	}
	
	

}
