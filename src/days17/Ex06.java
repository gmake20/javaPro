package days17;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Person("이지훈",20));
		list.add(new Person("류호훈",42));
		list.add(new Person("장미성",23));

		System.out.println(list);

		// Comparator
		// Comparable
		
		// 나이순으로 오름차순 정렬
		// Comparator 익명 클래스 생성하여 정렬사용.
		/*
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		*/
		
		list.sort(null);
		System.out.println(list);
		
		list.sort((o1,o2) -> ((Person)o1).getAge() - ((Person)o2).getAge());

		
		
		//
		System.out.println(list);
	}

}
