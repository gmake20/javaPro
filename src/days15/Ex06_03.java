package days15;

import java.util.Arrays;
import java.util.Random;

/**
 * @author scm
 * @date 2026. 6. 1. 오후 12:15:33
 * @subject 
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;
		int [] m = new int[5];

		for (int i = 0; i < 10 ; i++) {
			try {
				n = rnd.nextInt(5);  
				result = number / n ;
				m[i] = result;
				System.out.println(result );
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("> 배열m이 다 채워짐.");
				m = Arrays.copyOf(m, m.length+5);
			} catch (ArithmeticException e) {
				// Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
				i--;
			} catch (Exception e) {
				//System.out.println(e.toString());
				//System.out.println("0으로 나누면 안됩니다.");
			} finally {
				// 이부분은 반드시 호출.
				// System.out.println("finally");
			}



		} // for
		System.out.println(Arrays.toString(m));
	}

}
