package days12;

public class Point {
	// 필드
	public int x;
	public int y;
	
	// 디폴트(Default) 생성자
	public Point() {
		x = y = 100;
		System.out.println("> Point 디폴트(Default) 생성자 호출됨...");
	}
	
	// 생성자 오버로딩
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("> Point 2 생성자 호출됨...");
	}
	
	public Point(int v) {
		this(v,v);
		// x = y = v;
		System.out.println("> Point 1 생성자 호출됨...");
	}

	// 메소드
	// 현재 위치를 출력하는 메소드
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}
	
	// 
	public void offsetPoint(int v) {
		this.x += v;
		this.y += v;
	}
	
	public void plusPoint(Point a, Point b) {
		x = a.x + b.x;
		y = a.y + b.y;
	}	
	
//	public void plusPoint(Point p) {
//		x += p.x;
//		y += p.y;
//	}	

	// 참조형 매개변수
	public Point plusPoint(Point p) {
		return new Point(x+p.x, y+p.y);
	}	
}
