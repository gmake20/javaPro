package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오전 11:21:44
 * @subject 증감연산자  ++   --
 * @content     피연산자(변수)의 값을 1증가 또는 1감소시키는 연산자.
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		int n = 10;

		System.out.println( n );

		// n 1증가 -> 출력
		// n = n + 1;
		// n += 1;
		// n++;     후위형 증감연산자
		++n;     // 전위형 증감연산자
		
		System.out.println( n );
		
		

	} // main

} // class











