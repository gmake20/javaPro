package days09;

public class Ex04 {

	public static void main(String[] args) {
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		for (int i = 0,j=2; i <= 12; i++,j++) {
			if(i==6) {
				j--;
				continue;
			}
			System.out.printf("sum +=(rrn.charAt(%d)-'0')*%d;\n"
					, i , j);
			if(j>=9) j=1;
		}

	}

}
