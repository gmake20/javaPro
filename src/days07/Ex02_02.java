package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오전 10:33:37
 * @subject 기본형을 사용하기 편리한 기능(메서드)를 구현한 물건(클래스, 객체, 개체)
 * @content  ㄴ 래퍼(wrapper)클래스
 * 
 *           int  -> Integer
 *           char -> Character
 *           
 *           short -> Short
 *           long -> Long
 *           :
 * 
 */
public class Ex02_02 {

   public static void main(String[] args) {
      
      System.out.println( Integer.toBinaryString(10) ); // String "1010"
      System.out.println( Integer.toOctalString(10) );
      System.out.println( Integer.toHexString(10) );
      
      System.out.println( Integer.MAX_VALUE);
      
      int z = Integer.parseInt("100");
      
//      int x = 2147483647;
      int x = Integer.MAX_VALUE;
      
      int y = x + 100;
//      long y = x + 100;
      
      System.out.println( y );  // -2147483549

      

   } // main

} // class







