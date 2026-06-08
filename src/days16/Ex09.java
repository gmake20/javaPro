package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author scm
 * @date 2026. 6. 2. 오후 2:09:07
 * @subject                              
 * @content [정규표현식([Reg]ular [Ex]pression)]  regex
 *           ㄴ 문자열 속에 원하는 패턴(pattern)과 일치하는 문자열을 찾기
 *           위해서 사용하는 식
 *           ㄴ 미리 정의된 기호와 식.   \\s   [A-Z]  *  +  ? 등등
 *           ㄴ 자바   java.util.regex 패키지
 *                        ㄴ Pattern 클래스 - 정규식을 정의
 *                        ㄴ Matcher 클래스 - 데이타와 정규식(pattern객체)을 비교
 * ㄴ j
 *                           ㄴ
 */
public class Ex09 {

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c", "car2"};
		//		String regex = "c[a-z]*"; // c로 시작하고 다음문자는 0개 이상의 소문자로 되어있어야함
		//		String regex = "c[a-z]"; // c로 시작하고 다음문자는 소문자로 이루어진 2글자여야함.
				String regex = "c[a-zA-Z0-9]"; // c로 시작하고 다음문자는 영어나 숫자로 이루어진 2글자여야함.
		// String regex = "c\\w";  // \\w => [a-zA-Z,0-9]'  [^a-zA-Z0-9] // v : 부정(Not)

// String regex = ".*";	// 임의의문자1개가 0회이상 반복 -> 모든문자열
// String regex = "c."; // c + 임의의문자1개 
// String regex = "c\\.";  // [c.] 으로 시작해야함. 
// String regex = "c[0-9]";  // c + 숫자1개
// String regex = "c.*t";  // c로시잓 t로 끝나고 중간에 아무문자 0개이상.
// String regex = "[b|c]"; // b나 c나 | 
// String regex = "[bc]"; // b 또는 c 
// String regex = "[b-c].*"; // 첫글자가 b또는c이고 그 뒤는 아무문자
// String regex = "[^bc].*"; // 첫글자가 b,c를 제외하고 그 뒤는 아무문자
// String regex = ".*a.*";   // a앞뒤에 .*이므로 , 어딘가에 a가 포함. 결과적으로 a만 존재하면됨.
// String regex = "[^bcd].*"; // 첫글자가 b,c,d 로 시작하면 안됨.

// String regex = "[a-zA-Z].*"; // 첫글자가 영문소문자나 대문자.
// String regex = "[ae-zA-Z].*";   // 첫글자가 a또는 e-z, 또는 대문자
// String regex = "[a-zA-Z&&[^b-d]].*";		// 영문자중 b,c,d 제외
		Pattern pattern = Pattern.compile(regex);
		for(int i=0;i<data.length;i++) {
			Matcher matcher = pattern.matcher(data[i]);
			if(matcher.matches()) {
				System.out.println(data[i]);
			}
		}


		/*
		// [Sring.matches(String regex)]  
		for(int i=0;i<data.length;i++) {
			if(data[i].matches(regex)) {
				System.out.println(data[i]);
			}
		}
		 */
		
//      String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
	}

}
