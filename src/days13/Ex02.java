package days13;

public class Ex02 {

	public static void main(String[] args) {
		// The field Save.rate is not visible
		// Save.rate = 0.04;
		// Save.setRate(0.04);
		System.out.println(Save.getRate());

		Save s1 = new Save("양인석", 10000, 0.04);
		Save s2 = new Save("안정빈", 1500000, 0.04);
		Save s3 = new Save("신창만", 56000, 0.04); 
		s1.setRate(0.77);

		System.out.println(s1.getRate());
		System.out.println(s2.getRate());
		System.out.println(s3.getRate());

		// 인스턴스 변수 name, money 는 반드시 객체를 생성해야지 사용할 있다
		//	      Save s1 = null;
		// 객체명.필드명  , 객체명.메서드명()
		//	      s1.setName("홍길동");

		// 클래스명.필드명
		// 클래스명.메서드명()



	} // main

}

// 저축 클래스
class Save{

	// 
	private String name; // 예금주
	private int money;   // 예금액
	// 클래스 변수, static 변수, 정적 변수, 공유변수
	private static double rate = 0.01;    // 이자율

	static {
		rate = 0.04;
	}


	public Save() {}

	public Save(String name, int money, double rate) {
		//   super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}

}
