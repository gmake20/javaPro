package days15;

import days14.Employee;

/**
 * @author scm
 * @date 2026. 6. 1. 오전 10:44:55
 * @subject 
 * @content  4) 익명==무명(Anonymous) 클래스 
		 *       - 클래스의 선언 + 객체 생성 합쳐진 이름없는 클래스 
		 *       - 일회용.
		 *       
		 *       1) 이름이 없는 클래스(일회용)
		 *       2) 클래스 선언
		 *       3) 선언형식
		 *       	(1) new 부모클래스명() {
		 *       			// 필드선언 X
		 *       			// 메소드 선언 X
		 *       			@Override
		 *       			// 부모클래스 메소드만 재정의할수있다.
		 *              }
		 *          (2) new 인터페이스명() {
		 *       			// 필드선언 X
		 *       			// 메소드 선언 X
		 *       			@Override
		 *       			// 인터페이스 추상`메소드만 재정의할수있다.
		 *              }
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// Car,    Engine -> 상용화 테스트용도의 새로운 엔진객체
		Car testCar = new Car(new Engine() {
			
			@Override
			public void stop() {
				System.out.println("일회용 엔진의 stop()");
			}
			
			@Override
			public void moreFuel(int fuel) {
				System.out.println("일회용 엔진의 moreFuel()");
				
			}
			
			@Override
			public void lessFuel(int fuel) {
				System.out.println("일회용 엔진의 moreFuel()");
				
			}
		}
		);
		
		testCar.speedUp(100);
		testCar.stop();

		// Employee는 abstract class라서 바로 생성이 안됨. 익명클래스로 생성하였다.
		// Cannot instantiate the type Employee
		Employee emp = new Employee("홍길동","주소","연락처","입사일자") {
			
			@Override
			public int getPay() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		emp.dispEmpInfo();
	}

}
