package days16;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04_03 {

	public static void main(String[] args) {
		// 시간정보를 출력
		//LocalTime t = LocalTime.of(h, m,s)
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		// 시간
		System.out.println(t.get(ChronoField.HOUR_OF_AMPM));
		System.out.println(t.get(ChronoField.HOUR_OF_DAY));
		System.out.println(t.getHour());

		// 분
		System.out.println(t.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println(t.getMinute());

		// 초
		System.out.println(t.get(ChronoField.SECOND_OF_MINUTE));
		System.out.println(t.getSecond());
		
		System.out.println("=".repeat(50));
		// 밀리초
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		System.out.println(t.getNano()/1000000);
		// 나노초
		System.out.println(t.get(ChronoField.NANO_OF_SECOND));
		System.out.println(t.getNano());
		
	}

}
