package days14;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 4:12:20
 * @subject [인터페이스 사용 장점]
 * @content  1. 개발 시간을 단축.
 *           2. 표준화 가능
 *           3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수 있다.
 *           4. 독립적인 프로그래밍이 가능.
 *          
 *           예) 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int [] lottoArr = new int[ILotto.LENGTH];
		
		//ILotto lottoGame = new 시연Lotto제품() ;
		ILotto lottoGame = new 수빈Lotto제품() ;
		
		lottoGame.fillLotto(lottoArr);
		lottoGame.dispLotto(lottoArr);
	
		System.out.println("END");
	} // main

} // class
