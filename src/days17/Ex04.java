package days17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author scm
 * @date 2026. 6. 4. 오전 9:43:25
 * @subject  
 * @content j.t 형식화 class
 * 				ㄴ DateTimeFormatter 형식화 클래스
 */
public class Ex04 {

	public static void main(String[] args) {
		// [2] 시간정보X, 날짜정보O
		//  s -> LocalDate변환
		String s = "2025년 02월 17일 (월)";
		


		// ================ [A 풀이] ======================================
		// String의 substring()을 사용하여 년,월,일 분리
		{
			System.out.println("======== String의 substring()을 사용하여 년,월,일 분리 ===========");
			int year = Integer.parseInt( s.substring(0, 4) );
			int month = Integer.parseInt( s.substring(6, 8) );
			int date = Integer.parseInt( s.substring(10, 12) );
			LocalDate d = LocalDate.of(year, month, date);
			System.out.println(d);			
		}

		// ================ [B 풀이] ======================================
		{
			System.out.println("======== (\\d{4})년 (\\d{2)월 (\\d{2})일 ===========");
			String regex = "(\\d{4})년 (\\d{2})월 (\\d{2})일";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s);			
			if (m.find()) {
				int year = Integer.parseInt(m.group(1));
				int month = Integer.parseInt(m.group(2));
				int day = Integer.parseInt(m.group(3));

				LocalDate date = LocalDate.of(year, month, day);

				System.out.println(date);
			}			
		}

		// ================ [C 풀이] ======================================
		{
			System.out.println("======== (\\d{4})년\\s*(\\d{2})월\\s*(\\d{2}) ===========");
			Pattern p = Pattern.compile("(\\d{4})년\\s*(\\d{2})월\\s*(\\d{2})일");
			// (\\d{4}) : 숫자 4자리
			// s* : space 0개 이상
			Matcher m = p.matcher(s);

			if (m.find()) {
				int year = Integer.parseInt(m.group(1));
				int month = Integer.parseInt(m.group(2));
				int day = Integer.parseInt(m.group(3));

				LocalDate date = LocalDate.of(year, month, day);

				System.out.println(date);
			}		
		}

		// ================ [D 풀이] ======================================
//		String pattern = "yyyy년 MM월 dd일 (E)";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		LocalDate d = LocalDate.parse(s, dtf);
//		System.out.println(d);


		// [1] 		
		//		LocalDateTime dt = LocalDateTime.now();
		//		// 2026-06-04T10:04:12.668006800
		//		System.out.println(dt);
		//		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
		//		System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE));
		//		
		//		// 2025/03/04 화요일 15:16:45.123
		//		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
		//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		//		String str = dtf.format(dt);
		//		System.out.println(str);



		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String str = dtf.format(dt);
		System.out.println(str);

		
		
		
		
	}

}
