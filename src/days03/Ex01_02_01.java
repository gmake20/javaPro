package days03;

import java.util.Calendar;
// import java.lang.*;

/**
 * @author kenik
 * @date 2026. 5. 13. 오전 9:37:55
 * @subject 
 * @content 
 * 
 */
public class Ex01_02_01 {

   public static void main(String[] args) {
       boolean gender = true;
       System.out.printf("%b\n", gender);
      
      
      /*
       * %[argument_index$][flags][width][.precision]conversion
       * %conversion
       * %d
       * %c
       * %s
       * %f
       * %c
       * %b
       * */   

      
//      Calendar c = Calendar.getInstance();
//      String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
//      System.out.println( s );
      
      System.out.println( "-".repeat(50) );
      
      String name = "이창익";
      short tot = 253;
      double avg = 84.333333333333;
      
      // 출력형식: 이창익_이창익_이창익
      // System.out.printf("%s_%s_%s\n", name, name, name);
      // System.out.printf("%1$s_%1$s_%1$s\n", name);
      
      // System.out.printf("총점: [%10d]\n", tot);
      // System.out.printf("총점: [%-10d]\n", tot);
      
      //                       %  conversion
      // System.out.printf("평균: [%10.2f]\n", avg);
      
      int no = 10;  //  0010
      //  00001010
      //  00000000 00000000 00000000 00001010
      //System.out.printf("방번호: [%04d]\n", no);
      // 정수 %d 10진수 출력
      // 정수 %o 8진수 출력
      // 정수 %x 16진수 출력
      System.out.printf("방번호: [%d]\n", no); // 10
      System.out.printf("방번호: [%#o]\n", no); // 12
      System.out.printf("방번호: [%#x]\n", no); // a
      System.out.printf("방번호: [%#X]\n", no); // A
      
      
      int n = -123;
      // System.out.printf("n=%(d\n", n);
      
//      2진법: 0 1 
//      8진법: 0 1 2 3 4 5 6 7
//      10진법: 0 1 2 3 4 5 6 7 8 9
//      16진법: 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
      

   } // main

} // class







