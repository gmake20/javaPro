package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 20. 오전 11:48:30
 * @subject 배열 + 제어문 
 * @content  ㄴ 한 학생의 [이름, 국,영,수], 총, 평 출력.
 *           ㄴ 한 반에 30명의 학생들의 + 등수 입력, 출력.
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int STUDENT_COUNT = 20;

		char con = 'y';
		int index = 0;
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];

		String name;
		int kor, eng, mat, tot;
		double avg;

		do {
			System.out.printf("%d번 이름 국어 영어 수학 입력: ", index + 1 );
			name = scanner.next();   
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			//
			tot = kor + eng + mat;
			avg = (double)tot/3;

			names[index] = name;   
			kors[index] = kor;
			engs[index] = eng;
			mats[index] = mat;
			tots[index] = tot;
			avgs[index] = avg;

			index++;

			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 

		// index: 입력받은 학생수
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("> %d번 이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n"
					, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i]);
		}


	} // main

} // class





