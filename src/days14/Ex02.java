package days14;

import days12.Point;

/**
 * @author kenik
 * @date 2026. 5. 29. 오전 10:03:54
 * @subject        
 * @content 
 *   1. 사원클래스(Employee): 사원이라면 공통적으로 가지고 있는 멤버들을 구현한 클래스
 *   2. 정규직클래스(Regular)
 *   3. 영업직클래스(SalesMan)
 *   4. 임시직클래스(Temp)
 *   [ 상속 계층도 ]
		
		         Object            모든 클래스의 최상위 부모 클래스이다. 
		           ↑                
                Employee           
          ↑                  ↑
        Regular             Temp
          ↑
       SalesMan
       
       1. 상속성 정리
       2. 다형성 / 인터페이스
       3. 업캐스팅/ 다운캐스팅
       4. 오버로딩/ 오버라이딩
       5. 추상화(추상메소드, 추상클래스)
       6. this, super 키워드 설명
       7. final 키워드 설명.
       등등
 */
public class Ex02 {

	public static void main(String[] args) {
		
		/*
		// 1. Employee emp1
		Employee emp1 = new Employee("오수빈", "서울 강남구", "010-1234-1234", "2026-10-25");
		emp1.dispEmpInfo();
		*/
		
		/*
		// 2. Regular emp2;
		Regular emp2 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		emp2.dispEmpInfo();
		*/
		
		/* [클래스 간의 형변환] : 자동 UpCasting, 강제 DownCasting, ( cast 연산자 )
		// int i = (int) 100L;
		
		// [클래스 간의 형변환]
		// Employee         Regular
		// 부모클래스 <=참조=  자식객체를 생성  UpCasting(자동 업캐스팅)
		// 정규직(Regular)은 사원(Employee)이다 (O)
		//       상속(    is - a  ) 관계
		Employee emp1 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		// 문제점:  emp1.getPay();		
		//     E
		// [n][a][t][h]<p> [super][this]
		emp1.dispEmpInfo(); 
		// E emp1.dispEmpInfo() -> 실제자식객체의 dispEmpInfo() 메소드가 호출되더라. 
		
		// [클래스 간의 형변화]
		// 다운캐스팅( DownCasting )
		// Type mismatch: cannot convert from Employee to Regular
		Regular emp2 = (Regular) emp1;
		emp2.getPay();
		*/
		
		// [질문]
		
		// Point 클래스와 Employee 클래스가 형변호나 : 상속 관계
//		Point p = new Employee();
		
//		Object o1 = new Point();
//		Object o2 = new Employee();
		
		// [n][a][t][h] X
//		Employee emp1 = new Employee();
//		// Type mismatch: cannot convert from Employee to Regular
//		Regular emp2 = (Regular) emp1;  // DownCasting

	} // main

} // class






