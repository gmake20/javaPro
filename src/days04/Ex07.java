package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오전 11:49:36
 * @subject 
 * @content 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 연산자:   연산자를 사용해서 수식 ...
		int n = 10;
		char ch = '7';
		// 1) 짝수이다 :    n % 2 == 0
		// 2) 홀수이다 :    n % 2 == 1  또는  n % 2 != 0
		// 3) 3의 배수이다 : n % 3 == 0
		// 4) 2의 배수이지만 6의 배수는 아니다: 
		//    n % 2 == 0 && n % 6 != 0
		// 5) 문자 ch가 숫자('0'~'9')문자이다: 
		// '0'(48) ~ '9'(57) 
//		System.out.printf("'%c'(%d)\n", '0', (int)'0');
//		System.out.printf("'%c'(%d)\n", '9', (int)'9');
		
		// (1) ch == '0' ||  ch == '1' ||  ~ ch == '9'
		
		// The operator <= is undefined for the argument type(s) boolean, int
		//                  --------------->
		// (2) System.out.println( 48 <= ch  &&  ch <= 57 ); 
		// (3) System.out.println( '0' <= ch  &&  ch <= '9' ); 
		
		// 6) 문자 ch가 대문자인지 체크:   'A' <= ch && ch <= 'Z'
		//   A 65 B 66 C 67 ~ Z 92

		// 7) 문자 ch가 소문자인지 체크:   'a' <= ch && ch <= 'z'
		
		// 8) 문자 ch가 알파벳(대+소문자)인지 체크: ('A' <= ch && ch <= 'Z')  || ('a' <= ch && ch <= 'z')

	} // main

} // class






