package days12;

import java.util.ArrayList;

/**
 * @author scm
 * @date 2026. 5. 27. 오후 2:25:25
 * @subject 1. 기본형 매개변수
 * 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
	      // 1. 기본형 매개변수와 참조형 매개변수
	      //   ㄴ 기본형 매개변수 설명
	      //     ㄴ 메소드 추가: x,y 좌표값을 매개변수 만큼 이동시키는 메소드
	      //                            int value
	      //   ㄴ 참조형 매개변수
	      //     ㄴ 메소드 추가:  p1, p2 두 좌표값을 합하는 메소드

	      Point p1 = new Point(5, 10);
//	      p1.dispPoint() ;
//	      p1.offsetPoint(50);
	      p1.dispPoint() ;
	      
	      Point p2 = new Point(2, 3);
	      p2.dispPoint() ;

	      
	      // 객체명.필드
	      // 객체명.메소드();
//	      p1.plusPoint(p1, p2);
	      p1.plusPoint(p2);
	      p1.dispPoint(); // > x=7, y=13
	      
	      
	      p2.plusPoint(p1, p2);
	      p2.dispPoint(); // > x=9, y=16
	   } // main

}
