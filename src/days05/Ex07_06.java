package days05;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 15. 오후 3:46:12
 * @subject 
 * @content 
 * 
 */
public class Ex07_06 {

	public static void main(String[] args) {
		// 1. 로또 배열 선언
		int [] lottoNumbers = new int[6]; 
		int lottoNumber;

		// 3. 로또 번호 6개를 발생시켜 각 0,1,2,3,4,5 요소에 저장
		int index = 0;
		boolean isDuplicated; // isFlag 변수는 너무 애매모호함. 무슨역할을 하는지 알수없음.
		while (index < lottoNumbers.length ) {
			isDuplicated = false;
			lottoNumber = (int)(Math.random() * 45) + 1;
			System.out.println("> 중복체크 전 로또번호: " + lottoNumber);
			// 4. 중복 체크해서 중복이 되면 isDuplicated= true, 중복이 되지 않으면 isDuplicated = false
			//   반복문 for문
			for (int i = 0; i < index; i++) {
				if( lottoNumbers[i] == lottoNumber ) {
					isDuplicated = true;
					break;
				}
			}

			if( !isDuplicated )   lottoNumbers[index++] = lottoNumber;
			// index++;
		} // while

		// 정렬수행 (로또번호가 순서대로 나와야함) 
		Arrays.sort(lottoNumbers);
		
		// 2. 로또 배열 출력
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]", lottoNumbers[i]);
		}
		System.out.println(); // 개행
	} // main

} // class










