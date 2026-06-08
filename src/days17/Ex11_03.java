package days17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 6. 4. 오후 4:16:40
 * @subject days10.Ex03.java
 * @content 게임횟수를 입력받아서 
 *             로또번호를 발생시켜서 출력하는 예제 
 * 
 */
public class Ex11_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int LOTTO_PRICE = 1000; // 로또 1게임 1000 
		int gameCount; // 게임횟수

		System.out.print("> 게임 횟수 입력: "); 
		gameCount = scanner.nextInt();

		ArrayList lottoList = new ArrayList();

		createLottoNumbers(lottoList, gameCount);

		displayLottoNumbers(lottoList);

	} // main

	private static void displayLottoNumbers(ArrayList lottoList) {
		Iterator ir = lottoList.iterator();
		while (ir.hasNext()) {
			ArrayList list = (ArrayList) ir.next();
			System.out.println( list );    
		}
	}

	private static void createLottoNumbers(ArrayList lottoList, int gameCount) {
		for (int i = 1; i <= gameCount; i++) {
			lottoList.add(createLottoNumbers());
		} // for

	}

	// Ex11_02.java 복사
	// HashSet  로또를 채우는 함수, 로또 번호 한 게임 발생..
	public static ArrayList createLottoNumbers( ) {
		HashSet lottoSet = new HashSet(6);
		int lottoNumber; 
		while ( lottoSet.size() < 6 ) { 
			lottoNumber = (int)(Math.random() * 45) + 1;
			//            System.out.println( lottoNumber );
			lottoSet.add(lottoNumber);
		} // while
		ArrayList list = new ArrayList(lottoSet);
		list.sort(null);
		return list;
	}

} // class
