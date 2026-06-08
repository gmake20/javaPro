package days11;


public class Ex02 {

	public static void main(String[] args) {
		int i = 0; // 변수, 지역변수, 4바이트 -20억~20억의 정수 저장가능
		int[] m = new int[3]; // 변수, 지역변수, 참조변수, 배열명,

		
		
		// 변수 선언 형식
		// 객체 : 클래스를 자료형으로 선언된 참조변수
		// 클래스 : 객체의 설계도
		// 인스턴스 : 생성된 객체
		Car myCar; // 객체명
		myCar = new Car(); // 객체생성, 인스턴스화 
		// 힙
		//        인스턴스                                     객체
		// [name][speed][wheelCount][dCI주소참조]            [0x200번지]
		// 0x200번지                                          myCar
		
		// [dispCarInfo()] 코드
		
		
		myCar.name = "K9";
		System.out.println(myCar.name);
		myCar.dispCarInfo();
		
		Car bCar = new Car();
		bCar.name = "K5";
		bCar.dispCarInfo();
	}

}
