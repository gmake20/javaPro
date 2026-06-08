package days12;

/**
 * @author scm
 * @date 2026. 5. 27. 오후 4:20:38
 * @subject [this 키워드 설명] 
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. this 정의
		 *    ㄴ 참조변수
		 *   
		 *   int i=10; // 참조변수 X
		 *   
		 *   this : 멤버를 가리킬때 
		 */
		Employee emp1 = new Employee();
		// stack            heap
		// [0x100]          [null][0x100]
		// emp1             name  this
		//                  0x100
		emp1.dispName();
		
		Employee emp2 = new Employee();
		// stack            heap
		// [0x200]          [null][0x200]
		// emp2             name  this
		//                  0x200
		emp2.setName("홍길동");
		emp2.dispName();
	} 

}

// 사원 클래스
class Employee {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return this.name;
	}



	public void dispName() {
		System.out.println(this.name);
	}
}