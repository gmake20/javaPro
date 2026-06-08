package days03;

/**
 * @author scm
 * @date 2026. 5. 13. 오후 12:29:45
 * @subject Ctrl+A, Ctrl+I => 들여쓰기 정렬
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String name = "이창익";
		

		int age = 20;
		{
//			int age = 20;
		}
		// The local variable name may not have been initialized
		// age cannot be resolved to a variable
		System.out.printf("> name:%s, age:%d\n", name, age);
	}

}
