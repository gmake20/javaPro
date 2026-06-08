package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 15. 오전 11:50:37
 * @subject 
 * @content 
 * 
 */
public class Ex06_02 {
   
   public static void main(String[] args) {
      int no = 1, maxCount = 3;
      char con = 'y';
      String name;      
      Scanner scanner = new Scanner(System.in);
      
      do {
         System.out.printf("> [%d] 이름 입력: ", no);
         name = scanner.next();
         System.out.printf("이름: %s\n", name);      
         
         // 세번 이름 입력했는 지 확인 후에 반복 중단..코딩.
         if ( no == maxCount ) {
            System.out.println("🤩 최대 세번만 입력 가능합니다.");
            break;
         } // if
         
         System.out.print("  이름 입력 계속할래❓ ");
         con = scanner.next().charAt(0);
         System.out.println(); // 개행
         no++;
      } while ( con == 'y' || con == 'Y' );
      
      System.out.println(" END "); 

   } // main
   
} // class
