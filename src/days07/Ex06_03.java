package days07;

import java.util.Date;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 4:35:26
 * @subject 1년 ~ 2026년 까지 총 몇 번의 윤년이 있었는지 계산.
 * @content
 * 
 */
public class Ex06_03 {

   public static void main(String[] args) {
      Date d = new Date();
      int currentYear = d.getYear() + 1900;

      int count = currentYear / 4 - currentYear / 100 + currentYear / 400;

      /*
       * [풀이 1]
       * int count = 0;
       * for (int i = 1; i <= currentYear ; i++) {
       * if( Ex06.isLeapYear(i) ) count++;
       * } // for i
       * System.out.println( count );
       */

   } // main

} // class
