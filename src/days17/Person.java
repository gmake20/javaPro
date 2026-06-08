package days17;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
class Person implements Comparable<Person> {
	// 필드
	private String name;
	private int age;

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	// 생성자
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

//	public Person() { 
//	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	} 


}