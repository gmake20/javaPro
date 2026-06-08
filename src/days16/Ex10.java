package days16;

import java.util.Date;

/**
 * @author scm
 * @date 2026. 6. 2. 오후 2:44:47
 * @subject 
 * @content jdk1.0 : Date
 *          jdk1.1 : Calendar
 *          jdk1.8 : java.time package 안에 다양한 하위 package와 class추가
 */
public class Ex10 {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println( d.toLocaleString());
		System.out.println(d.getYear() + 1900);
		System.out.println(d.getMonth() + 1);
		
		System.out.println( d.getTime());
		System.out.println( "일월화수목금토".charAt( d.getDay() ));

		
		// 개강일로부터 오늘날짜까지 경과일 구하기
		// 26.5.11
		// 26.6.2
		Date start = new Date(2026-1900, 5-1, 11,9,0,0);
		Date end = new Date();
		long diff = end.getTime() - start.getTime();
		System.out.println(diff/(86400*1000) + "일이 지남");
		long diffDay = diff/(86400*1000);
		
		// [생각] startDate~today 요일 : 토,일
		// 휴일등록한 날짜배열
		int week = start.getDay();
		int freeDay = 0;
		for(int i=0,check=0;i<diffDay;i++) {
			check = (i+week) % 7;
			if(check == 0 || check == 6) freeDay++;
		}
		
		System.out.println("수업일:" + (diffDay-freeDay));
		
	}

}
