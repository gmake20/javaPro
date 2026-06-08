package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author scm
 * @date 2026. 5. 13. 오후 2:46:58
 * @subject 키보드 입력
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String name;
		System.out.print("> 이름 입력하세요? ");
		// Unhandled exception type IOException
		name = br.readLine();
		
		System.out.printf("%s%n",name);

	}

}
