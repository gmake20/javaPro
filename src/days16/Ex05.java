package days16;

public class Ex05 {

	public static void main(String[] args) {
		// [Wrapper class]
		// 기본형 -> 기능을 구현한 class
		// [오토박싱 / 오토언박싱] 용어 이해
		int i = 100;
		Integer j = i; // 오토박싱 : 기본형 -> 래퍼클래스로 변환 
		int k = j;     // 오토언박싱 : 래퍼클래스객체 -> 기본형 변환

		disp(10);
	}

	static void disp(Object obj) { // 10(int) -> Integer -> Object 
		System.out.println(obj.getClass());
		System.out.println(obj);
		
		System.out.printf("\n");
	}
	
}
