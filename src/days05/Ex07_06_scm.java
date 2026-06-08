package days05;

public class Ex07_06_scm {

	public static void main(String[] args) {
		// 1.배열 선언
		int [] lottoNumbers = new int[6];

		int index = 0;
		while(index < lottoNumbers.length) {
			while(true) {
				boolean f = false;
				int lottoNumber = (int)(Math.random() * 45) + 1;
				System.out.printf("> 중복체크전 로또 번호 %d %n", lottoNumber);
				for(int i=0;i<index;i++) {
					if(lottoNumber == lottoNumbers[i]) {
						f = true;
						System.out.printf("Duplicated Number : %d %n", lottoNumber);
						break;
					}
				}
				if(!f) {
					lottoNumbers[index++] = lottoNumber;
					break;
				}
			}
		}
		
		
		System.out.println("=".repeat(50));
		for(int i=0;i<lottoNumbers.length;i++) {
			System.out.println(lottoNumbers[i]);
		}
	}

}
