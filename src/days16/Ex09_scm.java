package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ex09_scm {

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c","bc","|", "c_", "c,","c.a", "car2", "ear2"};

		String[] regexArr = {
				"c[a-z]*",              // c로 시작하고 다음문자는 0개 이상의 소문자들로 이루어진 문자열
				"c[a-z]",               // c로 시작하고 다음문자는 소문자로 이루어진 2글자
				"c[a-zA-Z0-9]",         // c로 시작하고 다음문자는 영어나 숫자로 이루어진 2글자
				"c\\w",                 // \\w => [a-zA-Z0-9]와 _ 를 포함하는 2글자 (c와 단어문자1개)
				".*",                   // 임의의문자1개가 0회이상 반복 -> 모든문자열
				"c.",                   // c + 임의의문자1개
				"c\\.",                 // c. 과 일치하는 2글자.
				"c[0-9]",               // c + 숫자1개
				"c.*t",                 // c로시작 t로 끝나고 중간에 아무문자 0개이상
				"[b|c]",                // b c | 중의 1개인 1문자
				"[bc]",                 // b c 중의 1개인 1문자
				"[b-c].*",              // 첫글자가 b~c이고 . 아무문자, * 은 0 이상 => 첫글자가 b나c이고 그 위에는 아무글자가 0개이상인 문자열
				"[^bc].*",              // 첫글자가 b,c가 아닌문자이고, 그 뒤는 아무문자나상관없는 문자열
				".*a.*",                // 어딘가에 a가 포함
				"[^bcd].*",             // 첫글자가 b,c,d 로 시작하면 안되고 그 이후는 아무문자나 상관없는 문자열
				"[a-zA-Z].*",           // 첫글자가 영문소문자나 대문자, 그 이후는 아무문자나 상관없는 문자열
				"[ae-zA-Z].*",          // 첫글자가 a또는 e-z, 또는 대문자, 그 이후는 아무문자나 상관없는 문자열
				"[a-zA-Z&&[^b-d]].*"    // a-zA-Z&&[^b-d] => 첫글자는 영문자(a-zA-Z) and b~d까지가 아닌문자([^b-d]), 그 이후는 아무문자나 상관없는 문자열
										// 첫글자는 b,c,d를 제외한 영문자이고, 그 이후는 아무문자나 상관없는 문자열
		};

		for (int r = 0; r < regexArr.length; r++) {
			String regex = regexArr[r];
			System.out.println("=== regex: " + regex + " ===");
			Pattern pattern = Pattern.compile(regex);
			for (int i = 0; i < data.length; i++) {
				Matcher matcher = pattern.matcher(data[i]);
				if (matcher.matches()) {
					System.out.println(data[i]);
				}
			}
			System.out.println();
		}
	}

}
