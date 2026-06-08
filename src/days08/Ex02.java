package days08;

import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 20. 오전 7:01:06
 * @subject 
 * @content 
 * 
 */
public class Ex02 {
   
   public static void main(String[] args) {
      
//      System.out.println( getYear());
	   System.out.println( toLowerCase("AxEtDD"));
      
      Date d = new Date();
      int currentYear = d.getYear() + 1900;
      System.out.println( isLeapYear( currentYear ) );
      
   } // main
   
   // 3. 1이상의 년도를 반환하는 메서드 
   public static int getYear() {
      String sYear;
      int year;      
      Scanner scanner = new Scanner(System.in);
      String regex = "^[1-9]\\d*$";
      do {
         System.out.print("> 년도 입력: ");
         sYear = scanner.next();  // "822"
      } while (  !sYear.matches( regex )  );
      year = Integer.parseInt(sYear);
      return year;
   }
   
   // 2. 문자열 -> 소문자 변환 반환
   public static String toLowerCase(String s) { 
      char [] sArr = s.toCharArray();
      char ch ;
      String result = "";
      for (int i = 0; i < sArr.length; i++) {
         ch = sArr[i];
         if( Character.isUpperCase(ch) ) {
            ch = Character.toLowerCase(ch);
         }
         result += ch;
      }
      return result; 
   }
   
   // 1. isLeapYear
   public static boolean isLeapYear(int year) {      
      boolean result = false;   
      if ( year%4==0 && year%100!=0 || year%400==0 ) {
         result = true;
      }            
      return result;
   }

} // class




/*
 * [ 메소드 선언하는 문제. ]
 * 
 * 1. 문자열을 매개변수로 받아서 소문자로 변환해서 반환하는 메서드를 선언하세요.
 *   메소드명: toLowerCase
 * 2. 1이상의 정수 년도만을 입력받아서 반환하는 getYear 라는 메소드를 선언하세요.
 * 3. 윤년/평년을 체크해서 boolean 으로 반환하는 isLeapYear 라는 메소드를 선언하세요.
 *    
 * */



