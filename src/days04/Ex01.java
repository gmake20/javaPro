package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2026. 5. 14. 오전 7:16:29
 * @subject 이시연, 신창만
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name, email, phone, address;
		int age;
		boolean gender;
		char grade; // 'A' 'F'
		
		System.out.print("이름을 입력하세요: ");
		name = br.readLine();
		System.out.print("나이을 입력하세요: ");
		age = Integer.parseInt( br.readLine() );  // String readLine()   "25" -> 25   String->int 형변환
		System.out.print("이메일을 입력하세요: ");
		email = br.readLine();
		System.out.print("휴대폰 번호를 입력하세요: ");
		phone = br.readLine();
		System.out.print("주소를 입력하세요: ");
		address = br.readLine();
		System.out.print("성별을 입력하세요 (true=남성, false=여성): ");
		gender = Boolean.parseBoolean(br.readLine()); // String -> boolean 형변환
		
		System.out.print("등급을 입력하세요 (A, B, C, D, F): ");
		//      "A"		
		grade = br.readLine().charAt(0); // String -> char 형변환
		
		// 문자열 "이창익" -> 문자   형변환X    내가원하는위치의 한문자를 얻어오는작업
		//  A   변수 인식
		// 'A'  한 문자
		// "A"  문자열   =  'A' + 'null'
		
		
		
		System.out.printf("===== 입력한 개인정보 =====\r\n"
				+ "	이름: \"%s\"\r\n"
				+ "	나이: %d\r\n"
				+ "	이메일: %s\r\n"
				+ "	휴대폰 번호: %s\r\n"
				+ "	주소: %s\r\n"
				+ "	성별: %b\n"
				+ " 등급: '%c'"
				, name, age, email, phone, address, gender, grade);

	} // main

} // class

/*
 * [복습문제]
 * 1. 입력형식
	이름을 입력하세요: 홍길동
	나이를 입력하세요: 25
	이메일을 입력하세요: test@example.com
	휴대폰 번호를 입력하세요: 010-1234-5678
	주소를 입력하세요: 서울특별시 강남구
	성별을 입력하세요 (true=남성, false=여성): true

 * 2. 출력형식
	===== 입력한 개인정보 =====
	이름: "홍길동"
	나이: 25
	이메일: test@example.com
	휴대폰 번호: 010-1234-5678
	주소: 서울특별시 강남구
	성별: true
 * */

/*
등급을 입력하세요 (A, B, C, D, F): A 
등급: 'A'
*/	





