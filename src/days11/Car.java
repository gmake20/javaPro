package days11;

// 신형 자동차 클래스 선언
public class Car {
	// 멤버
	String name;
	int speed;
	int wheelCount;
	
	// 멤버함수 (method), 
	public void dispCarInfo() {  // {} 블록
		System.out.printf("> 차이름:%s, 속도:%d\n",name,speed);
	}
}


