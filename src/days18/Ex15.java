package days18;

import java.util.ArrayList;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 4:09:36
 * @subject 
 * @content
 */
public class Ex15 {

	public static void main(String[] args) {
		
//		Box box1 = new Box();
//		box1.setItem(100);
//		System.out.println(box1.getItem());
		
//		BoxDouble box1 = new BoxDouble();
//		box1.setItem(100.00);
//		System.out.println(box1.getItem());

		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		System.out.println(box1.getItem());
		
		Box<Student> box2 = new Box<>();
		box2.setItem(new Student());
		Student s = box2.getItem();
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		System.out.println(list);
	}
	
	

}

// Box 원시타입
// Box<T> 제네릭 클래스, T의 Box ,  T Box 라고 읽으면 된다.
class Box<T> {
	private T item;

	public T getItem() {
		return item;
	}
	
	
	public void setItem(T item) {
		this.item = item;
	}
}


/*
class Box {
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}

class BoxDouble {
	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
}

class BoxChar {
	private char item;

	public char getItem() {
		return item;
	}

	public void setItem(char item) {
		this.item = item;
	}
}
*/