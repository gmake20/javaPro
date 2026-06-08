package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오전 11:21:44
 * @subject 증감연산자  ++   --
 * @content     피연산자(변수)의 값을 1증가 또는 1감소시키는 연산자.
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		int n = 10;

//		 n += 5;
//		 n -= 5; 
		
		System.out.println( n );

		// n 1 감소 -> 출력
		n = n - 1;
		n -= 1;
		// 단독으로 사용될 때는 후위형이나 전위형의 결과값은 같다.
		n--;
		--n;
		
		
		System.out.println( n );
		
		

	} // main

} // class











