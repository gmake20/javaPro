package days14;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 3:39:24
 * @subject 
 * @content 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		 

	} // main

} // class

abstract class Unit{
	int x, y; // 현재 위치 
	abstract void move(int x, int y);
	abstract void stop();
}

//해병대원
class Marine extends Unit{	
	void stimPack() { // 에너지, 체력, 공격속도, 능력
		
	}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
}

//탱크
class Tank extends Unit{	 
	// 공격 모드를 변환하는 메서드
	void changeMode() {
		// 
	}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	} 
}

//수송선
class DropShip extends Unit{		
	// 짐을 싣는 작업
	void load() {}
	// 짐을 내리는 작업
	void unload() {}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}	
}
