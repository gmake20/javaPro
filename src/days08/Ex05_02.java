package days08;

import java.util.Random;
import java.util.Scanner;

import com.util.MyString;

import days09.Ex01;

public class Ex05_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int STUDENT_COUNT = 20;

		int index = 0;
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];

		index = inputStduentInfo(names,kors,engs,mats,tots,avgs,scanner);
		
		// 등수처리
		// Call by reference
		processStudentRank(tots,ranks,index);

		// index : 입력받은 학생수 
		printStudentInfo(names,kors,engs,mats,tots,avgs,ranks,index);

	} // main

	private static int inputStduentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs, Scanner scanner) {
		String name;
		int kor, eng, mat, tot;
		double avg;
		char con = 'y';
		int index = 0;

		do {
			System.out.printf("%d번 이름 국어 영어 수학 입력: ", index + 1 );
			name = generateRandomName(); //scanner.next();
			name = MyString.generateRandomNameScm();
			kor = generateRandomScore(); // scanner.nextInt();
			eng = generateRandomScore(); // scanner.nextInt();
			mat = generateRandomScore(); // scanner.nextInt();
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
		
		return index;
	}

	private static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int index) {
		// TODO Auto-generated method stub
		// index: 입력받은 학생수
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("> %2d번 이름: %s, 국어:%3d, 영어:%3d, 수학:%3d, 총점:%3d, 평균:%.2f 등수:%2d\n"
					, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}		
	}

	public static String generateRandomName() {
		return Ex01.getRandomoName();
		
		/*
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
		//	       String name = new String( nameArr );
		String name = String.valueOf(nameArr);

		return name;
		*/
	}

	public static int generateRandomScore() {
		Random rnd = new Random();
		int score = rnd.nextInt(0, 101);
		return score;
	}

	public static void processStudentRank(int[] tots, int[] ranks, int index) {
		for (int i = 0; i < index; i++) {
			// 일단 자기자신은 무조건 1등
			ranks[i] = 1;
			// 자기자신보다 더 높은 사람이 있으면 1씩더한다.
			for (int j = 0; j < index; j++) {
				if (tots[i] < tots[j]) {
					ranks[i]++;
				}
			}
		}
	}



}
