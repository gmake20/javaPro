package days10;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] m = { 1,2,3,4,5,6,7,8 };
		int [][]n = new int[2][4];
		
		for(int i=0;i<m.length;i++) {
			n[i/n[0].length][i%n[0].length] = m[i];
		}
		
	
		System.out.println(Arrays.toString(n[0]));
		System.out.println(Arrays.toString(n[1]));
	}

}
