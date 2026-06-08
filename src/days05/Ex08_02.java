package days05;

import java.util.Scanner;

/**
 * @author scm
 * @date 2026. 5. 15. 오후 5:09:53
 * @subject 가위바위보 게임
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int com,user;
		char con = 'y';
		Scanner scanner = new Scanner(System.in);

		// 1000원 입력
		System.out.print("> coin을 투입하세요~(100원단위로입력하세요.)");
		int coin = scanner.nextInt();
		if(coin%100 > 0) coin -= (coin%100);
		System.out.printf("%d원이 투입되었습니다.%n",coin);

		do {
			com = (int)(Math.random()*3) + 1;
			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();
			System.out.printf("> com=%d, user=%d\n", com, user);

//			int fake = (int)(Math.random()*100) + 1; // 1~100
//			if(fake > 60) {
//				if(user == 1) com=2;
//				else if(user == 2) com=3;
//				else if(user == 3) com=1;
//			}
//
			
			switch (com - user) {
			case 0 ->  System.out.printf("무승부 남은코인 %d\n",coin);
			case -1,2 -> { coin+=100; System.out.printf("사용자 승리. 남은코인 %d\n", coin); }
			case 1,-2 -> { coin-=100; System.out.printf("컴퓨터 승리. 남은코인 %d\n", coin); } 
			}

			if(coin == 0) {
				System.out.println("잔액이 0원입니다. 종료합니다");
				break;
			}
			
			System.out.print("  게임 계속하겠습니까?>(y/n)");
			con = scanner.next().charAt(0);
			System.out.println(); // 개행
		} while ( con == 'y' || con == 'Y' );

		System.out.println("END");
	}
}