package days10;

import java.util.Arrays;

public class Ex09_02 {
	public static void main(String[] args) {
		int [][] m = {{ 1,2,3,4} ,{5,6,7,8 }};
		int []n = new int[8];
		
		// 2차원 -> 1차원 배열 이동
//		for(int i=0;i<n.length;i++) {
//			n[i] = m[i/m[0].length][i%m[0].length];
//		}
		
		for(int i=0,index=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) 
				n[index++] = m[i][j];
		}
		System.out.println(Arrays.toString(n));
		
		// [2][6] => [3][4]
		int [][] x = {{ 1,2,3,4,5,6} ,
				{7,8,9,10,11,12 }};
		int [][] y = new int[3][4];
		
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				temp = i*6+j; 
				y[temp/4][temp%4] = x[i][j];
			}
		}

		System.out.println(Arrays.toString(y[0]));
		System.out.println(Arrays.toString(y[1]));
		System.out.println(Arrays.toString(y[2]));
		
		// i*6+j
		// i*6+j/4
		// i*6+j%4
		
	}
}
