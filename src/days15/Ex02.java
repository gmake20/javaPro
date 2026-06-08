package days15;

import java.io.Serializable;

/**
 * @author scm
 * @date 2026. 6. 1. 오전 9:17:41
 * @subject 인터페이스, 클래스 사용 예제
 * @content
 */
public class Ex02 implements Serializable {

	public static void main(String[] args) {
		// ArrayList 

	}

}

// (군사) 사병, 탱크,... 단일체
abstract class Unit {
	// 필드 : 유닛의 위치
	// Point p; // has a 관계
	int x;
	int y;
	int currentHP; // 현재 유닛의 체력
}

class AirUnit extends Unit {
	
}

class GroundUnit extends Unit {
	
} 

interface Movable {
	void move(int x,int y);
}

interface Attackable {
	void attack(Unit unit); // 매개변수 다형성
}

interface Fightable extends Movable, Attackable {
	

}

class Fighter implements Fightable {

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		
	}
	
}

class Tank extends GroundUnit implements Fightable,Repairable {
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		
	}
}

class Marine extends GroundUnit implements Fightable {
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		
	}
}

// 수송선
class Dropship extends AirUnit implements Fightable,Repairable {
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		
	}
}


interface Repairable {
	// 상수, 추상메서드 선언 X
}

class SCV extends GroundUnit implements Fightable,Repairable {
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		
	}

	void repair(Repairable target) {
		// Repairable 타입 → 수리 가능한 유닛만 인자로 넘길 수 있음 (Marine 등은 컴파일 오류)
		if(target instanceof Tank) {
			Unit unit = (Tank) target;	// 다운 캐스팅
		} else if(target instanceof Dropship) {
			Unit unit = (Dropship) target;
		} else if(target instanceof SCV) {
			Unit unit = (SCV) target;
		} else {
			System.out.println("> 수리 불가능!!!");
		}

	}
		
		
	// 수리 메소드 : Repairable 구현 유닛만 수리 가능 (탱크, 수송선, SCV)
	// AI가 제안한 방법
	/*
	void repair(Fightable unit) {
		if (unit instanceof Repairable) {
			System.out.println("> 수리 완료!!!");
		} else {
			System.out.println("> 수리 불가능!!!");
		}
	}
	*/
	
	// 수리 두번째 방법
	/*
	void repair(Fightable unit) {
		if (unit instanceof Tank || unit instanceof Dropship || unit instanceof SCV) {
			System.out.println("> 수리 완료!!!");
		} else {
			System.out.println("> 수리 불가능!!!");
		}
	}	
	*/

	// 수리 첫번째 방법 : 모든 함수를 구현. 단점은 새로운 유닛이 추가될때마다 함수를 추가해야함.
	/*
	void repair(Tank tank) { }
	void repair(Dropship dropship) { }
	void repair(Marine marine) { }
	*/
	
}
















