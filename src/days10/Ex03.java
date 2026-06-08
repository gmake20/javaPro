package days10;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 22. 오전 10:22:07
 * @subject  days07.Ex05.java
 * @content  days06.Ex01_02.java
 *   다차원 배열은 배열의 배열이다. 
 */
public class Ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int LOTTO_PRICE = 1000; // 로또 1게임 1000 
		int gameCount; // 게임횟수

		System.out.print("> 게임 횟수 입력: "); 
		gameCount = scanner.nextInt();

		int[][] lottoNumbers = new int[gameCount][6];

		// 로또번호 생성 메소드 호출 부분
		createLottoNumbers(lottoNumbers);

		// 호출 부분 
		displayLottoNumbers(lottoNumbers);

	} // main

	private static void displayLottoNumbers(int[][] lottoNumbers) {       
		for (int i = 0; i < lottoNumbers.length; i++) {
			displayLottoNumbers(lottoNumbers[i]);
		}
	}

	private static void createLottoNumbers(int[][] lottoNumbers) {
		for (int i = 0; i < lottoNumbers.length; i++) {
			createLottoNumbers(lottoNumbers[i]);
		}
	}

	// 1차원배열 로또를 채우는 함수, 로또 번호 한 게임 발생..
	public static void createLottoNumbers(int[] lottoNumbers) {
		int lottoNumber;
		int index = 0;
		boolean isFlag = false;
		while (index < lottoNumbers.length ) {
			isFlag = false;
			lottoNumber = (int)(Math.random() * 45) + 1;
			if(  !isDuplicateLottoNumber(lottoNumbers, lottoNumber, index)  )   lottoNumbers[index++] = lottoNumber;         
		} // while
	}

	// 한 게임 로또 번호 중복체크
	private static boolean isDuplicateLottoNumber(int[] lottoNumbers, int lottoNumber, int index) {
		boolean isFlag = false;
		for (int i = 0; i < index; i++) {
			if( lottoNumbers[i] == lottoNumber ) {
				isFlag = true;
				break;
			}
		}
		return isFlag;
	}

	// 한 게임 출력하는 메소드
	public static void displayLottoNumbers(int[] lottoNumbers) {
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]", lottoNumbers[i]);
		}
		System.out.println(); // 개행      
	}

} // class






