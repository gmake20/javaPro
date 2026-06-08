package days15;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author scm
 * @date 2026. 6. 1. 오후 3:44:10
 * @subject FileReader read()한문자씩 읽기
 * @content BufferedReader 라인단위로 읽어와 출력 + 라인번호 : readLine
 */
public class Ex09_02 {

	public static void main(String[] args) {
		String key = "user.dir";
		String dir =  System.getProperty(key);
		// System.out.println( dir );
		// C:\E\Class\SS25Class\JavaClass\javaPro
		String fileName =  dir + "\\src\\days15\\Car.java";

		try (FileReader reader = new FileReader(fileName)
		; BufferedReader br = new BufferedReader(reader) // 보조 스트림
		) {
			String line = null;
			int lineNumber = 1;
			while((line = br.readLine()) != null) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			}
		} catch (Exception e) {
			
		}
	}

}
