package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 5:40:05
 * @subject 버블정렬
 * @content 1) 정렬(Sort)
 *            - 특정 기준에 맞게 데이터를 열거하는 알고리즘
 *            -  성적, 키 순 정렬
 *            -  오름차순 정렬( [Asc]ending Sort )
 *                1 2 3 4 5
 *                a b c d e
 *                가 나 다 라 마 
 *            -  내림차순 정렬( [Desc]ending Sort )
 *                5 4 3 2 1
 *                e d c b a
 *                마 라 다 나 가
 *            - [버블], 선택, 삽입, 쉘, 병합 등등  
 *            
 *            - 별찍기...  
 * 
 */
public class Ex01 {

   public static void main(String[] args) {
      
      int[] m = { 3, 5, 2, 4, 1 };
      
      // Ctrl+Shift+O
      System.out.println(Arrays.toString(m));
      
      bubbleSort(m);
      // Arrays.sort(m);    
      
      System.out.println(Arrays.toString(m));

   } // main

   private static void bubbleSort(int[] m) {
      /*
       *    0   1  2  3
       *  0   1  2
       *  0   1
       *  0
       *  
       *  i=0  j=3
       *  i=1  j=2
       *  i=2  j=1
       *  i=3  j=0
       *  j=3-i
       * */
      for (int i = 0; i < 4; i++) {      // 행
         for (int j = 0; j <= 3-i; j++) {  // 열(별)
            System.out.printf("%d-%d ", j, j+1);
            if (m[j] < m[j+1]) {
               System.out.print(" *** ");
               int temp = m[j];
               m[j] = m[j+1];
               m[j+1] = temp;               
            }
            System.out.println(Arrays.toString(m));
         }
         System.out.println();
      } 
      
      
      /*
       * [오름차순 정렬]
       *  m[0] m[1] m[2] m[3] m[4]
       *    3    5    2    4    1
       *  x x+1 
       *  0-1   1-2  2-3  3-4
       *  0-1   1-2  2-3
       *  0-1   1-2
       *  0-1
       * 
       * 1회전
       * 3    5    2    4    1
       * 3    2    5    4    1
       * 3    2    4    5    1
       * 3    2    4    1   [5]
       * 
       * 2회전
       * 2    3    4    1   [5]
       * 2    3    4    1   [5]
       * 2    3    1  [4]   [5]
       * 
       * 3회전
       * 2    3    1  [4]   [5]
       * 2    1  [3]  [4]   [5]
       * 
       * 4회전
       * 1    2  [3]  [4]   [5]
       * */
      
   }

} // class


/*
      //      행    열
      // **** i=1 j=1234
      // ***  i=2 j=123
      // **   i=3 j=12
      // *    i=4 j=1
      
      //      j = 5-i
      
      for (int i = 1; i <= 4; i++) {      // 행
         for (int j = 1; j <= 5-i; j++) {  // 열(별)
            System.out.print("*");
         }
         System.out.println();
      } 
 * */














