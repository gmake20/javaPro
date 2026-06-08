package days11;

/**
 * @author scm
 * @date 2026. 5. 26. 오후 3:05:52
 * @subject 2명 - 4:50수업
 * @content  5:00..(양인석, 안정빈)
 *          클래스의 복사(copy)
 *          클래스의 복제(clone) - 얕은 복제/깊은 복제
 *          Tv 클래스 추가
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// Tv 객체 선언 및 생성하고
		// 객체명.필드명
		// 객체명.메소드명
		Tv t1 = new Tv();
		t1.power(); // false -> true
		System.out.println(t1.channel);
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power(); // true -> false

		System.out.println(" END ");
	}

}
