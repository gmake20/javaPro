package days08;

public class Ex07_03 {

	public static void main(String[] args) {
		int sum = 0;
		boolean sw = false;
		// 1+2+3+4+5+6+7+8+9+10+=55
		for(int i=1;i<=10;i++) {
			if(sw) {
				System.out.printf("%d+",i);
				sum -= i;			
			}
			else {
				System.out.printf("%d-",i);
				sum += i;			
			}
			sw = !sw;
//			System.out.printf("%d+",i);
//			sum += (i*(i%2==0?-1:1));			
		}
		System.out.printf("=%d\n",sum);

	}

}
