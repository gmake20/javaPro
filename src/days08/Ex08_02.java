package days08;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rrn = "830412-2700001";
		char[] arr = String.join("", rrn.split("-")).toCharArray();
		
		boolean gender = getRRNGender(rrn);
		System.out.println(gender?"남자":"여자");
	}

	private static boolean getRRNGender(String rrn) {
		System.out.println(rrn.charAt(7)%100000);
		return rrn.charAt(7)%2 == 0?false:true;
	}

}
