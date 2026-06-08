package days16;

import java.util.Arrays;



/**
 * @author scm
 * @date 2026. 6. 2. 오전 9:01:41
 * @subject 
 * @content 문자열 다루는 클래스 
  	1. String 클래스        *****
		ㄴ 변경 불가능한 클래스
  	2. StringBuffer 클래스
	3. StringBuilder 클래스
   	4. StringTokenizer 클래스  
    5. StringJoiner 클래스     
 */
public class Ex01 {

	public static void main(String[] args) {

		String a = "abc";
		String b = "ABC";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		
		
		
		
		String s = "   public statIc void main(String[] args) {  ic iC Ic IC ";
/*		
		String[] sArr = s.trim().split("\\s");
		System.out.println(Arrays.toString(sArr));;
		
		System.out.println("<b>" + String.join("</b><b>", sArr) + "</b>");
*/		
		
		// var : 지역변수에서 사용 
//		String name = "홍길동";
//		int age = 20;
//		double avg = 98.77;
		
//		var name = "홍길동";
//		var age = 20;
//		var avg = 98.77;		
		
		/*
		// 검색어 : keyword
		String keyword = "main";
		// 찾는 문자열의 위치 확인
		int index = -1;
//		if((index = s.indexOf(keyword))== -1) {
		if((index = s.lastIndexOf(keyword))!= -1) {		
			System.out.printf("찾는 문자열(%s)이 (%d) 에 있다.\n",keyword,index);
			// main -> 메인 수정
			String str2 = s.substring(0,index) + "메인" + s.substring(index+keyword.length());
			System.out.println(s);
			System.out.println(str2);
			
			System.out.println(s.replace(keyword, "메인"));
			
//			System.out.println(s.substring(0,index));
//			System.out.println(s.substring(index+keyword.length()));
			
			// ic   Ic  아이시
			keyword = "(ic|Ic)";
			s.replaceAll(keyword,s);
			System.out.println(s.replaceAll("(ic|Ic)","아이시"));
			System.out.println(s.replaceAll("(i|I)c","아이시"));
			System.out.println(s.replaceAll("[iI]c","아이시"));  
			System.out.println(s.replaceAll("(?i)ic","아이시")); // 대소문자 구분없는 ic 
			System.out.println(s.replaceFirst("(?i)ic","아이시"));
			
		} else {
			System.out.printf("찾는 문자열(%s)이 없다.\n",keyword);						
		}
		
		// 문자열의 유무 확인
		if( s.contains(keyword) ) {
			System.out.printf("찾는 문자열(%s)이 있다.\n",keyword);
		} else {
			System.out.printf("찾는 문자열(%s)이 없다.\n",keyword);			
		}
		*/
		
		
		/*
		// 문자열 앞뒤의 공백 제거
		System.out.println("[" + s + "]");
		s = s.trim();
		System.out.println("[" + s + "]");
		*/
		
		/*
		// String -> char[]
		char[] sArr = s.toCharArray();
		System.out.println(Arrays.toString(sArr));
		// char[] -> String
		String t = String.valueOf(sArr);
		System.out.println(t);
		*/
		
		
		/*
		int length = s.length();
		System.out.println("1. 문자열 길이: " + length);
		
		char third = s.charAt(2);
		System.out.println("2. 세번째 한문자: " + third);
		
		String su = s.toUpperCase();
		System.out.println("3. : " + su);
		String sl = s.toLowerCase();
		System.out.println("3. : " + sl);
		
		String regex = "[\\s()]"; // 공백
		String [] sArr = s.split(regex,3);
		System.out.println(Arrays.toString(sArr));
		*/
		
	}

}
