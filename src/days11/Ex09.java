package days11;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author scm
 * @date 2026. 5. 26. 오후 4:48:47
 * @subject 한반에 30명학생의 이름,국,영,수,총,평,등 처리
 * @content days08.Ex05.java 참고
 *          Student.java클래스 선언 + 필드/메서드
 *          
 *          
 *          
 */
public class Ex09 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int STUDENT_COUNT = 30;

		Student[] students = Stream.generate(() -> new Student()).limit(STUDENT_COUNT).toArray(Student[]::new);	
		int [] ranks = new int[STUDENT_COUNT];
		int index = 0;
		index = inputStudentInfo(students, index, scanner);
		
		// 등수처리  Call By Reference   Call By Value
		processStudentRank(students, ranks, index);

		// 학생들 성적 정보 출력
		// index: 입력받은 학생수 -> count
		printStudentInfo(students, ranks, index);

	} // main

	private static int inputStudentInfo(Student[] students,
			int index, Scanner scanner) {		
		char con = 'y';
		
		int kor,eng,mat;
		
		do {
			System.out.printf("%d번 이름 국어 영어 수학 입력: ", index + 1 );
			students[index].name = generateRandomName() ; //scanner.next();	
			kor = generateRandomScore(); // scanner.nextInt();
			eng = generateRandomScore(); //scanner.nextInt();
			mat = generateRandomScore(); //scanner.nextInt();
			//
			students[index].setScore(kor,eng,mat); 
			index++;

			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 
		
		return index;
	}

	private static void printStudentInfo(Student[] students,
			int[] ranks, int index) {
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf(
					"> %d번 이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f, 등수:%d\n"
					, i+1, students[i].name, students[i].kor, students[i].eng, students[i].mat, students[i].tot, students[i].avg, ranks[i]);
		}

	}

	private static String generateRandomName() {
		// '가' 44032 ~ '힣' 55203
		char [] nameArr = new char[3];

		// String -> char[] 변환
		Random rnd = new Random();
		char nameChar;
		for (int i = 0; i < nameArr.length; i++) {
			nameChar = (char) rnd.nextInt('가', '힣');
			nameArr[i] = nameChar;
		}

		// char [] -> String 변환
		//	    String name = new String( nameArr );
		String name = String.valueOf(nameArr);

		return name;
	}

	private static int generateRandomScore() {
		Random rnd = new Random();
		int score = rnd.nextInt(0, 101);
		return score;
	}

	private static void processStudentRank(Student[] students, int[] ranks, int index) {
		// i=0
		// j=0123
		// i=1
		// j=0123
		for (int i = 0; i < index; i++) { 
			ranks[i] = 1;
			for (int j = 0; j < index; j++) { 
				if( students[i].tot < students[j].tot ) ranks[i]++;
			} // j			
		} // i

	}
	
}


class Student {
	String name;
	int kor,eng,mat,tot,rank;
	double avg;
	
	void setScore(int k,int e,int m) {
		kor = k;
		eng = e;
		mat = m;
		tot = kor + eng + mat;
		avg = (double)tot/3;
	}
}