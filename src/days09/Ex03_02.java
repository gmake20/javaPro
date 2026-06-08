package days09;

import java.util.Date;

/**
 * @author scm
 * @date 2026. 5. 21. 오전 11:36:25
 * @subject 
 * @content 한국(세는)나이, 만나이
 *            24.12.31   25.1.1  25.12.31 26.1.1 26.12.31
 *               1          2       2       3         3  년도만 체크
 *               현재년도 - 태어난년도 + 1
 *               0          0       1       1         2
 *               현재년도 - 태어난년도 + (1.1 <= 12.31 ? -1:0) 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		String rrn = "250521-4700001";
		int age = getCountingAge(rrn); //한국 나이
		System.out.println(age);
		age = getAmericanAge(rrn); // 만나이
		System.out.println(age);
	}

	private static int getAmericanAge(String rrn) {
		int americanAge = getCountingAge(rrn)-1;
		
		Date d = new Date();
		int cMonth = d.getMonth() + 1;
		int cDay = d.getDate();

		int bMonth = Integer.parseInt(rrn.substring(2,4));
		int bDay = Integer.parseInt(rrn.substring(4,6));
		
		if(cMonth*100+cDay >= bMonth*100+bDay) {
			System.out.println("me ok");
		}
		if(cMonth < bMonth || cMonth == bMonth && cDay < bDay) {
			americanAge--;
			System.out.println("teacher ok");
		}
		
		return americanAge;
	}


	private static int getCountingAge(String rrn) {
		Date d = new Date();
		int currentYear = d.getYear() + 1900;

		String birthday = Ex03.getBirthday(rrn);
		int birthYear = Integer.parseInt(birthday.substring(0,4));
		return currentYear - birthYear + 1;
	}


}
