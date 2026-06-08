package days13;

import java.util.Date;

/**
 * @author scm
 * @date 2026. 5. 28. 오후 4:28:53
 * @subject 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		MyDate d = new MyDate();
		System.out.println(d.toLocaleString());
		d.printDate();
	}

}

class MyDate extends Date {

	public void printDate() {

		System.out.println(this);
	}
}