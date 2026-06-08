package days07;

public class Ex01_02 {

	public static void main(String[] args) {
		System.out.println("[구구단 세로 출력]");
		// 강사님 코드
		for(int k=1;k<=2;k++) {
			for(int i=1;i<=9;i++) {
				for(int j=4*k-2;j<=4*k+1;j++) {
					System.out.printf("%d*%d=%2d\t",j,i,i*j);
				}
				System.out.println();
			}
			System.out.println();
			
		}

		// scm
		for(int k=2;k<=6;k+=4) {
			for(int i=1;i<=9;i++) {
				for(int j=k;j<k+4;j++) {
					System.out.printf("%d*%d=%2d\t",j,i,i*j);
				}
				System.out.println();
			}
			System.out.println();
			
		}


		/*
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				System.out.printf("%d*%d=%2d\t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			for(int j=6;j<=9;j++) {
				System.out.printf("%d*%d=%2d\t",j,i,i*j);
			}
			System.out.println();
		}
		*/
	}

}
