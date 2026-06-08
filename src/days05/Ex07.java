package days05;

import java.util.Iterator;

/**
 * @author kenik
 * @date 2026. 5. 15. 오후 2:02:57
 * @subject [로또 번호 발생..]
 * @content > 1~45 정수 6
 * 
 */
public class Ex07 {
   public static int getRandomNumber(int s, int e) {
      return (int) (Math.random() * e - s + 1) + s;
   }

   public static void main(String[] args) {
      // 0.0 <= double Math.random() < 1.0
      // 1 <= 로또번호 <= 45

      // 0.0 <= double Math.random() * 45 < 45.0
      // 1 <= (int)(Math.random() * 45)+1 < 46

      // for (int i = 1; i <= 10; i++) {
      // System.out.println( Math.random() );
      // }

      // Type mismatch: cannot convert from double to int
      // int i = (int) 3.14;
      // System.out.println( i );

      // 0<= ~ <=100 정수 국어점수를 랜덤하게 발생시키는 코딩.
      // 0.0 <= double Math.random() < 1.0
      // 0 <= (int)( Math.random()*101 ) < 101

      for (int i = 1; i < 200000; i++) {
         int n = (int) (Math.random() * 10) + 1;
         if (n < 1 || n > 10)
            System.out.println("X");
      }

      System.out.println("END");

   } // main

} // class
