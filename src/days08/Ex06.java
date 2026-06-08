package days08;

import java.util.Arrays;

/**
 * @author scm
 * @date 2026. 5. 20. 오후 4:02:30
 * @subject 
 * @content
 */
public class Ex06 {
	/*
	 * int[] kors = new int[1000]; 배열선언
	 * kors는 변수, 지역변수, 참조변수, 배열명이다.
	 * 0~999 : 첨자값, 인덱스
	 * 0 : 아랫첨자값 lowerBound
	 * 999 : 윗첨자값 upperBound
	 * 배열명.length-1 == 윗첨자값 upperBound
	 */
	
	public static void main(String[] args) {
		int[] m = new int[3];
		System.out.println(Arrays.toString(m));
		boolean[] b = new boolean[3];
		System.out.println(Arrays.toString(b));
		double[] d = new double[3];
		System.out.println(Arrays.toString(d));
		String[] s = new String[3];
		System.out.println(Arrays.toString(s));

	}

}
