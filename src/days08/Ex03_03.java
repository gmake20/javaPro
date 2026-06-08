package days08;

public class Ex03_03 {

	public static void main(String[] args) {
		/*
		 *  [문제] 거듭제곱 == 멱
		 *  2^3 = 2*2*2 = 8
		 *  2 : 밑수
		 *  3 : 지수
		 */
		System.out.println(power(2,3));
		System.out.println(recursivePower(2,3));

	}

	public static int recursivePower(int base, int exponent) {
		if(exponent == 0 || exponent == 1) return base;
		return base * recursivePower(base,exponent-1);
	}

	public static int power(int base, int exponent) {
		int sum = 1;
		for(int i=0;i<exponent;i++) 
			sum *= base;
		return sum;
	}

}
