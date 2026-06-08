package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex08 {

	public static void main(String[] args) {
		int[] m = IntStream.rangeClosed(1, 10).toArray();
		int[] m2 = IntStream.range(1, 10).toArray();
		System.out.println(Arrays.toString(m));

		shuffle2(m);
		System.out.println(Arrays.toString(m));

	}

	private static void shuffle2(int[] m) {
		for(int i=0,temp;i<m.length;i++) { 
			int [] indexes = new Random().ints(0,10).distinct().limit(2).toArray();
			temp = m[indexes[0]];
			m[indexes[0]] = m[indexes[1]];
			m[indexes[1]] = temp;
		}
	}

	private static void shuffle(int[] m) {
		int index1,index2;
		Random rnd = new Random();
		for(int i=0,temp;i<m.length;i++) {
			index1 = 0;
			index2 = rnd.nextInt(0,m.length);
			if(index1 == index2) i--;
			else {
				temp = m[index1];
				m[index1] = m[index2];
				m[index2] = temp;
			}
		
		}
	}

}
