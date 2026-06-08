package days15;

public interface Engine {
//	private String model;    // 모델명
//	private int displacment; // 배기량
//	private int horsepower;  // 마력
//	private boolean running; // 시동상태
	
	void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();
	
	// 2036
	default void turbo() {
		System.out.println("기본 터보 기능 구현....");
	}
	
	// 새로운 기능 추가
	static void test() {
		System.out.println("10년 지난후 새로운 기능의 메소드 추가");
	}
}
