package days09;

/**
 * @author scm
 * @date 2026. 5. 21. 오후 3:44:34
 * @subject 3차원 배열 면/행/열
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// 2면 2행 2열 3차원 배열 m
		int [][][] m = new int[2][3][4]; 
		
//		System.out.println(m.length); // 면갯수
//
//		System.out.println(m[0].length); // 행갯수
//		System.out.println(m[1].length); // 행갯수
//
//		System.out.println(m[0][0].length); // 열갯수
//		System.out.println(m[0][1].length); // 열갯수
//		System.out.println(m[0][2].length); // 열갯수

		
		dispM(m);
	}

	private static void dispM(int[][][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					System.out.printf("m[%d][%d][%d]=%d ",i,j,k,m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
