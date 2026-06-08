package days02;

public class Ex07 {

	public static void main(String[] args) {
		String name = "이창익";
		// byte(127), short(32767), int(21억), long(900경)
		byte age = 20;
		// 학점 : A B C D F
		char grade = 'A';
		// Type mismatch: cannot convert from char to String
		// String grade = 'A';
		
		boolean gender = true; // false
		// String gender = "남자"; // "여자"
		//char gender = 'M'; // 'F'

		// 출력형식:  이름은 "이창익"이고, 나이는 '20'살이고, 학점은 'D'이고, 성별은 true입니다.		
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'이고, 성별은 %b입니다.",name,age,grade,gender);
		
	}

}
