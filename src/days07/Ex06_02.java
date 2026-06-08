package days07;

public class Ex06_02 {

	public static void main(String[] args) {
		String year = "1005";
		if(year.matches("^[1-9][0-9]*$")) {
			System.out.println("유효한값 O");
		} else {
			System.out.println("유효한값 X");
		}
		
		String one= "X";
		if(one.matches("[A-Z]")) {
			System.out.println("대문자 O");
		} else {
			System.out.println("대문자 X");
		}
		
		one= "XY";
		if(one.matches("[A-Z]+")) {
			System.out.println("대문자 O");
		} else {
			System.out.println("대문자 X");
		}
		
		
		one = "12345";
		if(one.matches("[0-9]+")) {
			System.out.println("숫자 O");
		} else {
			System.out.println("숫자 X");
		}
	}

}
