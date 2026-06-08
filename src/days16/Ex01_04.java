package days16;

public class Ex01_04 {

	public static void main(String[] args) {
		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
	      , solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
		 */

		String str = solution(15);			
		System.out.println(str);		
	}

	private static String solution_scm(int cnt) {
		StringBuilder sb = new StringBuilder();

		sb.repeat("수박", cnt/2);
		if(cnt%2 == 1) sb.append("수");

		/*
		String[] str = {"수","박"};
		for(int i=0;i<cnt;i++) {
			sb.append(str[i%2]);
		}
		*/
		return sb.toString();
	}
	
	
	private static String solution(int cnt) {
		String[] str = {"수","박"};

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<cnt;i++) {
			sb.append(str[i%2]);
		}
		return sb.toString();
	}
}
