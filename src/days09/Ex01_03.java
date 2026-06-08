package days09;

import java.io.IOException;

/**
 * @author kenik
 * @date 2026. 5. 21. 오전 10:19:20
 * @subject 
 * @content 
 * 
 */
public class Ex01_03 {

   public static void main(String[] args) throws IOException {
      
      int ch ;
      // 1.
      System.out.print("> 한 문자 입력: ");
      ch =  System.in.read();
      System.out.println("> ch: "+ ch);
//      System.in.read(); // 13
//      System.in.read(); // 10
      
      System.in.skip( System.in.available() );
      
      // 2.
      System.out.print("> 한 문자 입력: ");
      ch =   System.in.read();
      System.out.println("> ch: "+ ch);

      System.out.println(" END ");
   } // main

} // class









