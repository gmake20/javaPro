package days03;

/**
 * @author scm
 * @date 2026. 5. 13. 오전 11:39:10
 * @subject 음수 표현 방법: (2의 보수법)
 * @content 
 * 
 */
public class Ex01_04 {

   public static void main(String[] args) {
      
      byte i = -10;
      // 10  [0][0][0][0][1][0][1][0]
      // -10 [1][1][1][1][0][1][1][0]
      
      // STEP1 절대치 |-10|  ->  10  -> 00001010
      // STEP2 1의 보수                 11110101
      // STEP3 +1                             1
      //                               11110110

      /* [문제]
       * 어떤 음수를 2의 보수법을 취해서 나온 결과값이    10101010
       * STEP3 -1                                 10101001 
       * STEP2 1의 보수                            01010110
       * STEP1 절대치 |-??|                              86
       * -86 
       * */      

   } // main

} // class
