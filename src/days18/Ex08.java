package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik
 * @date 2026. 6. 5. 오전 9:24:29
 * @subject                  1조->  ArrayList
 * @content                  2조->  ArrayList
 *                 5강의장-> ArrayList
 */
public class Ex08 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\1차_조편성.txt";
		String line = null;  // 1조:양인석/안정빈/신창만/이지훈/장미성

		//      ArrayList<ArrayList<String>> class5 = new ArrayList<>(); 
		ArrayList<HashMap<String, ArrayList<String>>> class5 = new ArrayList<>(); 

		try (
				FileReader in = new FileReader(fileName);   
				BufferedReader br = new BufferedReader(in);   
				){

			HashMap<String, ArrayList<String>> tmHMap = null; // HashMap
			String teamName = null;  // 팀명   Key
			ArrayList<String> tmList = null; // 팀원 리스트 Value
			String regex = "[/:]";
			String [] lineArr = null;
			while( ( line = br.readLine() ) != null ) {
				tmHMap = new HashMap<String, ArrayList<String>>();
				//            System.out.println(line);
				// 1조:양인석/안정빈/신창만/이지훈/장미성
				tmList = new ArrayList<String>();
				lineArr = line.split(regex);
				teamName = lineArr[0]; // 팀명 KEY
				for (int i = 1; i < lineArr.length; i++) {
					String name = lineArr[i];
					tmList.add(name);
				}
				tmHMap.put(teamName , tmList);
				class5.add(tmHMap);
			} // while

			// 5강의장의 각 조원들 출력하는 메소드 호출
			dispClass5(class5);

			System.out.println( "END");
		} catch (Exception e) {
			e.printStackTrace();      
		}


	} // main

	private static void dispClass5(ArrayList<HashMap<String, ArrayList<String>>>  class5) {
		/*
		 * [5강의장]
		 * 1조
		 *   ㄴ 1번 홍길동         이름 오름차순 정렬 팀원 출력
		 *   :
		 * 2조
		 *   ㄴ 1번 김길동
		 *   :  
		 * 
		 * */ 
		/*
ArrayList<HashMap<String, ArrayList<String>>>
          HashMap<String, ArrayList<String>> => Key값  (String): 1조,2조 , 
                                                Value (ArrayList<String>): 학생명단 		
		 */

		
		{
		// ArrayList<HashMap<String, ArrayList<String>>> class5
		System.out.println("[5강의장]");
		// ir.next() 1번째 → HashMap { "1조" → [양인석, 안정빈, ...] }
		// ArrayList에서 HashMap을 1개씩 꺼낸다.
		Iterator<HashMap<String, ArrayList<String>>> ir =  class5.iterator();  // HashMap( key: 1조, 2조, value:명단(ArrayList))
		while (ir.hasNext()) {
			HashMap<String, ArrayList<String>> map2 = ir.next();
			Set<Entry<String, ArrayList<String>>> eSet = map2.entrySet();  // HashMap을 Key값과 ArrayList<String> 값으로 분리하여. Set 에 넣는다.
			Iterator<Entry<String, ArrayList<String>>> ir2 = eSet.iterator(); // 
			while (ir2.hasNext()) {
				Entry<String, ArrayList<String>> entry = ir2.next();
				String teamName = entry.getKey();
				ArrayList<String> tmList = entry.getValue();
				System.out.printf("%s\n", teamName);
				Collections.sort(tmList); // 각 팀원들 오름차순 정렬
				Iterator<String> ir3 = tmList.iterator();
				while (ir3.hasNext()) {
					String name = ir3.next();
					System.out.printf("  ㄴ %s\n", name);
				}
			}
		} // 
		}
		 

		/*
		{
			// ArrayList<HashMap<String, ArrayList<String>>> class5 -> HashMap<String, ArrayList<String>>
			//           HashMap<String, ArrayList<String>> -> Key: 1조, 2조, Value: ArrayList<String>
			//                           ArrayList<String> -> 팀원명단
			Iterator<HashMap<String, ArrayList<String>>> ir = class5.iterator();
			while (ir.hasNext()) {
				HashMap<String,ArrayList<String>> hashMap = ir.next();
				Set<Entry<String, ArrayList<String>>> es = hashMap.entrySet();
				Iterator<Entry<String, ArrayList<String>>> ir2 = es.iterator();
				while (ir2.hasNext()) {
					Entry<String, ArrayList<String>> entry = ir2.next();
					System.out.println(entry.getKey());
					ArrayList<String> tmList = entry.getValue();
					Iterator<String> ir3 = tmList.iterator();
					while (ir3.hasNext()) {
						String name = (String) ir3.next();
						System.out.println(name);
					}

				}

			}

		}
		 */




		/*
class5  (ArrayList)  ── "5강의장" 전체
│
├── [0] HashMap (조 1개만 담은 맵)
│        │
│        └── Entry
│              ├── Key   : "1조"
│              └── Value : ArrayList<String>
│                          ├── "양인석"
│                          ├── "안정빈"
│                          ├── "신창만"
│                          ├── "이지훈"
│                          └── "장미성"
│
└── [1] HashMap
         │
         └── Entry
               ├── Key   : "2조"
               └── Value : ArrayList<String>
                           ├── "류호훈"
                           ├── "오수빈"
                           ├── "이시연"
                           ├── "조지훈"
                           └── "문규리"


		 */




		/*
		while (ir.hasNext()) {
			System.out.printf("%d조\n", n++);
			ArrayList<String> tmList = (ArrayList<String>) ir.next();
			Collections.sort(tmList); // 각 팀원들 오름차순 정렬
			Iterator<String> ir2 = tmList.iterator();
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf("  ㄴ %s\n", name);
			} // while ir2

		} // while ir
		 */


	} 
}

