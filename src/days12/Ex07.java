package days12;

/**
 * @author scm
 * @date 2026. 5. 27. 오후 3:35:39
 * @subject getter, setter 설명
 * @content Person class 
 */
public class Ex07 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setGender(false);
		p1.dispPerson();
		
		
		Person p2 = new Person("김철수", 32, true);

	}

}
