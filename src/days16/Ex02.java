package days16;

/**
 * @author scm
 * @date 2026. 6. 2. 오전 10:37:21
 * @subject 
 * @content
			2. StringBuffer - 멀티스레드에 안전(==동기화처리되어있음)
			3. StringBuilder 
 */
public class Ex02 {

	public static void main(String[] args) {
		// String: 수정, 삭제, 삽입  X
		//      String s = "TODO Auto-generated method stub";
		//      int index = s.indexOf("generated");
		//      
		//      System.out.println( s.substring(0, index + "generated".length()) + " 삽입" + s.substring(index + "generated".length()) );

		StringBuilder sb = new StringBuilder("public static void main(String[] args) {");
		sb.append("끝에 문자열 연결");
		sb.delete(1, 5);
		sb.replace(0, 2, "바꿈");
		sb.insert(1, "삽입");
		sb.reverse();
		System.out.println(sb.toString());
		
		
		// testStringAppend();
		// testStringBuilderAppend();
		System.out.println("   END    ");
	}

	public static void testStringAppend() {

		long start = System.nanoTime();

		// 281초
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		}

		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}
	

	public static void testStringBuilderAppend() {

		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2000000; i++) {
			sb.append("a");
		}

		// 0.008초 
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}	
}
