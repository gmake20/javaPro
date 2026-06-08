package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오후 3:17:14
 * @subject 제어문 + 배열
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// ASCII 출력: 7비트(128가지)+8비트(256가지)
		// 'A'-65 / 90
		// 'a'-97 / 122
		// '0'-48
		// 0~31: 제어문자  '\n' '\t'  '\r' 등등
		// 32~127: 일반문자( 대, 소, 숫 )
		// 128~
		/*
		for (int i = 0; i < 256; i++) {
			System.out.printf("\'%c\'(%d)", (char)i, i);
		}
		*/
		
		// 한 라인에 10개의  ASCII 출력
		// (풀이) 10개의 ASCII을 출력하고 나서  개행(System.out.println())을 추가. 
		/*
		 * 1 :  0  12345678 9 + 개행
		 * 2 : 10 ~        19 + 개행
		 * 3 : 20 ~        29 + 개행
		 * */
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if( i%10==0) System.out.printf("%d: ", lineNumber);
			System.out.printf("\'%c\'(%d)", (char)i, i);
			if( i%10==9) {
				System.out.println();
				// 10개 라인이 출력되었는지 확인 ...
				if(lineNumber%10==0) {
					System.out.println("\t 계속하려면 엔터치세요...");
					scanner.nextLine(); //
				}				
				lineNumber++;
			}
		}

	} // main

} // class







