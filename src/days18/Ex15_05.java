package days18;

import java.util.ArrayList;
import java.util.HashSet;

import days12.Person;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 5:21:11
 * @subject [ 와일드카드(?) 파라미터]  
 * @content Collection<? extends Student> c
 *              
 *              <?> == <? extends Object> 모든 타입을 제한없이 사용
 *              <? extends T> T타입의 자식타입만 제한
 *              <? super T> T타입의 부모타입만 제한
 */
public class Ex15_05 {

	public static void main(String[] args) {
		// FruitBox<Toy> fBox = new FruitBox<>();
		FruitBox<Apple> fBox = new FruitBox<>();
		
		Box05 test;
		
		
		
		HashSet<Person> hs = new HashSet<Person>();
		HashSet<Student> hs2 = new HashSet<>();
		// ArrayList<Student> list = new ArrayList<>(hs);
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		

	}

}

class Toy{    public String toString() {      return "Toy";   }  }

class Fruit{   public String toString() { return "Fruit";   }}
class Apple extends Fruit{   public String toString() {return "Apple";   }}
class Grape extends Fruit{   public String toString() {return "Grape";   }}

class Box05<T>{
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
}

// 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit> extends Box05<T> {
	
}