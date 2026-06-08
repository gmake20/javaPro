package days03;

/**
 * @author kenik
 * @date 2026. 5. 13. 오후 4:21:51
 * @subject  산술연산자 설명 - 5개
 * @content  +  -  *   /  %  
 * 
 */
public class Ex08_02 {

   public static void main(String[] args) {
      
      int i = 10;
      int j = 3;
      
      System.out.println(  i + j ); // +
      System.out.println(  i - j ); // -
      System.out.println(  i * j ); // *
      System.out.println(  i / j ); // /   몫
      System.out.println(  i % j ); // /   나머지
      
      // [주의]
      // System.out.println(  10 / 0 ); // ArithmeticException
      // System.out.println(  10 % 0 ); // ArithmeticException

      // System.out.println(  10.0 / 0 ); // Infinity 무한대
      System.out.println(  10.0 % 0 ); // NaN == Not a Number 

   } // main

} // class







