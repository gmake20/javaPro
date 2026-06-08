package days15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) {
		// checkd 예외 / unchecked 예외
		// 컴파일러가 예외처리 했는지 유무를 체크.
		//  ㄴ RuntimeException 및 그 자식 예외 클래스들은
		//    컴파일러가 예외처리 유무를 확인하지 않음. [unchecked 예외]
		//  ㄴ 그외 모든 Exception클래스들은 컴파일러가 예외처리 유무를 확인함 : [checkd 예외]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;

		System.out.print("> 이름 입력: ");
		// Unhandled exception type IOException
		// IOException 예외 처리를 해야함
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("> 이름=" + name);	

	}

}
