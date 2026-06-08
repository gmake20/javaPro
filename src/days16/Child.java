package days16;

// days16.Parent 같은 패키지 내부
public class Child extends Parent {
	void modiferAccessTest() {
		this.pub = 1;
		this.pro = 1;
		this.def = 1;
	}
}
