package days15;

public class Ex10_02_01 {

	public static void main(String[] args) {
		Point2 p1 = new Point2(1, 2);
		System.out.println(p1.hashCode());
		p1.x2 = 1234;
		System.out.println("p1 hash:" + p1.x2.hashCode());
		
		
		try {
			Point2 p1Clone = (Point2) p1.clone();
			System.out.println(p1Clone);
			System.out.println(p1Clone.hashCode());
			System.out.println("clone hash:" + p1Clone.x2.hashCode());
			
			p1Clone.x2 = 50;
			System.out.println(p1.x2);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("   END    ");
		
	}

}

class Point2 extends Object implements Cloneable {
	// 
	int x;
	int y;
	public Integer x2;

	public Point2() {}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
		x2 = x;
	}

	@Override
	public String toString() {
		return String.format("(x=%d,y=%d)", this.x, this.y);
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Point2) {
			Point2 p = (Point2)obj;
			return this.x == p.x && this.y == p.y;
		} // if

		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		Object obj = null;
		obj = super.clone();
		return obj;
		
	}	
}