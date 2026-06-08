package days03;

import java.awt.desktop.PrintFilesEvent;
import java.util.Calendar;


public class Ex01_02 {

	public static void main(String[] args) {
		String name="이창익";
		short tot = 253;
		double avg = 84.3333333333333;

		System.out.printf("%s_%s_%s\n", name,name,name);
		System.out.printf("%1$s_%1$s_%1$s\n", name);
		
		System.out.println("-".repeat(50));
		System.out.printf("총점: [%10d]\n", tot);
		System.out.printf("총점: [%-10d]\n", tot);
		
		System.out.println("-".repeat(50));
		System.out.printf("평균: [%f]\n", avg);
		System.out.printf("평균: [%10.1f]\n", avg);
		System.out.printf("평균: [%-10.1f]\n", avg);

		System.out.println("-".repeat(50));
		System.out.printf("평균: [%10.1f]\n", avg);
		System.out.printf("평균: [%10.2f]\n", avg);
		System.out.printf("평균: [%10.3f]\n", avg);
		System.out.printf("평균: [%10.4f]\n", avg);
		
		System.out.println("-".repeat(50));
		int no = 10;
		System.out.printf("방번호: [%d]\n",no);							// 10진수
		System.out.printf("방번호: [%o]\n",no);							// 8진수
		System.out.printf("방번호: [%x]\n",no);							// 16진수
		System.out.printf("방번호: [%X]\n",no);							// 16진수
		System.out.printf("방번호: [%s]\n",Integer.toBinaryString(no));	// 2진수 

		System.out.println("-".repeat(50));
		int n = -123;
		System.out.printf("n=%(d\n",n);
		int n2 = 123456789;
		System.out.printf("n=%,d\n",n2);
		
		
		System.out.println("-".repeat(50));
		// %[argument_index$][flags][width][.precision]conversion
		Calendar c = Calendar.getInstance();;
		String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);	// %1$ => 첫번째 인자를 의미한다.
		System.out.println(s);
	}

}
