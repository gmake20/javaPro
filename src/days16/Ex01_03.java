package days16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_03 {

	public static void main(String[] args) {

		// 학생명단.txt 출력
		// . 현재 디렉토리 javaPro폴더
		// .. 상위 디렉토리
		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days16\\학생명단.html";
		try (
				FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				FileWriter out = new FileWriter(saveFileName);
				
				) {
			String name = null;
			System.out.println("<ol>");
			out.write("<ol>");
			while((name = br.readLine()) != null) {
				System.out.printf("<li>%s</li>\n",name);
				out.write("<li>" + name + "</li>\n");
			}
			System.out.println("</ol>");
			out.write("</ol>");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("   END     ");
	}

}
