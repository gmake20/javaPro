package days17;

import java.util.ArrayList;
import java.util.Scanner;

// 클래스 다이어그램
// 시퀀스 다이어그램 

public class StudentManager {
	final int STUDENT_COUNT = 30;
	public ArrayList studentList = null;
	char con = 'y';
	int index = 0; // 입력받은 학생수



	public StudentManager() {
		studentList = new ArrayList(STUDENT_COUNT);
	}
	public StudentManager(int length) {
		studentList = new ArrayList(length);
	}

	// 1
	private void addStudent(Student student) {
		studentList.add(student);

	}

	// 2 
	public void processRank() {
		this.index = this.studentList.size();
		int rank;
		for (int i = 0; i < index; i++) { 
			rank = 1;
			Student 성적처리할학생  = (Student)studentList.get(i);
			for (int j = 0; j < index; j++) {
				Student 성적비교할학생 = (Student)studentList.get(i);
				if( 성적처리할학생.tot < 성적비교할학생.tot ) rank++;
			} // j			
			성적처리할학생.rank = rank;
		} // i		
	}

	// 3 
	public void printStudents() {
		index = studentList.size();
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			Student s = (Student)studentList.get(i);
			System.out.print( s.getInfo() );
		}	
	}

	public void inputStudents() {
		// 한 명 씩 학생 정보입력받아서 Student student 객체를 생성하고
		// manager.addStudent(  student 객체 )  메서드 호출해서
		// students 클래스 배열에 추가...시키겠습니다. 
		String name;
		int kor, eng, mat, tot;
		double avg;
		int no;

		Scanner scanner = new Scanner(System.in);
		do {
			no = studentList.size()+1;

			System.out.printf("%d번 이름 국어 영어 수학 입력: ", no );
			name = scanner.next();   
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			//
			tot = kor + eng + mat;
			avg = (double)tot/3;

			Student student = new Student();

			student.no = no;
			student.name = name; 
			student.kor = kor;
			student.eng = eng;
			student.mat = mat;
			student.tot = tot;
			student.avg = avg;

			addStudent(student);

			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 

	}
}
