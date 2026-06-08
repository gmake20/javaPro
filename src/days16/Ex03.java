package days16;

import java.util.StringTokenizer;

/**
 * @author scm
 * @date 2026. 6. 2. 오전 11:25:46
 * @subject 4. StringTokenizer class
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		String group1 = "양인석,안정빈,신창만,이지훈,장미성";
		// group1.split(","); 권장
		
		StringTokenizer tokenizer = new StringTokenizer(group1,",");
		System.out.println(tokenizer.countTokens());
		
		// hasMoreTokens() : tokenizer 객체안에 토근 아직 가지고 있니? true,false 
		while(tokenizer.hasMoreTokens()) {
			String name = tokenizer.nextToken();
			System.out.println(name);
		}
		

	}

}
