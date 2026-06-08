package days07;

public class Ex04_02 {

	public static void main(String[] args) {
		String a = "aBcDe";
		String u = a.toUpperCase();		
		System.out.println(u);

		String l = a.toLowerCase();
		System.out.println(l);

		System.out.println(myToUpperCase(a));
	}

	// [2] 풀이
	public static String myToUpperCase(String s) { // "한aB7cDe"
		String upper = "";
		
		char ch ;
		for (int i = 0 ; i < s.length(); i++) {
			ch = s.charAt(i);
			if ( Character.isLowerCase(ch) ) {
				ch = Character.toUpperCase(ch);
			} // if
			upper += ch;
		} // for i
		return upper;
	}	

	//
	public static String myToUpperCaseScm(String s) {
		String str = "";
		char c;
		for(int i=0;i<s.length();i++) {
			c = s.charAt(i);
			if(c>='a' && c <='z') {
				str += (char)(c - ('a'-'A'));
			}
			else {
				str += s.charAt(i);
			}
		}
		return str;
	}

	/* [1]번풀이
	// 대문자로 변환해서 반환하는 기능을 하는 메소드 선언
	   public static String myToUpperCase(String s) { // "한aB7cDe"
	      // System.out.println( s.length()  );   7
	      String upper = "";
	      char ch ;
	      for (int i = 0 ; i < s.length(); i++) {
//	         System.out.printf("\'%c\'\n", s.charAt(i)  );
	         ch = s.charAt(i);
	         if ( 'a' <= ch && ch <= 'z' ) {
	            ch = (char) (ch - 32);
//	            System.out.println( ch );
	         } // if
	         upper += ch;
	      } // for i


	      return upper;
	   }	
	 */
}
