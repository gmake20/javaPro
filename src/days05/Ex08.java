package days05;

import java.util.Scanner;

/**
 * @author scm
 * @date 2026. 5. 15. 오후 5:09:53
 * @subject 1,2,3
 * @content 1<2 2<3 3<1 => 1,1,-2     -1,-1,2
 */
public class Ex08 {

	public static void main(String[] args) {
		int com,user;
		Scanner scanner = new Scanner(System.in);

		com = (int)(Math.random()*3) + 1;
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		user = scanner.nextInt();
		System.out.printf("> com=%d, user=%d\n", com, user);
		
		switch(com-user) {
		case 0:
			System.out.println("비김");
			break;
		case 1:
		case -2:
			System.out.println("컴퓨터");
			break;
		case -1:
		case 2:
			System.out.println("사용자");
		}
		
//		if(com == user) {
//			System.out.println("비김");
//		}
//		else if((com == 2 && user == 1) || (com == 3 && user == 2) ||(com == 1 && user == 3)) {
//			System.out.println("com 이김");
//		}
//		else {
//			System.out.println("유저 이김");
//		}
		
		switch (com - user) {
		case 0 ->  System.out.println("무승부");
		case -1,2 -> System.out.println("사용자 승리");
		case 1,-2 -> System.out.println("컴퓨터 승리");
		}
		
//		switch (com - user) {
//	      case 0:
//	         System.out.println("무승부");
//	         break;
//	      case -1:
//	         System.out.println("컴퓨터 승리");
//	         break;
//	      case 2:
//	         System.out.println("컴퓨터 승리");
//	         break;   
//	      case 1:
//	         System.out.println("사용자 승리");
//	         break;   
//	      case -2:
//	         System.out.println("사용자 승리");
//	         break;    
//	      }		
		
	}

}
