package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex04_04 {

	public static void main(String[] args) {
		LocalDate[] ldArr = {
				LocalDate.of(2000, 12, 13),
				LocalDate.of(2003, 5, 13),
				LocalDate.of(1998, 6, 2)
		};
		
		LocalDate today = LocalDate.now();
//		today.isAfter(today);
//		today.isBefore(today);
//		today.isEqual(today);

		for(int i=0;i<ldArr.length;i++) {
			LocalDate birth = ldArr[i]; // 2026

			// 년도를 오늘날짜의 년도로 변경
			// ld.withYear(today.getYear());
			birth = birth.with(ChronoField.YEAR, today.getYear());
			System.out.println(birth);
			System.out.println( today.isAfter(birth));
			System.out.println( today.isBefore(birth));
			System.out.println( today.isEqual(birth));
			System.out.println("-".repeat(50));

//			today.getMonthValue() > birth.getMonthValue()
//            || (today.getMonthValue() == birth.getMonthValue()
//                && today.getDayOfMonth() > birth.getDayOfMonth()
		}
		
	}

}
