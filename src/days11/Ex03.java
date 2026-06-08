package days11;

public class Ex03 {

	public static void main(String[] args) {
		Car myCar = null;  // 객체이지만 인스턴스는 아님
		// 힙
		//        인스턴스 X                                    객체
		// [name][speed][wheelCount][dCI주소참조]            [0x200번지]
		
		
/*		
		myCar = new Car();
		// 위의 코드가 없으면, 실행시 아래의 오류나옴
		// Exception in thread "main" java.lang.NullPointerException: Cannot assign field "name" because "myCar" is null
		
		// The local variable myCar may not have been initialized
		myCar.name = "K9";
*/
	
		
		myCar = new Car();
		testInstance(myCar);
		
		myCar.dispCarInfo();

	}

	private static void testInstance(Car myCar) {
		myCar.name = "K9";
		
		myCar.dispCarInfo();
	}

}
