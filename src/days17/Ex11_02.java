package days17;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 3:43:32
 * @subject C -> L : ArrayList,Vector, LinkedList 
 * @content C-> S : HashSet컬렉션 클래스
 *    로또게임
 *    1) int [] lotto 로또 1게임
 *    2) int [][] lotts 로또 여러게임
 *    HashSet사용              
 */

public class Ex11_02 {


	public static void main(String[] args) {
		// 1. 로또 배열 선언
		HashSet lottoSet = new HashSet(6);
		createLottoNumbers(lottoSet);

		// 2. 로또 배열 출력
		displayLottoNumbers(lottoSet);
	} // main

	public static void createLottoNumbers(HashSet lottoSet) {
		int lottoNumber;
		while (lottoSet.size() < 6 ) {
			lottoNumber = (int)(Math.random() * 45) + 1;
//			System.out.println(lottoNumber);
			lottoSet.add(lottoNumber);
		} // while

		// sort
//		ArrayList lottoList = new ArrayList(lottoSet);
//		lottoList.sort(null);
//		System.out.println(lottoList);
		
		
		
	}


	// 한 게임 출력하는 메소드
	public static void displayLottoNumbers(HashSet lottoSet) {
		System.out.println(lottoSet);    
	}	   
}
