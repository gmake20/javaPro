package days11;

public class Ex06 {

	// 중첩(Inner)클래스 선언할때 : protected, private 접지 사용가능)
	protected class InnerEx06 {
		
	}
	
	public static void main(String[] args) {
		/*
		 * 1. 클래스 앞에 사용하는 접근지정자
		 * 		1) public	 // 활성화
		 * 		   ㄴ 패키지 내/외부에서 가용가능(참조,상속)가능
		 *      2) (default) // 활성화
		 *         ㄴ Inner class , 패키지 내부에서만 사용가능 
		 *         
		 *      중첩(내부)클래스를 사용할때만 가능 
		 * 		3) protected // 비활성화
		 *      4) private   // 비활성화
		 *      
		 * 2. 멤버 (필드,메서드) 앞에 사용하는 접근지정자
		 * 		1) public : 패키지 내부/외부 어디서나 접근(참조) 가능하다.
		 * 		2) protected  : default + 상속
		 *      3) (default) : 패키지 내부에서만 접근(참조) 가능하다.
		 *      4) private : 같은 클래스 내에서만 접근 가능하다.
		 */
		
		// Sample s = new Sample();

		Time t1 = new Time();
		
		// 싱글톤
		// getter / setter 
		
	}

}
