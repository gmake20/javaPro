package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author scm
 * @date 2026. 6. 5. 오전 9:24:44
 * @subject 게임 횟수 로또 게임처리  
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days18\\1차_조편성.txt";
		String line = null;

		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		String regex = "[/:]";
		String[] lineArr = null;
		try( 
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				) {

			ArrayList<String> tmList = null;
			while((line = br.readLine()) != null) {
				// System.out.println(line);
				// 1조:양인석/안정빈/신창만/이지훈/장미성
				lineArr = line.split(regex);
				tmList = new ArrayList<>();
				for(int i=1;i<lineArr.length;i++) {
					tmList.add(lineArr[i]);
				}
				class5.add(tmList);

				// System.out.println("  END   ");
			}

			// 5강의장의 각 조원을 출력하는 메소드 호출
			dispClass5(class5);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dispClass5(ArrayList<ArrayList<String>> class5) {
		/*
		 * [5강의장]
		 * 1조
		 *   ㄴ 1번 홍길동
		 *   :
		 * 2조
		 *   ㄴ 1번 김길동
		 *   :  
		 * 
		 * */ 	
		// [1] 반복문사용		
		//		System.out.println("[5강의장]");
		//		for(int i=0;i<class5.size();i++) {
		//			System.out.printf("%d조\n", i+1);
		//			for(int j=0;j<class5.get(i).size();j++) {
		//				System.out.printf(" ㄴ %d번 %s\n", j+1, class5.get(i).get(j));
		//			}
		//		}


		// [2] iterator(반복자) 사용
		//		System.out.println("[5강의장]");
		//		Iterator<ArrayList<String>> ir = class5.iterator();
		//		int index = 1;
		//		int teamIndex = 1;
		//		while (ir.hasNext()) {
		//			System.out.printf("%d조\n", teamIndex++);
		//			Iterator<String> ir2 = ir.next().iterator();
		//			index = 1;
		//			while(ir2.hasNext()) {
		//				System.out.printf(" ㄴ %d번 %s\n", index++,ir2.next());
		//			}
		//		}


		System.out.println("[5강의장]");
		Iterator<ArrayList<String>> ir = class5.iterator();
		int n = 1;
		while (ir.hasNext()) {
			System.out.printf("%d조\n", n++);
			ArrayList<String> tmList = (ArrayList<String>) ir.next();
			
			// 정렬. 둘다 같은뜻임
			tmList.sort(null);
			Collections.sort(tmList);
			
			Iterator<String> ir2 = tmList.iterator();
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf("  ㄴ %s\n", name);
			} // while ir2

		} // while ir

	}		

}
