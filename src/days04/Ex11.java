package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오후 4:47:58
 * @subject [ 조건반복문: while문 ] 
 * @content  1+2+3+4+5+6+7+8+9+10=55
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		// 조건반복문
		while (condition) {
			
		} // while
		*/
		
		/*
		 i = 4;    ( 3 <= 10 T )
		 sum = 9;  2+3+4+5+6+7+8+9+10+11
		 
		 
		 1+2+
		 * */
		int i = 1;
		int sum = 0;
		while ( i <= 10 ) {
			System.out.printf("%d+", i);
			sum += i;  //sum = sum + i;
			i++;
		} // while
		System.out.printf("=%d\n", sum);
		
		System.out.println(" END ");

		// if 홀/짝
		// switch 홀/짝
		// for  1~10합
		// while1~10합
	} // main

} // class












