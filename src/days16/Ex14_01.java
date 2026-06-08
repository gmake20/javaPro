package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex14_01 {

	public static void main(String[] args) {
		// 1. 날짜 . now(), of() 객체 생성
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 년
		System.out.println(d.get(ChronoField.YEAR));
		System.out.println(d.getYear());
		// 월
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(d.getMonthValue());
		// 일
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		System.out.println(d.getDayOfMonth());
		
		// 요일: 월(1), 화(2) ... 일(7)
		System.out.println(d.get(ChronoField.DAY_OF_WEEK));
		System.out.println(d.getDayOfWeek());
		
		// 윤년체크메소드 (true:윤년)
		System.out.println(d.isLeapYear()); 
	}

}
