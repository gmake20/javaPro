package days06;

/**
 * @author kenik
 * @date 2026. 5. 18. 오후 4:52:46
 * @subject 구구단 출력. ( 가로 출력 )
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {	
		/*
		 * dan=2   2<=9 
		 * i=1,2..9 [10]   10<=9
		 * dan=3   1<=9 
		 * i=1,2..9 [10]   10<=9
		 * 
		 * [ 2]단
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * :
		 * 2 * 9 = 18
		 * */
		for (int dan = 2; dan <= 9; dan++) {			
			// System.out.printf("[ %d]단\n", dan); // 2~9 
			for (int i = 1; i <= 9 ; i++) {
				System.out.printf("%d*%d=%02d ", dan, i, dan * i);
			}
			System.out.println(); // 
		}
		

	} // main

} // class





