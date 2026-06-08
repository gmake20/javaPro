package days15;

import lombok.Getter;

/**
 * @author scm
 * @date 2026. 6. 1. 오후 4:14:54
 * @subject Object Class
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		Data v1 = new Data(10);
		// 객체 자신의 고유한 해쉬코드값.
		int hashCode = v1.hashCode();
		System.out.println(hashCode);

		Data v2 = new Data(10);
		hashCode = v2.hashCode();
		System.out.println(hashCode);

		Data v3 = v2;
		hashCode = v3.hashCode();
		System.out.println(hashCode);
		
		// v1객체의 클래스정보를 반환
		Class classInfo = v1.getClass();
		// days15.Data 
		// 패키지명.클래스명 : fullName
		System.out.println(classInfo.getName());

		// days15.Data@54bedef2
		// fullName + @ + 해시코드의16진수값
		System.out.println(v1.toString());
		
		*/
		String str = "abc";
		Data v1 = new Data(10);
		Data v2 = new Data(10);
		System.out.println(v1.equals(v2));
		
		System.out.println(v1.toString());
		
		// Object.clone() 복제 메서드 
		
	}

}


class Data extends Object {
	int value;
	
//	@Override
//	public String toString() {
//		return String.format("[value:%d]", this.value);
//	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data d = (Data)obj;
			return this.value == d.value;
		}
		return super.equals(obj);
	}

//	public boolean equals(Object obj) {
//		if(obj instanceof Data d) {
//			return this.value == d.value;
//		}
//		return super.equals(obj);
//	}	
	
	@Override
	public String toString() {
		return "Data [value=" + value + "]";
	}

	public Data(int value) { 
		this.value = value; 
		
	}
}