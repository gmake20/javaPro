package days17;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 2:09:58
 * @subject 한반 30명 학생의 이/국/영/수/총/평/등
 * @content Student Class를 Class Array로 선언해서 처리함.
			days12.Ex01.java
			      .Student.java
			      .StudentManager.java
 */
public class Ex07 {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager(15);

		manager.inputStudents();
		manager.processRank();      
		manager.printStudents();

	}

}
