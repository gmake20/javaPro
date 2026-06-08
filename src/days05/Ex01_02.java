package days05;

import java.util.Iterator;

public class Ex01_02 {

	public static void main(String[] args) {
		/*
		 * 2. 1+2+3+...+9+10=55
		 * 1에서 10까지의 합을 출력하는 코딩.
		 * 1) for문 사용해서 풀기
		 * 2) while문 사용해서 풀기
		 */

		int sum = 0;
		int start = 1, end = 10;
		for (int i = start; i <= end; i++) {
			if (i != end)
				System.out.printf("%d+", i);
			else
				System.out.printf("%d=", i);
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		int i = start;
		while (i <= end) {
			if (i != end)
				System.out.printf("%d+", i);
			else
				System.out.printf("%d=", i);
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
