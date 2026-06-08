package days13;

// 1. x,y 두 좌표를 다루는 Point 클래스
//    Point클래스를 상속받아서 추가적으로  z 좌표를 다루는 클래스 선언
public class Point3D extends Point{

	// 필드  x, y
	private int z;

	// 생성자
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출됨.");
	}

	public Point3D(int v) {
		super(v,v);
		// The field Point.x is not visible
		// this.x = v;      this.y = v;
		//      this.setX(v);
		//      this.setY(v);
		this.z = v;
		System.out.println("> Point3D 생성자 1 호출됨.");
	}

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("> Point3D 생성자 3 호출됨.");
	}

	// getter, setter - getX(), setX(), getY(), setY()
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 메소드 - plusPoint(), dispPoint()
	public void dispPoint3D() {
		//      System.out.printf("> x=%d, y=%d, z=%d\n"
		//            , this.x, this.y , this.z);
		super.dispPoint();
		System.out.printf("> z=%d\n",this.z);
	}

	public Point3D plusPoint3D(Point3D p) {
		this.setX(this.getX() + p.getX());
		this.setY(this.getY() + p.getY());
		this.z += p.z;
		return this;
	} 
} // class









