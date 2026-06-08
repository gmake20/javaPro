package days16;

import java.io.FileReader;

public class Ex7_02 {

	final static int UPPER_CASE = 0;
	final static int LOWER_CASE = 1;
	final static int DIGIT = 2;

	public static void main(String[] args) {
		String fileName = ".\\src\\days16\\Ex01.java";
		// 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		// :
		// Z(3)  : ###     	

		// [0] == 'A'
		// [1] == 'B'
		// ...
		// [25] == 'Z'
		int[][] counts = new int[3][];
		counts[UPPER_CASE] = new int[26];  // 대문자
		counts[LOWER_CASE] = new int[26];  // 소문자
		counts[DIGIT] = new int[10];  // 숫자(0~9)

		try (FileReader reader = new FileReader(fileName);
				) {
			int code = -1;
			char one;
			while((code = reader.read()) != -1) {
				one = (char)code;
				if(Character.isUpperCase(one)) {
					counts[UPPER_CASE][one-'A']++;
				}
				else if(Character.isLowerCase(one)) {
					counts[LOWER_CASE][one-'a']++;
				}
				else if(Character.isDigit(one)) {
					counts[DIGIT][one-'0']++;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		char c;
		// 막대그래프 출력
		for(int i=0;i<counts.length;i++) {
			for(int j=0;j<counts[i].length;j++) {
				switch(i) {
				case UPPER_CASE -> c = (char)('A'+j);
				case LOWER_CASE -> c = (char)('a'+j);
				default -> c = (char)('0'+j);
				}
				
				System.out.printf("%c(%d) : %s", c, counts[i][j],"#".repeat(counts[i][j]));	
				System.out.println();
			}
			System.out.println("-".repeat(80));
		}

	}

}
