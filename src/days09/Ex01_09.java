package days09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 21. 오전 8:54:20
 * @subject 양인석(고용센터)
 * @content 
 * 
 */
public class Ex01_09 {

   public static void main(String[] args) {
      // [복습문제]
      // 1. 30 전체 학생수를 저장할 상수 STUDENT_COUNT 선언
      final int STUDENT_COUNT = 30;
      // 2. 30명 학생들의 이름을 저장할 names 배열 선언
      String [] names = new String[STUDENT_COUNT];
      // 3. 30명 학생들의 총점,평균,등수을 저장할 tots,avgs,ranks 배열 선언
      int [] tots = new int[STUDENT_COUNT];
      double [] avgs = new double[STUDENT_COUNT];
      int [] ranks = new int[STUDENT_COUNT];
      // 4. 각 배열에 입력값을 채울 용도 + 입력받은 학생수 : index
      int index = 0; 
      
      // 6. 반복적으로  이름, 총점(0~300) 입력받아서  평균 계산 : inputStudentInfo
      index = inputStudentInfo(names, tots, avgs );
      // 7. 등수 처리 : processStudentRank
      // 8. 모든 학생들 출력. : printStudentInfo
      printStudentInfo(names, tots, avgs, ranks, index); 

   } // main

   private static void printStudentInfo(String[] names, int[] tots, double[] avgs, int[] ranks, int index) {
      System.out.printf("\n 입력받은 학생수: %d명\n", index);
      for (int i = 0; i < index; i++) {
         System.out.printf(
               "> %d번 이름: %s, 총점:%d, 평균:%.2f, 등수:%d\n"
               , i+1, names[i], tots[i], avgs[i], ranks[i]);
      }
   }

   private static int inputStudentInfo(String[] names, int[] tots, double[] avgs) {
      // 5. 계속 여부 저장할 con 문자 변수 선언
      char con = 'y';
      int index = 0;
      Scanner scanner = new Scanner(System.in);
      
      String name;
      int tot;
      double  avg;
      
      do {
         System.out.printf("> [%d]번 학생 이름, 총점 입력: ", index + 1);
         name = scanner.next();
         tot = getRandomTot();
         avg = (double)tot/3;
         
         names[index] = name;
         tots[index] = tot;
         avgs[index] = avg;
         
         index++;   
         
         System.out.print("\t 입력 계속? ");
         con = scanner.next().charAt(0);
      } while ( Character.toUpperCase(con) == 'Y' );
      
      return index;
   }

   private static int getRandomTot() {
      Random rnd = new Random();
      int tot = rnd.nextInt(0, 301);
      return tot;
   }

} // class









