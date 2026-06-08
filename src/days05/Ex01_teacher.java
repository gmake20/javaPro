package days05;

import java.util.Scanner;

// import check.UserDto;

/**
 * @author kenik
 * @date 2026. 5. 15. 오전 8:15:34
 * @subject 장미성(30분)
 * @content 
 * 
 */
public class Ex01_teacher {

   public static void main(String[] args) {
      /* 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
       *   1) if문 사용해서 풀기
       *   2) switch문 사용해서 풀기
       */

      int n;
      Scanner scanner = new Scanner(System.in);

      System.out.print("> 정수(n) 입력: ");
      n = scanner.nextInt();

      //System.out.printf("정수(n):%d\n", n);

      /*
      if( n % 2 == 0 ) {
         System.out.println("짝수");
      } else {
         System.out.println("홀수");
      }
       */

      String result = "홀수";
      // 1) if 문 풀이
      if( n % 2 == 0 )  result = "짝수" ;
      System.out.println(result);

      // 2) switch문 풀이
      /*
      switch ( n%2 ) {
      case 0:
         result = "짝수" ;
         break; 
      default: // case 1:
         result = "홀수";
         break;
      }
       */

      result = switch (n%2) {
      case 0 -> "짝수";
      default -> "홀수";
      };

      switch (n%2) {
      case 0 -> result = "짝수";
      default -> result= "홀수";
      }

      System.out.println(result);
   } // main

} // class






/*
 * [복습문제]
 * 
 * 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
 *   1) if문 사용해서 풀기
 *   2) switch문 사용해서 풀기
 * 
 * 2. 1+2+3+...+9+10=55
 *    1에서 10까지의 합을 출력하는 코딩.
 *    1) for문 사용해서 풀기
 *    2) while문 사용해서 풀기
 * 
 * 3. 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
 *    ( 조건: Scanner 사용하기 ) 
 *    
 *    입력형식:
 *    > 이름 나이 키 성별 입력 ? 홍길동 20 178.89 true
 *    
 *    출력형식:
 *    > 이름:홍길동, 나이:20살, 키:178.89cm, 성별:남자
 *   
 * */

