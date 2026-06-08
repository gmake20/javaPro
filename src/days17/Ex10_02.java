package days17;

import java.util.LinkedList;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 3:34:55
 * @subject 
 * @content ArrayList - 읽기가 빠르다.
 *                    순차적으로 추가/삭제가 빠르다.
 *           LinkeedList - 중간 추가(삽입)삭제가 빠르다.
 				C -> L 순서유지O, w중복 허용.            

 */
public class Ex10_02 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.size());
		list.add("양인석");
		list.add("양인석");
		list.add("신창만");
		list.add("이지훈");
		
		System.out.println(list);
		
		list.add(1,"장미성");
		System.out.println(list);

		
		int index = list.indexOf("이지훈");
		if (index == -1) {
			System.out.println("이지훈씨는 없습니다.");
		} else {
			list.add(index,"조지훈");
			System.out.println(list);
		}
		
		list.remove(1);
		list.remove("조지훈");
		System.out.println(list);
		
	}

}
