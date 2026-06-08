package days16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author scm
 * @date 2026. 6. 2. 오후 5:19:03
 * @subject now(), of()
 * @content plus(), plusXXX(), minus(), minusXXX()
 */
public class Ex04_05 {

	public static void main(String[] args) {
		// [2] 
		LocalTime t = LocalTime.now();
		System.out.println(t); // 17:25:59.757379200
		// 초단위 밑으로 절삭...
		t = t.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(t); // 17:25:59
		// 분단위 밑으로 절삭...
		t = t.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(t); // 17:25
		
		
		/* [1]
		LocalDate now = LocalDate.now();
		// 이번달 마지막 날짜가 몇일까지 있는가?
		System.out.println(now); // 2026-06-02
		now = now.withDayOfMonth(1); // 그달의 1일로 설정.
		System.out.println(now); // 2026-06-01
		now = now.plusMonths(1); // 다음달로 1달 증가.
		System.out.println(now); // 2026-07-01
		now = now.minusDays(1); // 하루를 뺀다.
		System.out.println(now); // 2026-06-30
		System.out.println(now.getDayOfMonth()); // 이번달의 마지막 날짜. // 30
		*/
	}

}
