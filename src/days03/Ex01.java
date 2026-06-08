package days03;

import java.util.Random;


/**
 * @author scm
 * @date 2026. 5. 13. 오전 9:38:42
 * @subject Type형변환이 처리속도에 얼만큼 영향을 주는가? 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		System.out.println("java 3일차 수업");
		String name = "홍길동";
		byte kor=90,eng=87,mat=56;
		short total = (short)(kor+eng+mat);
		double avg = (double)total/3;
		System.out.printf("이름: \"%s\"\n",name);
		System.out.printf("국어: %d\n",kor);
		System.out.printf("영어: %d\n",eng);
		System.out.printf("수학: %d\n",mat);
		System.out.printf("총점: %d\n",total);
		System.out.printf("평균: %f\n",avg);
		
		
		double x1 = 0;
		long start = System.nanoTime();
		for(int i=0;i<10000000;i++) {
			kor = (byte)random.nextInt(100);
			eng = (byte)random.nextInt(100);
			mat = (byte)random.nextInt(100);
			total = (short)(kor+eng+mat);
			x1 += total;
		}
		long end = System.nanoTime();
		long elapsed = end - start;
		//System.out.println("걸린 시간(ns): " + elapsed);
		System.out.println("걸린 시간(ms): " + (elapsed / 1_000_000.0));
		
		double x2 = 0;
		start = System.nanoTime();
		int kor2=10,eng2=10,mat2=10;
		int total2 =  0;
		for(int i=0;i<10000000;i++) {
			kor2 = random.nextInt(100);
			eng2 = random.nextInt(100);
			mat2 = random.nextInt(100);
			total2 = kor2+eng2+mat2;
			x2 += total2;
		}
		
		end = System.nanoTime();
		elapsed = end - start;
		//System.out.println("걸린 시간(ns): " + elapsed);
		System.out.println("걸린 시간(ms): " + (elapsed / 1_000_000.0));
		
		System.out.println(x1 + ":" + x2);
		
		
	}

}

/*
 * [복습문제]
 * 1. 자바의 타입(Type,자료형) 정리
 * 	기본형
 * 		정수형
 * 			byte(1),char(2), short(2), int(4) , long(8)
 * 		실수형
 * 			float(4) , double(8)
 * 		논리형
 * 			boolean(1)
 * 	참조형
 * 		배열, 클래스 , 인터페이스
 * 2. 이름, 국,영,수, 총점, 평균
 *    1) 각각의 변수 선언
 *    2) 초기값 설정
 *    3) 출력형식:
 *       이름: "홍길동"
 *       국어: 90
 *       영어: 87
 *       수학: 56
 *       총점: ???
 *       평균: ??.??
 * 
 * */
