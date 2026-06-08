package days15;

import days16.Parent;

// days16.Parent 다른 패키지 내부
public class Child  extends Parent {
	void modiferAccessTest() {
		this.pub = 1;
		this.pro = 1;  // default(패키지 내부) + 상속
		// this.def = 1; default는 패키지 내부에서만 가능
	}
}
