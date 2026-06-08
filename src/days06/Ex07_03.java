package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오후 4:36:48
 * @subject 
 * @content 
 * 
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 특수문자
		String specialCharacters  = "~!@#$%^&*()_-+=`'\":;/?.,<>\\|";

		char ch ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 한 문자 입력: ");
		ch = scanner.next().charAt(0); // #
		
		// String: 문자열을 다루는 여러 기능을 하는 함수(메서드)
		//  ㄴ charAt(index)
		//  ㄴ equals()
		//  ㄴ format()
		//  ㄴ repeat()
		//     System.out.println("-".repeat(50));
		
		int index = specialCharacters.indexOf(ch);
		
		System.out.println( index );
		
		if (index == -1) {
			System.out.println("특수문자 X");
		} else {
			System.out.println("특수문자 O");
		}
		
		
		// [2] 람다와 스트림
		/*
		boolean isInclude = specialCharacters.chars().anyMatch(c -> c==ch);
		System.out.println( isInclude );
		*/
	} // main

} // class
