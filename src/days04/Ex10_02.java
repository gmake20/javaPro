package days04;

/**
 * @author kenik
 * @date 2026. 5. 14. 오후 4:31:00
 * @subject 1+2+3+4+5+6+7+8+9+10=55
 * @content 1~10까지의 합구해서 출력...(for문)
 * 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			System.out.printf("%d+", i);
			sum += i;  // sum = sum + i;
		} // for
		System.out.printf("=%d\n", sum);
		
		
//		int n = 0;
		//      i
//		n = n + 1; // 1
//		n = n + 2; // 3
//		n = n + 3; // 6
//		n = n + 4; // 10
//		n = n + 5; // 15
//		
//		n = n + 9; // 45
//		n = n + 10; // 55
	} // main

} // class





