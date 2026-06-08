package days09;

import java.util.Scanner;
import java.util.Random;

import com.util.MyString;

public class Ex01 {

	public static void main(String[] args) {
		// [복습문제] 
		// 1. 30 전체 학생수 저장할 상수 STUDENT_COUNT 선언
		final int STUDENT_COUNT = 30;
		// 2. 30명학생들의 정보를 저장할 names 배열선언
		String [] names = new String[STUDENT_COUNT];
		// 3. 30명학생들의 총점,평균,등수  저장할 tots배열선언
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		// 4. 각 배열에 입력값을 채울 용도 + 입력받은 학생수 : index 
		int index = 0;


		Scanner scanner = new Scanner(System.in);
		// 6. 반복적으로  이름, 총점(0~300) 입력받아서  평균 계산 : inputStudentInfo
		// 7. 등수 처리 : processStudentRank
		// 8. 모든 학생들 출력. : printStudentInfo
		index = inputStudentInfo(names,tots,avgs,scanner);

		// 7. 등수처리
		processStudentRank(tots,ranks,index);

		// 8. 모든 학생들 출력
		printStudentInfo(names,tots,avgs,ranks,index);
		
		System.out.println("=====end======");


	}

	private static void processStudentRank(int[] tots, int[] ranks, int index) {
		for(int i=0;i<index;i++) {
			ranks[i] = 1;
			for(int j=0;j<index;j++) {
				if(tots[i] < tots[j]) {
					ranks[i]++;
				}
			}
		}
	}

	private static void printStudentInfo(String[] names, int[] tots, double[] avgs, int[] ranks, int index) {
		for(int i=0;i<index;i++) {
			System.out.printf("> %2d번 이름: %s, 총점: %3d, 평균: %.2f, 등수: %2d\n"
					, i+1, names[i], tots[i], avgs[i], ranks[i]);
		}
	}

	private static int inputStudentInfo(String[] names, int[] tots, double[] avgs, Scanner scanner) {
		char con = 'y';
		int index = 0;
		do {
			System.out.printf("%d번 이름 총점 입력: ", index + 1);
			names[index] = getRandomoName(); // scanner.next();
			tots[index] = getRandomTot(); // scanner.nextInt();
			avgs[index] = (double)tots[index] / 3; 
			index++;
			System.out.print("계속 입력하시겠습니까? (y/n): ");
			con = scanner.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');

		return index;
	}
	
	

	public static String getRandomoName() {
		return MyString.generateRandomNameScm();
	}

	public static int getRandomTot() {
		Random random = new Random();
		return random.nextInt(0, 301);
	}
	
	



}
