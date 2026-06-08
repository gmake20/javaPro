package days07;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 3:04:45
 * @subject 메소드 선언 + 제어문 예제.
 * @content 년도를 입력받아서 윤년/평년 출력 코딩.
 *            ㄴ 윤년?  평년?
 *          1년: 지구-태양 1바퀴( 공전 ) - 365.2422일  
 *          율리우스력: 365.25
 *          그레고리력: 365.2425
 *          400년          97일 
 *          치윤법 - 4의 배수: 윤년  100일
 *                - 100의 배수년:   -4일
 *                - 400의 배수년:    1일
 *                
 *          1) 년도를 입력받아서 반환하는 메서드: int getYear()  
 *          2) 윤년/평년 체크하는 메서드      : boolean isLeapYear(입력받은년도)
 */
public class Ex06 {

   public static void main(String[] args) {
      int year = getYear();
      
      if (  isLeapYear(year) ) {
         System.out.println("윤년");
      } else {
         System.out.println("평년");
      }
      
      for(int i=1;i<=400;i++ ) {
          if (  isLeapYear(i) ) {
              System.out.println(""+ i + ":윤년");
           } else {
              //System.out.println(""+ i + "평년");
           }
    	  
      }

   } // main

   public static boolean isLeapYear(int year) {
      /*      [치윤법]  
       *      ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
       *              year%4==0 
       *      ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
       *           year%100!=0
       *      ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
       *           year %400==0
       */ 
      if ( year%4==0 && year%100!=0 || year %400==0) {
         return true;
      } else {
         return false;
      }
       
   }

   public static int getYear() {
      // 유효한 년도는 1 이상의 정수 ...
      Scanner scanner = new Scanner(System.in);
      int year ;
      String sYear;
      do {
         System.out.print("> 년도 입력: ");
         sYear = scanner.next();
      }while(  !sYear.matches("^[1-9][0-9]*$") );
      
      year = Integer.parseInt(sYear);
      return year;
   }

} // class
