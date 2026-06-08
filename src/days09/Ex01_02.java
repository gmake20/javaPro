package days09;

public class Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "003";
		
		
//		for(int i=0;i<305;i++) {
//			str = ""+i;
			// 0~300 사이의 정수 체크
			String regex = "^(300|[1-9]?\\d|[12]\\d{2})$";
			// 300 : 300
			// [1-9]?\\d : 0~99
			// [12]\\d{2} : 첫글자가 1또는2이고, 뒤의 글자가 숫자2자리
			if(str.matches(regex)) {
				System.out.println(str + " 0~300 사이의 정수 O");
			} else {
				System.out.println(str + " 0~300 사이의 정수 X");
			}
			
//		}
	}

}
