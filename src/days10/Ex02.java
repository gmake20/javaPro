package days10;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int [] m = new Random().ints(1,100).limit(5).toArray();
		System.out.println(Arrays.toString(m));
		System.out.println(m.length);
		
		int index = m.length;
		if(index >= m.length) {
			int [] temp = new int[m.length+3];
			System.arraycopy(m, 0, temp, 0, m.length);
			// System.arraycopy(m, 1, temp, 2, 3);
			// Arrays.copyOf() ***
			m = temp;
		}
		m[index] = 100;
		
		System.out.println(Arrays.toString(m));
	}

}
