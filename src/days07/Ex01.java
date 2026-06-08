package days07;

public class Ex01 {

	
	public static void main(String[] args) {
		/* 
		 * 1. 구구단 2~9단 가로 출력
		 * 2. 구구단 2~9단 세로 출력
		 * */

		System.out.println("[구구단 가로 출력]");
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%2d%s",i,j,i*j,j==9?"\n":"\t");
			}
		}
		System.out.println("[구구단 세로 출력]");
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%2d%s",j,i,i*j,j==9?"\n":"\t");
			}
		}
		
		
	}

}
