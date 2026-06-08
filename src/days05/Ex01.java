package days05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
		 *   1) if문 사용해서 풀기
		 *   2) switch문 사용해서 풀기
		 *   
		*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n%2 == 0) {
			System.out.println("if:짝수");
		}
		else {
			System.out.println("if:홀수");
		}
		
		switch(n%2) {
		case 0:
			System.out.println("switch:짝수");
			break;
		case 1:
			System.out.println("switch:홀수");
			break;
		}
		
		String result = switch(n%2) {
		case 0 -> "짝수";
		default -> "홀수";
		};

		switch(n%2) {
		case 0 -> result = "짝수";
		default -> result = "홀수";
		};
		
		
		System.out.println(result);

	}

}
