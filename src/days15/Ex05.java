package days15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		System.out.println(Arrays.toString(s));

		// 정렬 비교 객체를 만들어서 사용.
		//		Arrays.sort(s, new StringComparator());
		//		System.out.println(Arrays.toString(s));

		//		Arrays.sort(s, new Comparator<String>() {
		//			@Override
		//			public int compare(String o1, String o2) {
		//				// TODO Auto-generated method stub
		//				return o1.compareTo(o2)*-1;
		//			}
		//		});
		//		System.out.println(Arrays.toString(s));

		// 정렬 (default:오름차순) 
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

		/*
		함수형 인터페이스 : 함수형 인터페이스는 추상 메서드가 딱 1개인 인터페이스
		Comparator는 추상 메서드가 딱 1개인가??
		Comparator는 추상메서드가 
		int compare(T o1, T o2); 
		이거 1개뿐임
		boolean equals(Object obj); 
		해당 메서드는 Object의 메서드라 포함안됨.
		@FunctionalInterface
		 */


		/*
		Arrays.sort(s, (o1,o2) -> {
			return o1.compareTo(o2)*-1;
		});
		*/
		// 위의 함수를 아래와 같이 간략하게 사용가능.
		Arrays.sort(s, (o1,o2) -> o1.compareTo(o2)*-1 );
		System.out.println(Arrays.toString(s));

		// 내림차순 정렬
		// 배열 사용하기 쉽도록 기능이 구현된 클래스 : Arrays
		// 컬렉션 사용하기 쉽도록 기능이 구현된 클래스 : Collections
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s, Comparator.reverseOrder());
		System.out.println(Arrays.toString(s));

		// ===================================================

		Integer[] s2 = { 1,3,9,7,11,2};
		Arrays.sort(s2);
		System.out.println(Arrays.toString(s2));

		// 내림차순 정렬
		Arrays.sort(s2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(s2));

	}

}

//문자열을 비교하는 비교자(comparator): 클래스 선언
class StringComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		// s2.compareTo(s1) -> s1 > s2 : 양수, s1 < s2 : 음수, s1 == s2 : 0
		// return s2.compareTo(s1);
		return s1.compareTo(s2) * -1;
	}

}


//class StringComparator implements Comparator<String> {
//	@Override
//	public int compare(String o1, String o2) {
//		return o2.compareTo(o1);
//	}
//}
