package equipment;

public class CeilingFan {
	String name = "";
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed = 0;
	
	public CeilingFan(){}
	
	public CeilingFan(String name) {
		this.name = name;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(name + " Speed is high");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(name + " Speed is medium");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(name + " Speed is low");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(name + " Speed is off");
	}
	
	public void on() {
		System.out.println(name + " CeilingFan is on");
	}	
	
	public int getSpeed() {
		return speed;
	}

}
