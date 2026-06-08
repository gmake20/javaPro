package days16;

public class Ex01_02 {

	public static void main(String[] args) {
		String url = "https://www.naver.com";
		
		String prefix = "https://";
		System.out.println(url.startsWith(prefix));
		
		String suffix = ".com";
		System.out.println(url.endsWith(suffix));
		
		

	}

}
