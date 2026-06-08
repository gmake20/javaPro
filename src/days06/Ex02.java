package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오전 10:47:33
 * @subject 제어문 + 배열 
 * @content  ㄴ if 문 사용
 *           ㄴ 국어 점수 입력     0~100       101 엔터 + 유효성 검사
 *           ㄴ 수/우/미/양/가 출력
 *           
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		
		boolean isValid = true;  // 유효하다(true), 유효하지 않다(false)
		
		do {
			System.out.print("> 국어(kor) 입력: ");
			kor = scanner.nextInt();
			
			if (kor < 0 || kor > 100 ) {
				System.out.println("\t 국어 점수 입력 잘못!!!( 0~100 )");
				isValid = false;
			}
		} while ( !isValid );	
		//} while (  kor < 0 || kor > 100 );	
		//} while ( !(kor >=0 && kor <=100) );
						
//		System.out.println("> 국어: " + kor);
		
		// 0<= kor <=100 -> 수~가
		if ( 90 <= kor  ) {  // 87
			System.out.println("수");
		}else if ( 80 <= kor  ) {
			System.out.println("우");
		}else if ( 70 <= kor  ) {
			System.out.println("미");
		}else if ( 60 <= kor  ) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}

	} // main

} // class




