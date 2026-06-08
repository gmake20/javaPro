package days12;

public class Person {
	// 필드 (따로 설정을 안해도, 기본값이 들어가있음)
	// 은닉화, 캡슐화
	private String name = null;
	private int age = 0;
	private boolean gender;
	
	// 생성자
	public Person() {
		
	}

	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		setGender(gender);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public void dispPerson() {
		System.out.printf("> 이름 : %s , 나이 : %d 살, 성별:%s\n",name,age,isGender()?"남자":"여자");
	}
	
	
	// getter / setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) {
		if(age>=0 && age<=120) {
			this.age = age;
		}
		else {
			// 강제로 실행에러 발생
			throw new RuntimeException("[오류] 나이는 0~120살 사이만 가능합니다.");
		}
		
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
