package days16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author scm
 * @date 2026. 6. 2. 오후 4:05:15
 * @subject 날짜를 형식화 하는 클래스 : SimpleDateFormat
 * @content format()
			parse()
 */
public class Ex13 {

	public static void main(String[] args) {
		// [2]
		// 출력형식)  2025/02/28 04:48:00 금요일
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sdate = sdf.format(c.getTime());
		System.out.println(sdate);		
		
		/* [1]
		Date d = new Date();
		System.out.println(d.toLocaleString());
		// 2026. 6. 2. 오후 4:06:49
		System.out.println(d.toGMTString());
		// 2 Jun 2026 07:06:49 GMT
		
		// 출력형식)  2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sdate = sdf.format(d);
		System.out.println(sdate);
		*/
		
	}

}
