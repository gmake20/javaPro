package days05;



public class Ex07_02 {

	public static void main(String[] args) {
		int lottoNumber;
		for(int i=1;i<=6;i++) {
			lottoNumber = (int)(Math.random() * 45) + 1;
			System.out.println(lottoNumber);
			
		}

	}

}
