package days10;

import java.util.Date;
import java.util.Scanner;

import com.util.Graphic2D;

import days07.Ex06;
/**
 * @author scm
 * @date 2026. 5. 22. 오후 3:33:42
 * @subject 달력 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 년도 월 입력받기
		Scanner scanner = new Scanner(System.in);
		int year,month;

		System.out.println("> 년도, 월 입력: "); // 2000 5

		year = scanner.nextInt();
		month = scanner.nextInt(); // String regex = "^([1-9]|1[0-2])$"

		// 달력 출력하기 
		createCalendar(year,month);
		// createCalendar(2026,5);

	}

	// 2000년 2월
	// 2000년 3월
	private static void createCalendar(int year, int month) {
		// [1] 요일구하기
		int dayOfWeek = getDayOfWeek(year,month,1);
		// [2] 해당 월이 몇일까지인지.
		int lastDayOfMonth = getLastDayOfMonth(year,month);
		// [3] 달력 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
	      Graphic2D.drawLine(60, '-');
	    String week = "일월화수목금토";
		for(int i=0;i<week.length();i++) {
			System.out.printf("\t%s", week.charAt(i));
		}
		System.out.println();
		Graphic2D.drawLine(60, '-');
		// 1위치를 잡기위해 \t 해당 요일 
		for(int i=0;i<=dayOfWeek;i++)
			System.out.printf("\t");

		for(int i=1;i<=lastDayOfMonth;i++) {
			if((dayOfWeek+i-1) % 7 == 0) {
				System.out.printf("\n\t");
			}
			// before

			printDay(isToday(year,month,i)?"("+i+")":""+i, (dayOfWeek+i-1) % 7);
			// System.out.printf("%s\t", isToday(year,month,i)?"("+i+")":""+i);			
			
			// after
		}
		System.out.println();
		Graphic2D.drawLine(60, '-');
	}
//		 System.out.println("\u001B[31m빨간색 글자\u001B[0m");
//		 System.out.println("\u001B[34m파란색 글자\u001B[0m");



	private static boolean isToday(int year, int month, int day) {
		Date d = new Date(); 
		int currentYear = d.getYear() + 1900;
		int currentMonth = d.getMonth() + 1;
		int currentDay = d.getDate();
		if(year == currentYear && month == currentMonth && day == currentDay) {
			return true;
		}
		return false;
	}

	private static void printDay(String day, int week) {
		if(week == 0) {
			System.out.printf("\u001B[31m%s\u001B[0m ",day);
		}else if(week==6) {
			System.out.printf("\u001B[34m%s\u001B[0m ",day);
		}else {
			System.out.printf("%s",day);
		}
		System.out.printf("\t");
			
	}


	// [2] 풀이
	private static int getLastDayOfMonth(int year, int month) {
		int lastDayOfMonth = 0;
		Date d = new Date( year-1900, month-1, 1); // 2026.5.1
		// 1) 한달 더하기 2026.6.1
		d.setMonth( d.getMonth()+1 );
		//	      System.out.println( d.toLocaleString() );

		// 2) 하루를 빼기 2026.5.31
		d.setDate( d.getDate()-1 );
		//	      System.out.println( d.toLocaleString() );

		// 3) 날짜(일) 얻어오기            
		return lastDayOfMonth = d.getDate();
	}
	//
	//	private static int getLastDayOfMonth(int year, int month) {
	//		int lastDayOfMonth = switch(month) {
	//		case 1,3,5,7,8,10,12 -> 31;
	//		case 4,6,9,11 -> 30;
	//		default -> {
	//			boolean isLeapYear =
	//					(year % 4 == 0 && year % 100 != 0)
	//					|| (year % 400 == 0);
	//			// {}블럭안에 코딩을 한후 값을 반환할때
	//			yield isLeapYear ? 29 : 28;
	//		}
	//		};
	//
	//		// System.out.println("==>"+lastDayOfMonth);
	//		return lastDayOfMonth;
	//	}

	/**
	 * 요일구하기 (0:일요일, 1:월요일, ..., 6:토요일)
	 */
	public static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900,month-1,date);
		int dayOfWeek = d.getDay(); // 0~6
		// System.out.println("일월화수목금토".charAt(dayOfWeek));
		return dayOfWeek;
	}


}
