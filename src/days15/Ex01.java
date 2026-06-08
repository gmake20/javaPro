package days15;

/**
 * @author scm
 * @date 2026. 6. 1. 오전 9:01:05
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * [인터페이스(interface)]
		 * 1. 자바자료형
		 *   ㄴ 기본형 8가지
		 *   ㄴ 참조형 : 배열, 클래스(String), 인터페이스
		 * 2. (인터페이스는) 추상클래스이다. 
		 *   ㄴ 상수만 선언가능
		 *   ㄴ 100% 추상메서드 선언가능
		 *   ㄴ jdk1.8부터 : static 메서드, default 메서드 추가.
		 * 3. 인터페이스는 그 자체만으로 사용되지 않고, 다른 클래스를 선언하는데 도움을 줄 목적의 클래스
		 * 4. 선언형식
		 * [접근지정자] interface 인터페이스명 {
		 * }
		 * ㄴ 대문자로 시작
		 */

	}

}


interface IA {
	void test1(); // public abstract 가 생략되어 있음 
	void test2();
}


interface IB extends IA {
//	void test1(); // public abstract 가 생략되어 있음 
//	void test2();
	void test3();
}


interface ID {
	void test4();  
	void test5();
}

// interface는 다중상속이 가능하다.
abstract class Test2 implements IA,ID {
	
}


class Test implements IA {
	@Override
	public void test1() {
	}
	
	public void test2() {
	}
	
}

