package days17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author scm
 * @date 2026. 6. 4. 오전 9:20:56
 * @subject 날짜-날짜 간걱 : Period class
 * @content 시간-시간 간격 : Duration class
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate od = LocalDate.of(2026, 5, 11);
		LocalDate td = LocalDate.now();
		//System.out.println(od);
		//System.out.println(td);
		
		//                       od <=      < td
		Period p = Period.between(od, td);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.get(ChronoUnit.DAYS));
		
		
	}

}
