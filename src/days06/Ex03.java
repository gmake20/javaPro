package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오전 11:39:00
 * @subject  https://programmers.co.kr/
 * @content 
 * 3
   2
   1
   Let's go!
 */
public class Ex03 {

	public static void main(String[] args) {
		/* [1]
		String message = "Let's go!";
		System.out.println("3\n2\n1");
		System.out.println(message);
		*/

		// Ctrl  + Shift + O
		/* [2]
		Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2)%360;
        
        System.out.println( sum_angle );
        // System.out.println(sum_angle % 360);        
        */
		
		// [3]
		// 48+59		2자리 이상의 정수 number
		// 107
		// 123456        number
		// 12 + 34 + 56 
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // 4859
        int answer = 0;
        
        //for(int i=0; number > 0 ; i++){
        while(number > 0 ) {
            answer += number % 100; //  2자리 정수 answer
            number /= 100;
        }

        System.out.println(answer); 
		
		/* 이해
		int number = 123456;
		System.out.println( number % 100 );
		System.out.println( number = number / 100 );
		
		System.out.println( number % 100 );
		System.out.println( number = number / 100 );
		*/
	}

}
