package days17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author scm
 * @date 2026. 6. 4. 오전 9:09:43
 * @subject [Temporal + Adjusters class] 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2026-06-04
		
		
		// [1] 이번달의 첫번째 월요일? => 2026-06-01
		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(d);
		
		{
			LocalDate now = LocalDate.now();
			now.withDayOfMonth(1).plusMonths(1).minusDays(1);
			System.out.println(now.getDayOfMonth()); // 이번달의 마지막 날짜. // 30	
		}
		
		{
//			LocalDate now = LocalDate.now();
//			// 이번달 마지막 날짜가 몇일까지 있는가?
//			System.out.println(now); // 2026-06-02
//			now = now.withDayOfMonth(1); // 그달의 1일로 설정.
//			System.out.println(now); // 2026-06-01
//			now = now.plusMonths(1); // 다음달로 1달 증가.
//			System.out.println(now); // 2026-07-01
//			now = now.minusDays(1); // 하루를 뺀다.
//			System.out.println(now); // 2026-06-30
//			System.out.println(now.getDayOfMonth()); // 이번달의 마지막 날짜. // 30			
		}

	}

}
