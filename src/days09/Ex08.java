package days09;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex05_02;

/**
 * @author kenik
 * @date 2026. 5. 21. 오후 4:11:35
 * @subject 3학년 * 10반 * 30명    국어
 * @content [ 3반 * 30명  이,국,영,수   총,평,등,전등 출력. ]
 * 
 */
public class Ex08 {

	public static void main(String[] args) {

		final int KOR = 0;
		final int ENG = 1;
		final int MAT = 2;
		final int TOT = 3;
		final int RANK = 4;
		final int WRANK = 5;

		// 1차원 배열
		// int [] kors = new int[3*10*30];
		// int [][][] kors = new int[3][10][30];      
		// kors[1][0][0] ~kors[1][0][29]  

		//                         행: 반, 열: 번호
		String [][] names = new String[3][30];

		// 열: 0국, 1영, 2수, 3총, 4등, 5전등
		// 행: 학생번호
		// 면: 반
		int [][][] infos = new int[3][30][6];

		//                         행: 반, 열: 번호
		double [][] avgs = new double[3][30];

		// indexes[0] : 1반학생 입력받은 학생수 == 입력할 위치
		// indexes[1] : 2반학생 입력받은 학생수 == 입력할 위치
		// indexes[2] : 3반학생 입력받은 학생수 == 입력할 위치
		int [] indexes = new int[3];
		char con = 'y';

		// 1. 입력
		Scanner scanner = new Scanner(System.in);

		String name;
		int kor, eng, mat, tot;
		double  avg;
		int rank, wrank;
		int classNo; // 1,2,3 반 저장할 변수

		do {
			// 1) 반 입력 - 1,2,3
			System.out.print("> 1. 반 입력: ");
			classNo = scanner.nextInt();
			// 2) 반 번 이/국/영/수 입력
			System.out.printf("> 2. %d반 [%d번] 학생 이름,국어,영어,수학 입력: "
					, classNo, indexes[classNo-1]+1);

			name = Ex01.getRandomoName();
			kor = Ex05_02.generateRandomScore();
			eng = Ex05_02.generateRandomScore();
			mat = Ex05_02.generateRandomScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;

			names[classNo-1][indexes[classNo-1]] = name;
			infos[classNo-1][indexes[classNo-1]][KOR] = kor;
			infos[classNo-1][indexes[classNo-1]][ENG] = eng;
			infos[classNo-1][indexes[classNo-1]][MAT] = mat;
			infos[classNo-1][indexes[classNo-1]][TOT] = tot;
			avgs[classNo-1][indexes[classNo-1]] = avg;

			indexes[classNo-1]++;
			// scanner.nextLine(); // 제거         
			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' );

		// 2. 등수,전교등수 
		// 등수
		for(int i=0;i<3;i++) {
			for(int j=0;j<indexes[i];j++) {
				// 일단 나는 1등. 반의 모든 유저와 비교하여 나보다 크면 1증가
				infos[i][j][RANK] = 1;
				for(int k=0;k<indexes[i];k++) {
					if(infos[i][j][TOT] < infos[i][k][TOT]) {
						infos[i][j][RANK]++;
					}
				}
			}
		}
		
		// 전교등수
		for(int i=0;i<3;i++) {
			for(int j=0;j<indexes[i];j++) {
				// 일단 나는 1등. 전체 학생의 모든 유저와 비교하여 나보다 크면 1증가
				infos[i][j][WRANK] = 1;
				for(int l=0;l<3;l++) {	
					for(int k=0;k<indexes[i];k++) {
						// 등수체크하려는 i반j번 학생총점 < l반 k번 학생 총점
						if(infos[i][j][TOT] < infos[l][k][TOT]) {
							infos[i][j][WRANK]++;
						}
					}
				}
			}
		}

		// 3. 출력
		int totalCount = IntStream.of(indexes).sum();
		System.out.printf("[전체 학생수: %d명]\n", totalCount);
		for(int i=0;i<indexes.length;i++) {
			System.out.printf("[%d]반 학생수 %d명\n", i+1, indexes[i]);
			for(int j=0;j<indexes[i];j++) {
				System.out.printf("> %2d번 이름: %s, 국어: %3d, 영어: %3d, 수학: %3d, 총점: %3d, 평균: %.2f, 등수: %2d, 전교등수: %2d\n"
						, j+1, names[i][j], infos[i][j][KOR], infos[i][j][ENG], infos[i][j][MAT], infos[i][j][TOT], avgs[i][j]
						, infos[i][j][RANK], infos[i][j][WRANK]);
			}
		}


	} // main


} // class








