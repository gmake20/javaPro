package days09;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 21. 오전 10:38:53
 * @subject  10 -> 00001010   제어문 연습 + 배열 + String 메서드 
 * @content 
 * 
 */
public class Ex02 {
   
   public static void main(String[] args) {      
//      System.out.println( Integer.toBinaryString(10) );
      
      int n  = 10;
      String s = binaryConvert(n);
      System.out.println( s );
      
   } // main

   private static String binaryConvert(int n) {
      int [] m = new int[8];
      int index = m.length - 1;
      int share = n, rest;
      while (share != 0 ) {
         rest = share % 2;
         share = share / 2;
         // System.out.println( rest );
         m[index--] = rest;
      }      
      System.out.println( Arrays.toString( m ));
      return null;
   }

} // class


