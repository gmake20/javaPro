package days05;

import java.util.stream.IntStream;

public class Ex02 {

	public static void main(String[] args) {
		// 람다(Lambda)와 스트림(Stream)
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		
		
		/*
		int sum = 0;
		for (int i = 10; i >= 1;  i--) {
			System.out.printf("%d%s", i, i != 1 ? "+" : "=");
			sum += i;
		}
		System.out.println(sum);
		
		int i=10;
		sum = 0;
		while(i>=1) {
			System.out.printf("%d%s", i, i != 1 ? "+" : "=");
			sum += i;
			i--;
		}
		System.out.println(sum);		
		*/
	}

}
