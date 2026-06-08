package days13;

public class Engine {
//	private String model;    // 모델명
//	private int displacment; // 배기량
//	private int horsepower;  // 마력
//	private boolean running; // 시동상태
	
	int speed; 

	void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
	}
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void stop() {
		this.speed = 0;
	}
}
