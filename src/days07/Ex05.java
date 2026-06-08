package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오후 2:28:20
 * @subject 메서드 + 제어문 + 배열  
 * @content 로또번호 발생시키는 코딩.  days05.Ex07_06.java
 *            1) 로또번호 발생시키는 함수  : createLottoNumbers()
 *            2) 중복 체크하는 함수       : 중복이되면 true, 중복이되지않으면 false 반환하는 메서드 
 *               boolean isDuplicateLottoNumber()
 *            3) 로또번호 6개 -> 출력 함수: displayLottoNumbers(lottoNumbers)
 */
public class Ex05 {

	public static void main(String[] args) {

		int [] lottoNumbers = new int[6]; 

		// 로또번호 생성 메소드 호출 부분
		createLottoNumbers(lottoNumbers);

		// 호출 부분 
		displayLottoNumbers(lottoNumbers);
	} // main

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

	public static boolean isDuplicateLottoNumber(int[] lottoNumbers, int lottoNumber, int index) {
		boolean isFlag = false;
		for (int i = 0; i < index; i++) {
			if( lottoNumbers[i] == lottoNumber ) {
				isFlag = true;
				break;
			}
		}
		return isFlag;
	}

	public static void displayLottoNumbers(int[] lottoNumbers) {
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("[%d]", lottoNumbers[i]);
		}
		System.out.println(); // 개행      
	}

} // class
