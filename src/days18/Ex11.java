package days18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Properties;

public class Ex11 {

	public static void main(String[] args) {
		String group = "1조:양인석/안정빈/신창만/이지훈/장미성";
		// 1. Properties 컬렉션
		// 팀명 : key, 팀원 value
		String[] groupArr = group.split(":");
		
//		String regex = "[/:]";
//		String[] lineArr = group.split(regex);
//		String teamName = lineArr[0];
//		Properties p = new Properties();
//		for (int i = 1; i < lineArr.length; i++) {
//			p.setProperty(teamName, lineArr[i]);
//		}
//		System.out.println(p);


		// 1ì¡°=ìì¸ì/ìì ë¹/ì ì°½ë§/ì´ì§í/ì¥ë¯¸ì±
		// 2. group1.properties 파일에 1조원 등 저장하는 코딩 하자.
		String fileName = ".\\src\\days18\\group1.properties";
		Properties p = new Properties();
		p.setProperty(groupArr[0], groupArr[1]);
		try (FileWriter write = new FileWriter(fileName);
				) {
			p.store(write, "comments");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("  END   ");
	}

}
