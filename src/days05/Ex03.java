package days05;

import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {
		int sum=0;
		
		// IntStream.rangeClosed(1, 10).filter(i->i%2==1).forEach(System.out::println);
		sum = IntStream.rangeClosed(1, 10).filter(i->i%2==1).sum();
		System.out.println(sum);
		
		/*
		sum = 0;
		for(int i=1;i<10;i+=2) {
			System.out.printf("%s%d",i==1?"":"+",i);
			sum += i;
		}
		System.out.printf("=%d\n",sum);

		sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2 == 1) {
				System.out.printf("%s%d",i==1?"":"+",i);
				sum += i;
			}
		}
		System.out.printf("=%d\n",sum);

		// continue문
		sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) continue;
			System.out.printf("%s%d",i==1?"":"+",i);
			sum += i;
		}
		System.out.printf("=%d\n",sum);
		*/
		
		sum=0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%s%d",i==1?"":"+",i);
			sum += i;
		}
		System.out.printf("=%d\n",sum);
		
	}

}
