package days12;

import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);

		Point p3 = p1.plusPoint(p2);
		p3.dispPoint();

		p2.plusPoint(p1).dispPoint();
		
//		int [] m = { 1,2,3,4,5 };
//
//		int[] n = doubleM(m);
//		System.out.println(Arrays.toString(n));
//		
//		System.out.println(Arrays.toString(evenM(m)));
	}




	// [기본형 리턴 자료형].
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// [1][참조형 리턴 자료형].
//	private static int[] doubleM(int[] m) {
//		int [] result = new int[m.length];
//		for(int i=0;i<m.length;i++) {
//			result[i] = m[i] * 2;
//		}
//		return result;
//	}

	// [2] Lambda Stream
	private static int[] doubleM(int[] m) {
		return Arrays.stream(m).map(v -> v * 2).toArray();
	}	

	// [2] Lambda Stream 짝수 배열 만들기
	private static int[] evenM(int[] m) {
		return Arrays.stream(m).filter(v -> v % 2 == 0).toArray();
	}		
}
