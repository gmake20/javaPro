package days12;

import java.util.Scanner;

// 클래스 다이어그램
// 시퀀스 다이어그램 

public class StudentManager {
	final int STUDENT_COUNT = 30;
	public Student[] students = null;
	char con = 'y';
	int index = 0; // 입력받은 학생수



	public StudentManager() {
		students = new Student[STUDENT_COUNT];
	}
	public StudentManager(int length) {
		students = new Student[length];
	}

	// 1
	private void addStudent(Student student) {
		if(index>=students.length) {
			System.out.println("> 30명 입력 완료!!");
			return;
		}
		student.no = index;
		students[index++] = student;

	}

	// 2 
	public void processRank() {
		int rank;
		for (int i = 0; i < index; i++) { 
			rank = 1;
			for (int j = 0; j < index; j++) { 
				if( students[i].tot < students[j].tot ) rank++;
			} // j			
			students[i].rank = rank;
		} // i		
	}

	// 3 
	public void printStudents() {
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.print( students[i].getInfo() );
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
			no = index + 1;

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
