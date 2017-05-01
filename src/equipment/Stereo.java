package equipment;

public class Stereo {
	
	String name = "";
	private Integer volume = 0;
	
	public Stereo() {
		
	}
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " Stereo is on");
	}

	public void off() {
		System.out.println(name + " Stereo is off");
	}
	
	public void setCD() {
		System.out.println(name + " The CD is insert");
	}
	
	public void setDVD() {
		System.out.println(name + " The DVD is insert");
	}

	public void setRadio() {
		System.out.println(name + " The Radio in on");
	}
	
	public void setVolume(Integer volume) {
		System.out.println(name + " Volume is " + volume);
		this.volume = volume;
	}
	
	public Integer getVolume() {
		return volume;
	}
}

