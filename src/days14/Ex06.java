package days14;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 3:03:18
 * @subject 추상화
 * @content  ㄴ 추상 메소드, 추상 클래스
 *           ㄴ 공통적인 부분(멤버)만을 미리 선언한 클래스
 */
public class Ex06 {

	public static void main(String[] args) {
		// Cannot instantiate the type Employee
//		Employee emp1 = new Employee("오수빈", "서울 강남구", "010-1234-1234", "2026-10-25");
//		emp1.dispEmpInfo();
		
		Employee emp1 = new Regular("이시연", "서울 영등포구", "010-3533-4455", "2026-10-25", 3000000);
		emp1.getPay();

	} // main

} // class
