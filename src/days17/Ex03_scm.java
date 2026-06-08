package days17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex03_scm {
	public static void main(String[] args) {
		ArrayList lottoList = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		int gameCount; // 게임횟수

		System.out.print("> 게임 횟수 입력: "); 
		gameCount = scanner.nextInt();

		// 로또번호 생성 메소드 호출 부분
		createLottoNumbers(lottoList,gameCount);

		// 호출 부분 
		displayLottoNumbers(lottoList);

	} // main

	private static void displayLottoNumbers(ArrayList lottoList) {       
		for (int i = 0; i < lottoList.size(); i++) {
			displayLottoNumbers((HashSet)lottoList.get(i));
		}
	}

	private static void createLottoNumbers(ArrayList lottoList,int gameCount) {
		for (int i = 0; i < gameCount; i++) {
			lottoList.add(createLottoNumbers());
		}
	}

	// 로또 번호 한 게임 발생..
	public static HashSet createLottoNumbers() {
		HashSet lottoSet = new HashSet(6);
		int lottoNumber;
		while (lottoSet.size() < 6 ) {
			lottoNumber = (int)(Math.random() * 45) + 1;
			lottoSet.add(lottoNumber);
		} // while
		return lottoSet;
	}

	// 한 게임 출력하는 메소드
	public static void displayLottoNumbers(HashSet lottoSet) {
		System.out.println(lottoSet);
	}
}
