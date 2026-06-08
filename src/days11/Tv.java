package days11;

public class Tv {
	// field - 속성(특징)
	public String color;
	boolean power = false;
	public int channel = 11;     

	// method - 동작(기능)
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
