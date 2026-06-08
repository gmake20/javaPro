package days16;

import java.util.*;

/**
 * @author scm
 * @date 2026. 6. 2. 오후 3:16:29
 * @subject Calendar class
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// Calendar c = new GregorianCalendar();

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		
		// 일(1) ~ 토(7)
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); 
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// c객체의 그 달의 마지막 날짜는 몇일?
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDate);
	}

}
