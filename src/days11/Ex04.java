package days11;

import java.util.Arrays;

/**
 * @author scm
 * @date 2026. 5. 26. 오후 12:34:56
 * @subject 가변 인자(== 가변길이의 매개변수)
 * @content
 */
public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.sum(1, 2);
		System.out.println(result);
		
		result = calc.sum(1, 2, 3 );
		System.out.println(result);

		
		int[] m = {1,2,3,4,5,6,7,8,9,10};
		result = calc.sum(m);
		System.out.println(result);		

		result = calc.sum(new int[] {1,2,3,4,5});
		System.out.println(result);		
		
		result = calc.sum(1, 2, 3, 4 );
		System.out.println(result);		
		
		System.out.printf("\n");
		
	}
}


class Calculator{
//	int sum(int a, int b) {
//		return a+b;
//	}
//
//	// 오버로딩 
//	int sum(int a, int b, int c) {
//		return a+b+c;
//	}

//	int sum(int[] m) {
//		return Arrays.stream(m).sum();
//	}
//	
	// 가변매개변수
	int sum(int... m) {
		return Arrays.stream(m).sum();
		/*
		int sum = 0;
		for(int number : m) {
			sum += number;
		}
		return sum;
		*/
	}
	
	
	// + - * /
	int plus() {
		return 0;
	}
}