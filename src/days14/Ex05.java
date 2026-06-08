package days14;

import java.util.ArrayList;
import java.util.HashSet;

import days12.Point;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 12:43:28
 * @subject 캡,상,[다형성],추
 * @content 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 1. 다형성( polymorphism )
		 *    ㄴ 다양한 성질
		 *    ㄴ 여러 가지 형태(Type)를 가질 수 있는 능력
		 *    ㄴ 사용방법은 동일하지만 실행결과가 다양하게 나오는 성질
		 *    ㄴ 다형성을 구현하는 방법 : UpCasting, Override
		 *    
		 * 2. 필드 다형성
		 *    Employee emp1  = new Regular();
		 *    Employee emp1  = new SalesMan();
		 *    
		 * 3. 매개변수 다형성 ***
		 * */
		
		/*
		Regular emp2 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		emp2.dispEmpInfo();
		SalesMan emp3 = new SalesMan("조지훈", "서울 성북구", "010-9867-3422", "2026-10-11", 1000000, 20, 1500000);
		Temp emp4  = new Temp("문규리", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);

		emp2.dispEmpInfo();
		emp3.dispEmpInfo();
		emp4.dispEmpInfo();
		*/ 
		
		/*  여러 가지 형태(Type)를 가질 수 있는 능력 : 업캐스팅
		Employee emp2 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		Employee emp3 = new SalesMan("조지훈", "서울 성북구", "010-9867-3422", "2026-10-11", 1000000, 20, 1500000);
		Employee emp4  = new Temp("문규리", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		*/
		
		// 클래스 배열 초기화
		/*
		Employee [] emps = {
				new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000)
				, new SalesMan("조지훈", "서울 성북구", "010-9867-3422", "2026-10-11", 1000000, 20, 1500000)
				, new Temp("문규리", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000)
		}; 

		for (int i = 0; i < emps.length; i++) {
			emps[i].dispEmpInfo();
		}
		*/
		
		ArrayList list = new ArrayList();		
		HashSet  set = new HashSet(list); // 매개변수 다형성
		// Collection c =  ArrayList
		// Employee e = new SalesMan();
 
		Regular emp2 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		SalesMan emp3 = new SalesMan("조지훈", "서울 성북구", "010-9867-3422", "2026-10-11", 1000000, 20, 1500000);
		Temp emp4  = new Temp("문규리", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);

		//사원정보출력공통적인메소드( emp2 );
		사원정보출력공통적인메소드( emp3 );
		//사원정보출력공통적인메소드( emp4 );
	} // main
	
	public static void 사원정보출력공통적인메소드(Employee emp) { // 매개변수 다형성
    	// emp.dispEmpInfo();
		if (  emp instanceof SalesMan ) {    // 반드시 자식 클래스 타입부터 체크
			System.out.println("SalesMan 타입.");
			
			SalesMan s = (SalesMan)emp;  // 다운 캐스팅~ 
			// s
			// s 
			
		}else if (  emp instanceof Regular  r ) { // jdk 17
			System.out.println("Regular 타입.");
		}else if (  emp instanceof Temp ) {
			System.out.println("Temp 타입.");
		}
		
    }
	
	/* JDK 21 권장.
	public static void 사원정보출력공통적인메소드(Employee emp) {

	    switch (emp) {
	        case SalesMan s -> System.out.println("SalesMan 타입.");
	        case Regular r -> System.out.println("Regular 타입.");
	        case Temp t -> System.out.println("Temp 타입.");
	        case null -> System.out.println("사원 정보 없음");
	        default -> System.out.println("알 수 없는 타입");
	    }
	}
	*/
	
	/*
	public static void 사원정보출력공통적인메소드(Temp emp) {
    	emp.dispEmpInfo();
    }
	
	public static void 사원정보출력공통적인메소드(SalesMan emp) {
		emp.dispEmpInfo();
	}
	
    public static void 사원정보출력공통적인메소드(Regular emp) {
    	emp.dispEmpInfo();
    }
    */

} // class







