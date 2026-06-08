package days17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author scm
 * @date 2026. 6. 4. 오전 9:01:15
 * @subject 날짜 + 시간
 * @content Date, Calendar + 형식화 클래스
			j.t핵심클래스
			LocalDate
			LocalTime
			LocalDateTime 클래스
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		// 2026-06-04T09:05:35.001999700
		System.out.println(dt);
		
		// dt 시간정보를 절삭. Days까지 절삭되어 Day이후의 시,분,초가 제거됨
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		// 2026-06-04T00:00
		System.out.println(dt);
		
		LocalDate d = dt.toLocalDate();
		// 2026-06-04
		System.out.println(d);
		
		LocalTime t = dt.toLocalTime();
		// 09:06:07.726870800
		System.out.println(t);
	}

}
