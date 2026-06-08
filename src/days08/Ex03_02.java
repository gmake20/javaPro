package days08;

public class Ex03_02 {

	public static void main(String[] args) {
		// [1] 1~n의 합
		System.out.println(sum(10));
		System.out.println(recursiveSum(10));
		
		// [2] 팩토리얼 메서드 
		// 5! = 5*4*3*2*1
		// 0! == 1
		System.out.println(factorial(5));
		System.out.println(recursiveFactorial(1));
		
	}

	public static int recursiveFactorial(int n) {
		if(n == 1 || n == 0) return 1;
		return n * recursiveFactorial(n-1);
	}

	public static int factorial(int n) {
		int result = 1;
		for(int i=n;i>=1;i--)
			result *= i;
		return result;
	}

	public static int sum(int n) {
		int result = 0;
		for(int i=1;i<=n;i++) {
			result += i;
		}
		return result;
	}

	// 재귀함수
	public static int recursiveSum(int n) {
		if(n == 1) return 1;
		return n + recursiveSum(n-1);
	}	
	
}
