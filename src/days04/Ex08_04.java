package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 14. 오후 3:04:46
 * @subject 정수(n)을 입력받아서 짝수/홀수 출력
 * @content 
 * 
 */
public class Ex08_04 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수(n) 입력: ");
		n = sc.nextInt(); 

		String result = "홀수";
		if ( n % 2 == 0)	result = "짝수";
        System.out.println(result); 
		System.out.println(" END ");
		
        /* [1] if~else~구문 설명
		String result = "짝수";
		if ( n % 2 == 0)   result = "짝수";
		else               result = "홀수";
		 
		*/
		
		
	} // main

} // class






