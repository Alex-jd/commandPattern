package commandObjects;

import equipment.CeilingFan;
import service.Command;

public class CeilingFanOn implements Command{
	
	CeilingFan ceilingFan;
	
	public CeilingFanOn(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
		
	}

	@Override
	public void undo() {
		ceilingFan.off();
		
	}
	

}
