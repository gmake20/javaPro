package days14;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 12:03:39
 * @subject 
 * @content 
 * 
 */
public class Ex04 {
	
	// 필드
	//  ㄴ 인스턴스 변수
	//  ㄴ 클래스(static) 변수
	public static final double PI ;
	
	static {
		PI = 3.141592;
	}
	
//	{
//		PI = 3.141592;
//	}
	
//	public Ex04() {
//		PI = 3.141592;
//	}
	
	public static void test(final int n) {
		// n = 120;
	}

	public static void main(String[] args) {
		/*
		 * [ final 키워드 설명 ]
		 * 1. final + 변수 앞에 : 상수
		 *          ㄴ 지역변수
		 *          ㄴ 인스턴스 변수
		 *          ㄴ 클래스 변수
		 * 2. final + 클래스 앞에         
		 * */ 
		
		test(100);
		
//		final double PI = 3.141592;
		
//		PI= 3.14;

	} // main

} // class


//final class Parent{	
class Parent{	
	protected void test1() {
		System.out.println("> P.test1()...");
	}
	public final void test2() {  // 자식이 재정의할 수 없는 최종 메소드
		System.out.println("> P.test2()...");
	}
}

class Child extends Parent{
	@Override
	public void test1() {
		System.out.println("> C.test1()...");
	}
	
	/*
	// Cannot reduce the visibility of the inherited method from Parent
	@Override
//	void test2() {
	public void test2() {
		System.out.println("> C.test2()...");
	}	
	*/
}





