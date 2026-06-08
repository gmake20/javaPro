package days04;

import java.util.Iterator;

/**
 * @author kenik
 * @date 2026. 5. 14. 오후 4:03:07
 * @subject [반복문 for문 설명]
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		/*
		반복변수   조건식
		  i
		 
		 [1]     1<10 참
		 [2]     2<10 참
		 :
		 [8]     8<10 참
		 [9]     9<10 참
		 [10]    10<10 거짓
		실행문
		 	0
		 	1
		 	2
		 	:
		 	8
		 	9
		*/
		
		for (int i = 1; i <= 10; i++) {
			System.out.println( "이창익-"+ i );
		} // for
		
		System.out.println( "END");
		
		/*
		for (  초기식 ; 조건식 ; 증감식 ) {
			  실행문
		}
		
		(1) 초기식 -> (2) 조건식 -> 참 -> { (3)실행문 } -> (4) 증감식
		*/
		
		// for 반복문 사용.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("이창익");
//		}
		
		
		// Ctrl + Alt + 방향키
		// 본인이름 출력 X 10 번 반복..
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");
//		System.out.println("이창익");

	} // main

} // class






