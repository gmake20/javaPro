package days17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author scm
 * @date 2026. 6. 4. 오전 10:45:52
 * @subject List 구현한 컬렉션 클래스 : ArrayList 
 * @content  ㄴ 특징 : 순서유지O , 중복허용O
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// <E> 제네릭 클래스 : Element(==요소)
		ArrayList groupList = new ArrayList(300);
		System.out.println(groupList.isEmpty()); // true
		System.out.println(groupList.size());
		groupList.add("양인석");
		groupList.add("안정빈");
		groupList.add("신창만");
		System.out.println(groupList.size());
		System.out.println(groupList.isEmpty()); // false
		groupList.add("이지훈");
		groupList.add("장미성");
//		groupList.add("류호훈");
//		groupList.add("오수빈");
//		groupList.add("이시연");
//		groupList.add("조지훈");
//		groupList.add("문규리");
		System.out.println(groupList.size());
		groupList.trimToSize();

		// 2번째 사람의 이름을 출력
		String name = (String) groupList.get(1);
		System.out.println("> 두번째 사람의 이름: " + name);
		
		System.out.println(groupList.contains("안정빈")); // true/false
		int index = groupList.indexOf("안정빈");
		System.out.println(groupList.get(index));
		groupList.remove(index);

		// 모든 팀원 출력
//		for(int i=0,size=groupList.size();i<size;i++) {
//			name = (String)groupList.get(i);
//			System.out.println(name);
//		}
		System.out.println(groupList); // [양인석, 신창만, 이지훈, 장미성]
	
		groupList.add(index,"문규리");
		System.out.println(groupList); //[양인석, 문규리, 신창만, 이지훈, 장미성]
		
		// 
		groupList.addFirst("이지훈");
		System.out.println(groupList); // [이지훈, 양인석, 문규리, 신창만, 이지훈, 장미성]

		groupList.addFirst("허준");
		// 
//		for(int i=0,size = groupList.size();i<size;i++) {
//			name = (String) groupList.get(i);
//			if(name.equals("이지훈")) {
//				groupList.remove(i);
//				size--;
//				i--;
//			}
//		}
		
		// 
//		for(int i=groupList.size()-1;i>=0;i--) {
//			name = (String) groupList.get(i);
//			if(name.equals("이지훈")) {
//				groupList.remove(i);
//			}
//		}		

		
// [3] 반복자(Iterator)
		/*
		Iterator ir = groupList.iterator();
		while (ir.hasNext()) {
			name = (String)ir.next();
			System.out.println("> " + name);
			if(name.equals("이지훈")) {
				ir.remove();
			}
		}
		*/

// [4] removeAll()
/*		
		ArrayList removeList = new ArrayList();
		removeList.add("이지훈");
		removeList.add("신창만");
//		List removeList = List.of("이지훈", "신창만");
		groupList.removeAll(removeList); // 인자를 Collection으로 받는다. -> 매개변수 다형성,인터페이스,업캐스팅 
 */
		
// [5] groupList.removeIf(Predicate p) 
//      ㄴ 조건에 만족하는 요소를 모두 제거 
//      ㄴ Predicate p 삭제할 조건
//        @FunctionalInterface 함수형 인터페이스  	
/*		
		groupList.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.equals("이지훈");
			}
		});
*/

/*		
		// 위의 함수를 익명(무명)함수로 바꾸면 아래와 같이 간단하게 구현가능.
		groupList.removeIf(n -> n.equals("이지훈"));
*/		
			
// =======================================================================		
// 람다 사용.		
//		groupList.removeIf(str -> str.equals("이지훈"));
		

// removeAll() 사용	
//		groupList.removeAll(Arrays.asList("이지훈"));
 
// while(), indexOf()사용		
//		while((index = groupList.indexOf("이지훈")) != -1) 
//			groupList.remove(index);
		// =======================================================================		

	
		
		
		
		// 이름순으로 오름차순 정렬
//		groupList.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1,String o2) {
//				return o1.compareTo(o2) * -1; // 0,양수,음수
//			}
//		}); 
	
//		groupList.sort(( o1, o2) ->{
//			String a= (String)o1;
//			String b= (String)o2;
//			return a.compareTo(b) * -1;
//		}); 
					
		groupList.sort((o1, o2) -> ((String)o1).compareTo((String)o2) * -1); 
		System.out.println(groupList);
		
		// groupList.clear();
		//groupList.sort((a,b) -> a.compareTo(b));
		
		// 맨뒤 2명의 이름을 출력
		int fromIndex = groupList.size()-2;
		int toIndex = groupList.size();
		List endList = groupList.subList(fromIndex, toIndex);
		System.out.println(endList);
		
		System.out.println(groupList);
		
	}

}


/*
ArrayList의 시간복잡도
-------------------------
조회	get(index)	O(1)
수정	set(index, value)	O(1)
맨 뒤 추가	add(value)	O(1) (평균)
맨 뒤 추가(배열 확장 발생)	add(value)	O(n)
중간 삽입	add(index, value)	O(n)
맨 앞 삽입	add(0, value)	O(n)
맨 뒤 삭제	remove(size-1)	O(1)
중간 삭제	remove(index)	O(n)
맨 앞 삭제	remove(0)	O(n)
값 검색	contains(value)	O(n)
인덱스 검색	indexOf(value)	O(n)
순회	for, Iterator	O(n)
*/