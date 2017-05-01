package equipment;

public class Light {
	
	String local = "";
	
	public Light() {
		
	}
	
	public Light(String local) {
		this.local = local;
	}
	
	public void on() {
		System.out.println(local + " Light is on");
	}

	public void off() {
		System.out.println(local +  " Light is off");
	}
}
