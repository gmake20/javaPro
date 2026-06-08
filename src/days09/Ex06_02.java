package days09;

/**
 * @author scm
 * @date 2026. 5. 21. 오후 3:44:04
 * @subject 2차원 배열 행/열 각 요소 구분
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 2행 4열 2차원배열 m
		//                   행 열
//		int [][]m = new int [2][4];
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[0][2] = 3;
//		m[0][3] = 4;
//		m[1][0] = 5;
//		m[1][1] = 6;
//		m[1][2] = 7;
//		m[1][3] = 8;
		
//		int [][]m = new int [][] { 
//			{1,2,3,4},
//			{5,6,7,8}
//		};

		int [][]m = { 
			{1,2,3,4},
			{5,6,7,8}
		};

		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);

		/*
		m[0][0]=1 m[0][1]=2 m[0][2]=3 m[0][3]=4 
		m[1][0]=5 m[1][1]=6 m[1][2]=7 m[1][3]=8 
		 */
		dispM(m);

	}

	private static void dispM(int[][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
			}
			System.out.println();
		}
		
	}

}
