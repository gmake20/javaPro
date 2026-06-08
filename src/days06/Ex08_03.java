package days06;

/**
 * @author kenik
 * @date 2026. 5. 18. 오후 4:52:46
 * @subject 구구단 출력. ( 세로 출력 )
 * @content 
 * 
 */
public class Ex08_03 {

	public static void main(String[] args) {	
		// i=1
		// dan = 2,3,4,5,6,7,8,9
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9 ; dan++) {
				System.out.printf("%d*%d=%02d ", dan, i, dan * i);
			}
			System.out.println(); // 
		}
		
		/*
		 * 2*1= 3*1=  ... 9*1=9
		 * */

	} // main

} // class





