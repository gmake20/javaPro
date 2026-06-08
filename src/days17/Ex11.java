package days17;

import java.util.HashSet;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 3:43:32
 * @subject C -> L : ArrayList,Vector, LinkedList 
 * @content C-> S : HashSet컬렉션 클래스
 *    로또게임
 *    1) int [] lotto 로또 1게임
 *    2) int [][] lotts 로또 여러게임
 *    HashSet사용              
 */

public class Ex11 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); //16. 0.75
		hs.add(9);
		hs.add(1);
		hs.add(15);
		
		System.out.println(hs); // 중복 허용 X
		
		hs.add(null);
 
		System.out.println(hs); // 중복 허용 X
		
		//hs.remove(hs)
	}

}
