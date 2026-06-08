package days05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int sum=0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수(n) 입력: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.printf("%d%s", i, i != n ? "+" : "=");
			sum+=i;
		}
		System.out.printf("%d%n",sum);

	}

}
