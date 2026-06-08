package days03;

/**
 * @author scm
 * @date 2026. 5. 13. 오후 2:09:50
 * @subject 대문자 -> 소문자변환 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char upperCase = 'X';
		char lowerCase = (char) (upperCase + 32);
		
		System.out.printf("%c -> %c\n",upperCase,lowerCase);
		
	}

}
