package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오전 7:43:38
 * @subject 신창만
 * @content 자동
 *          고객 머니 : 10,000
 *          게임횟수  : 5          
 *          거스름돈: 5,000 + 로또번호 5
 */
public class Ex01_02 {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		// 상수: 로또 1게임 천원
		final int LOTTO_PRICE = 1000;
		// 고객 머니, 게임횟수
		int money, gameCount;

		System.out.print("> 게임 고객 머니, 게임 횟수 입력: ");
		money = scanner.nextInt();
		gameCount = scanner.nextInt();

		// 실제 고객머니에 맞는 게임 가능 횟수
		int possibleGames = money / LOTTO_PRICE;

		// 실제 로직 처리할 게임횟수
		int playCount = Math.min(gameCount, possibleGames);
		// 거스름돈 처리
		int usedMoney = playCount * LOTTO_PRICE;
		int change = money - usedMoney;

		// 실제 로또 게임횟수와 거스름돈 출력
		System.out.printf("> 고객 머니: %,d원\n", money);
		System.out.printf("> 게임횟수: %d게임\n", playCount);
		System.out.printf("> 거스름돈 : %,d원\n", change);

		// 로또 번호를 게임횟수만큼 반복 처리.
		for (int j = 1; j <= playCount; j++) {
			// [복습문제]	  로또 번호 발생 -> 출력.
			int[] lottoNumbers = new int[6];
			// 0: 아랫첨자값  LowerBound
			// 5: 윗첨자값   UpperBound    lottoNumbers.length - 1
			int lottoNumber;
			boolean isFlag = false;
			int index = 0;
			// 1. 로또번호 발생시켜서 배열에 채우기
			lottoNumber = (int)(Math.random()*45)+1;
			lottoNumbers[index++] = lottoNumber;
			// 1-2. 로또번호 발생+ 중복체크 + 배열 채우기        
			while ( index <= 5 ) {
				isFlag = false;
				lottoNumber = (int)(Math.random()*45)+1;
				// 1-3. 배열 로또번호들과 lottoNumber 중보체크
				for (int i = 0; i < index; i++) {
					if (lottoNumbers[i] == lottoNumber) {
						isFlag = true;
						break;
					} // if
				} // for

				if( !isFlag   ) {
					lottoNumbers[index++] = lottoNumber;
				}
			} // while

			// 2. 로또 배열 출력
			System.out.printf("%d 로또번호: ", j);
			for (int i = 0; i <= lottoNumbers.length -1; i++) {
				//System.out.printf("lottoNumbers[%d]=%d\n", i, lottoNumbers[i]);
				System.out.printf("[%02d]",   lottoNumbers[i]);
			}
			System.out.println(); // 개행
		} // for


	} // main

} // class













/*
 * [복습문제1]
 * 1. 두 정수(n,m)의 홀수의 합
 *   (조건: while 문 사용하기 )
 * 2. 세 정수(x,y,z)를 입력받아서 가장 큰 값, 가장 작은 값 구해서 출력  
 * 3. 20개 정수 중에 가장 큰 값, 작은 값 
 *   (배열 사용)
 * 4. 국어 점수를 입력받아서 수,우,미,양,가 출력
 *   1) if문 사용
 *   2) switch문 사용  
 * 5. 로또 번호 발생~  
 * */





