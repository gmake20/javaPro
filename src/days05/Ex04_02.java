package days05;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		int sum = 0;
		int m, n;

		Scanner sc = new Scanner(System.in);
		// sc.useDelimiter(null);
		System.out.print("> 정수(n) 정수(m) 입력: "); // 2 5
		n = sc.nextInt();
		m = sc.nextInt();

		// [3] 풀이
		/*
		int min = n > m ? m : n, max = n > m ? n : m;
		for (int i = min; i <= max; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d%n", sum);
		 */

		// [2] 풀이
		/*
		 * if(n > m) {
		 * int tmp = n;
		 * n = m;
		 * m = tmp;
		 * }
		 * 
		 * for (int i = n; i <= m; i++) {
		 * System.out.printf("%d+", i);
		 * sum += i;
		 * }
		 * System.out.printf("=%d%n", sum);
		 */

		long start,end,elapsed;

		
		start = System.nanoTime();
		int min = Math.min(m, n), max = Math.max(m, n); 
		for (int i = min; i <= max; i++) {
			//System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d%n", sum);
		end = System.nanoTime();
		elapsed = end - start;
		//System.out.println("걸린 시간(ns): " + elapsed);
		System.out.println("걸린 시간(ms): " + (elapsed / 1_000_000.0));

		start = System.nanoTime();
		for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
			//System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d%n", sum);
		end = System.nanoTime();
		elapsed = end - start;
		//System.out.println("걸린 시간(ns): " + elapsed);
		System.out.println("걸린 시간(ms): " + (elapsed / 1_000_000.0));		
		
	}

}
