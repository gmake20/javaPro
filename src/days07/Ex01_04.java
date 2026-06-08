package days07;

/**
 * @author scm
 * @date 2026. 5. 19. 오전 10:03:21
 * @subject 
 * @content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		OUT:for(int i=1;i<=9;i++) {
			for(int d=2;i<=9;d++) {
				if(d==5) break OUT;
				System.out.printf("%d*%d=%2d\t",d,i,d*i);
			}
			System.out.println();
		}

	}

}
