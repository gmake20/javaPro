package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author scm
 * @date 2026. 6. 1. 오후 3:12:32
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		// [try~with~resources 문] 자동으로 사용하던 자원 닫기
		/*
		// Resource leak: 'scanner' is never closed
		try (Scanner scanner = new Scanner(System.in)) {
			String message = scanner.next();
		}catch(Exception e) {
		}
		scanner.close();

		 */

		// 어떤 파일을 읽어 와서 출력.
		// [try~with~resources 문] 자동으로 사용하던 자원 닫기
		//		FileReader; // file read
		//		FileWriter: // file write

		// String filename = "src/days15/Car.java";
		String filename = "C:\\Class\\JavaClass\\javaPro\\src\\days15\\Car.java";
//		FileReader reader = null;

		try (FileReader reader = new FileReader(filename)) {
//			reader = new FileReader(filename);
			int one = -1;
			while((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			if(reader != null) {
//				try {
//					reader.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
		}

	}

}
