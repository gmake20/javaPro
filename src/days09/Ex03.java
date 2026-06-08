package days09;

public class Ex03 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";
	
		// 생년월일 : "1983년 4월 12일"
		System.out.println(getBirthday(rrn));
		
		/*
		char ch = rrn.charAt(7);
		int gender = Integer.parseInt(ch+"");
		// 12 30
		String year = "20";
		if(gender%4 < 3) year = "19";
		String birth = rrn.substring(0, 2);
		String month = rrn.substring(2, 4);
		String day = rrn.substring(4, 6);
		System.out.printf("생년월일 : %d년 %d월 %d일\n", birth, month, day);
		*/
	}

	public static String getBirthday(String rrn) {
		// 1900 1 2 5 6
		// 1800 9 0
		// 2000 3 4 7 8 
		int centry = getCentry(rrn);
		int year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));

		System.out.printf("생년월일 : %d년 %d월 %d일\n", centry+year, month, day);
		
		return String.format("%d년 %d월 %d일", centry+year, month, day);
	}

	public static int getCentry(String rrn) {
		int centry = 0;
		switch(rrn.charAt(7)) {
			case '1','2','5','6'-> centry = 1900;
			case '3','4','7','8'-> centry = 2000;
			default -> centry = 1800;
		}
		
		/* [1] 풀이
		switch ( rrn.charAt(7)-'0' ) {    // 2
	      case 1: case 2: case 5: case 6:
	         centry = 1900;
	         break;
	      case 3: case 4: case 7: case 8:
	         centry = 2000;
	         break;
	      default:
	         centry = 1800;
	         break;
	      }
	      */
		
		return centry;
	}

}
