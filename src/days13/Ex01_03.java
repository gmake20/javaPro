package days13;

public class Ex01_03 {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(10, 20);
		p1.dispPoint();
		p2.dispPoint();
		
		p1.plusPoint(p2).dispPoint();

	}

}

class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	// Default 생성자
	public Point() {
		System.out.println("> Point 디폴트 생성자 호출됨.");	
	}
	// 생성자2
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
		System.out.println("> Point 생성자 2 호출됨.");	
	}
	
	// getter , setter 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드
	public Point plusPoint(Point p) {
		this.x += p.x;
		this.y += p.y;
		return this;
	}
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
}