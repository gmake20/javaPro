package days17;

import java.util.Stack;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 5:18:03
 * @subject C -> L : ArrayList, Vector, LinkedList
 * @content C -> S : HashSet, LinkedHashSet
 * 				[ Stack 컬렉션 클래스 ] LIFO
 * 			Stack  ->  Vector  ->  List
 *                  (멀티스레드Safe)
 */
public class Ex12 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("양인석");
		s.push("안정빈");
		s.push("신창만");
		s.push("이지훈");
		System.out.println(s.size());
		// System.out.println(s.pop());
		System.out.println(s.peek());

		System.out.println(s.search("홍길동"));
		System.out.println(s.search("안정빈"));
		
		System.out.println(s.size());
	
		// push(), pop()/peek(), isEmpty(), search()
	}

}
