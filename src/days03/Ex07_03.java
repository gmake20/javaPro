package days03;


public class Ex07_03 {

	public static void main(String[] args) {
		String s = "30";
		// String -> int 형 변환
		int v = Integer.parseInt(s);
		System.out.println( v );

		// String -> byte 형 변환
		byte b = Byte.parseByte(s);
		System.out.println( b );

		long l = Long.parseLong(s);
		System.out.println( l );

		// String -> double 형 변환
		double d = Double.parseDouble(s);
		System.out.println( d );
	}

}
