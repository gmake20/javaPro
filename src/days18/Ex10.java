package days18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 2:08:14
 * @subject C -> L : ArrayList, Vector, Stack, LinkedList
 * @content C -> S : HashSet, LinkedHashSet, TreeSet
 *               M : HashMap(신) == HashTable(구)
 *                    동기화X         동기화O
 *               Properties 컬렉션 클래스
 *               ㄴ key String, value String
 *               ㄴ 주로 설정파일을 읽기/쓰기
 *               ㄴ ???.properties확장자명
 *               ㄴ HashTable의 자식클래스
 *               
 */
public class Ex10 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days18\\databases.properties";
		String fileName2 = ".\\src\\days18\\databases.xml";

		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";

		
		Properties p = new Properties();
		// p.put("className", p);
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);


		try (FileWriter write = new FileWriter(fileName);
			OutputStream os = new FileOutputStream(fileName2)) {
			p.store(write, "comments");
			p.storeToXML(os, "comment");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("  END   ");
	}
}