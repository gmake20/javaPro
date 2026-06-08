package days18;

import java.util.LinkedHashSet;

/**
 * @author scm
 * @date 2026. 6. 5. 오전 9:14:33
 * @subject LinkedHashSet Class
 * @content HashSet<E> + implements SequencedSet
 *          중복허용 X        순서유지 O
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		s.add(20);
		s.add(new Integer(10));
		s.add(20);
		s.add(15);
		//[20, 10, 15] 중복허용X, 순서유지O
		System.out.println(s);
		
	}

}
