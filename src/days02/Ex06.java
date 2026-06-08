package days02;

public class Ex06 {

	public static void main(String[] args) {
	  // 성, 이름 저장하는 변수 선언
	  // 값 할당
	  // 출력형식:     이 창익
	  // 출력형식:     이름은 "이 창익"입니다.		
		String firstName="창만",lastName="신";
		
//		System.out.println(lastName + " " + firstName);
//		System.out.println("이름은 \"이 창익\"입니다.");
		
		System.out.println(String.format("이름은 \"%s %s\"입니다.", lastName,firstName));
		System.out.println("이름은 \"%s %s\"입니다.".formatted(lastName,firstName));
		System.out.println("이름은 \"" + lastName + " " + firstName + "\"입니다.");
		// %s : 문자열 출력
		System.out.printf("이름은 \"%s %s\"입니다.", lastName,firstName);
	}

}
