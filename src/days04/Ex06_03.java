package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오전 11:35:07
 * @subject    ++n 전위형 증감연산자
 * @content    n++ 후위형 증감연산자
 *             전위형과 후위형 증감 연산자의 차이점
 * 
 *             instanceOf 연산자
 */
public class Ex06_03 {

	public static void main(String[] args) {
		
		int x = 10;
		// int y = x++; // 후위형 증감연산자.   > x=11, y=10
		int y = ++x; // 전위형 증감연산자.      > x=11, y=11
		
		// while( 10 > x++) {}
		// while( 10 > ++x) {}
		
		System.out.printf("> x=%d, y=%d\n", x, y );

		
		// int y = ++x + x-- + x++; X

	} // main

} // class




