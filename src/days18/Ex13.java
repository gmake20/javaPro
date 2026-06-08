package days18;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 3:12:25
 * @subject 배열 기능 구현된 클래스 : Arrays 클래스
 * @content 컬렉션 클래스 기능 구현된 클래스 : Collections 클래스
 */
public class Ex13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);

		// 오른쪽으로 2칸씩 회전(이동)
//		Collections.rotate(list, 2);
//		System.out.println(list);
		
		// 0번째 , 2번째 값을 서로 바꿈.
//		Collections.swap(list, 0, 2);
//		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 배열 뒤집기 
		Collections.sort(list);
		Collections.reverse(list);
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// 내림차순 정렬
		Collections.sort(list, (o1,o2) -> o2-o1);
		System.out.println(list);
		
		// 모든 요소의 값을 0으로 초기화
		Collections.fill(list, 0);
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 100);
		System.out.println(index);
		
		Collections.replaceAll(list, 0, 100);
		System.out.println(list);
		
	}

}
