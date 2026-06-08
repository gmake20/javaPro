package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09_02 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다."
	            + "폰번호:011-1234-5678, 집번호: 02-436-4948입니다.";
		String parrent = "\\d";
		
		String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		/*
			(0\\d{1,2})-(\\d{3,4})-(\\d{4})
			(0\\d{1,2}) => 앞자리가 0이고, 뒤에 자리수가 1자리나 2자리 숫자
			(\\d{3,4}) => 자리수가 3자리나 4자리 숫자
			(\\d{4}) => 자리수가 4자리 숫자
		 */
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		
		while(matcher.find()) {
			System.out.printf("%s:%s-%s-%s \n", matcher.group(),
					matcher.group(1),
					matcher.group(2),
					matcher.group(3));
		}
	}

}
