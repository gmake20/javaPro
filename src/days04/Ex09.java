package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 14. 오후 3:20:01
 * @subject 분기문: switch문 
 * @content 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수(n) 입력: ");
		n = sc.nextInt();
		
		// [4] JDK 14 이상
		String result =  switch ( n % 2 ) {
		  case 0 -> "짝수";
		  default -> "홀수";
		};
		System.out.println(result);
		
		// [3] JDK 14 이상
		/*
		switch ( n % 2 ) {
		case 0 ->
		   System.out.println("짝수");
		default ->
		   System.out.println("홀수");
		}
		*/		
				
		// [2]
		/*
		String result ;
		switch (  n % 2  ) {
		case 0:
			result = "짝수";
			break; 
		default: // case 1:
			result ="홀수";
			break;
		} // switch
		
		System.out.println( result );
		*/
		
		/* [1]
		switch (  n % 2  ) {
		case 0:
			System.out.println("짝수");
			break; 
		default: // case 1:
			System.out.println("홀수");
			break;
		}
		*/
		
		
		System.out.println(" END ");

	} // main

} // class







