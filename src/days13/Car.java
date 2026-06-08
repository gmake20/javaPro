package days13;

public class Car {
	String name;
	String gearType;
	int door;
	
	// Car와 engine은 has-a 관계 
	private Engine engine;
	
	Car(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}

	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}

	void stop() {
		this.engine.stop();
	}
	
}
