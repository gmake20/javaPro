package days03;

/**
 * @author scm
 * @date 2026. 5. 13. 오후 2:32:45
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		System.out.printf("> 전: x=%d, y=%d\n", x, y);

		{
			int tmp = x;
			x = y;
			y = tmp;
		} 

		System.out.printf("> 후: x=%d, y=%d\n", x, y);

	}

}
