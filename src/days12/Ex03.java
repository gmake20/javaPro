package days12;

/**
 * @author scm
 * @date 2026. 5. 27. 오전 11:07:23
 * @subject 
 * @content
 */
public class Ex03 {
	// (2) 멤버변수, 필드
	int age;	// 인스턴스 변수
	static int kor; // 클래스(static) 변수
	
	{
		// 초기화 블럭 - 지역변수
		int age;
	}
	
	public static void main(String[] args) {
		/*
		 * [자바 변수 종류 : 선언 위치에 따른 종류]
		 * 1. (1) 지역변수 - 메소드안, 초기화블럭안, 생성자 안 - 생성시기 : 변수 선언문이 실행될때
		 * 2. 인스턴스변수 - 클래스 안   : 인스턴스가 생성될때
		 * 3. 클래스 변수 - 클래스 안   : 클래스가 메모리에 올라갈때
		 */

		int age;
		
		/* [메모리 구조] 
		 * 응용프로그램을 실행 -> JRE(JVM) -> OS응용프로그램이 실행하는데 필요한 메모리를 할당.
		 * JVM의 용도에 따라 나누어서 관리
		 * 
		 * 1. Mathod Area
		 *    ㄴ 프로그램 실행시 클래스파일(.class)로 부터 읽어들인  클래스에 대한 정보를 저장
		 *    ㄴ 클래스(static) 변수
		 * 2. Call Stack 스택영역
		 *    ㄴ 메소드가 호출할때 메서드에서 사용할 저장공간
		 *    ㄴ 지역변수
		 * 3. Heap 힙영역
		 *    ㄴ new 연산자에 의해서.. 저장공간
		 *    ㄴ new int[3]   배열 생성
		 *    ㄴ new Student() 객체생성
		 *    ㄴ 인스턴스 변수 
		 *    
		 * 
		 */
	}

}
