package days18;

import java.util.ArrayList;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 4:51:11
 * @subject [제한된 제네릭 클래스]
 * @content  ㄴ T라는 타입 매개변수에 지정할수있는 타입의 종류를 제한한 제네릭 클래스 
 */
public class Ex15_04 {
	/*
	public static void main(String[] args) {
		Box04<Fruit> fruitBox = new Box04<>();
		Box04<Apple> appleBox = new Box04<>();
		Box04<Grape> grapeBox = new Box04<>();
		Box04<Toy> toyBox = new Box04<>();

		FruitBox<Fruit> gFruitBox = new FruitBox<>();
		// Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
		// FruitBox<Toy> gToyBox = new FruitBox<>();

		EatBox<Bread> bBox = new EatBox<>();
	
	}
	*/
}


/*
// 
interface Eatable{}


class Toy{
	@Override
	public String toString() {
		return "Toy";
	}	
}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "Fruit";
	}	
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}	

}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}	
}

// <T> 모든 타입을 담을수있는 상자 클래스
class Box04<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {		this.list.add(item); 	}
	T get(int index) {		return this.list.get(index);	}
	int size() {		return this.list.size();	}
	@Override
	public String toString() {		return this.list.toString();	}
}

// 먹을수있는 타입(F,A,G)을 담을수있는 상자 클래스
// Eatable 만 담을수있음
class FruitBox<T extends Fruit> {
	// ... 
}

class Bread implements Eatable {
	
}

class EatBox<T extends Eatable> {
	
}

// Fruit , Eatable 둘다 상속받아야함
// T 는 Eatable 인터페이스를 구현한 Fruit클래스의 자식클래스만 타입으로 제한한다.
class EatFruitBox<T extends Fruit & Eatable> {
	
}

*/
