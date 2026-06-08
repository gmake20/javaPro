package days15;

public class Ex10_02 {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		System.out.println(p1.hashCode());
		try {
			Point p1Clone = (Point) p1.clone();
			System.out.println(p1Clone);
			System.out.println(p1Clone.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("   END    ");
		
	}

}

class Point extends Object implements Cloneable {
	// 
	int x;
	int y;

	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(x=%d,y=%d)", this.x, this.y);
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
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