package days15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {
	String name;
	String gearType;
	int door;
	
	// 인터페이스
	private Engine engine = null;
	
	Car(Engine engine) {
		this.engine = engine;
	}
	
//	public Engine getEngine() {
//		return engine;
//	}
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
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
