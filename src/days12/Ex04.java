package days12;

/**
 * @author scm
 * @date 2026. 5. 27. 오전 11:36:07
 * @subject 생성자
 * @content 위치를 나타낼때 x,y좌표가 필요하다
 * 			-> 위치를 나타내는 속성+메소드를 구현한 클래스 선언
 *          1) 일종의 메소드이다.
 *          2) 리턴자료형 없음,  생성자명 == 클래스명
 *          3) 매개변수가 없는 생성자: 디폴트(Default) 생성자
 *          4) 생성자는 인위적으로 호출 할 수 없다. 언제? 객체 생성할 때 자동으로 호출된다. 
 *                                               new Point();
 *          5) 생성자 역할: 필드를 초기화
 *          6) 생성자 오버로딩가능
 *          7) 생성자는 상속되지 않는다.
 *          8) 생성자가 존재 하지 않을경우
 *             디폴트 생성자를 컴파일러가 붙여준다.
 *          
 */
public class Ex04 {

	// 접근지정자 기타제어자 자료형 필드면[=초기값];
	public int age = 20;
	
	public static void main(String[] args) {
		// 1. Point 객체 선언 : p1
		Point p1 = new Point();
		p1.dispPoint();
		/*
		 * call stack                   heap
		 * [0x100]
		 * p1
		 * 객체                          인스턴스
		 * 
		 * method area
		 */
		p1.x = 1;
		p1.y = 2;
		
		// The constructor Point(int, int) is undefined
		Point p2 = new Point(3,4);
//		p2.x = 3;
//		p2.y = 4;
//		
//		// 
		p2.dispPoint();
		
		Point p3 = new Point(100);
		p3.dispPoint();
		
	}

}
