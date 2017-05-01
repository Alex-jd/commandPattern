package equipment;

public class GarageDoor {
	String name = "";
	
	public GarageDoor(){}
	
	public GarageDoor(String name) {
		this.name = name;
	}
	
	public void up() {
		System.out.println(name + " Garage door is open");
	}

	public void down() {
		System.out.println(name + " Door is down");
	}

	public void stop() {
		System.out.println(name + " Door is stop");
	}

	public void lightOn() {
		System.out.println(name + " Garage light is on");
	}

	public void lightOff() {
		System.out.println(name + " Garage light is off");
	}
}
