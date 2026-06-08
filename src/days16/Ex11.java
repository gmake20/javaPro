package days16;

import java.util.Calendar;
import java.util.Date;


public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar -> Date 
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		// 2. Date -> Calendar
		c.setTime(d);
	}

}
