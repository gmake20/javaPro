package days05;

/**
 * @author kenik
 * @date 2026. 5. 15. 오후 3:09:35
 * @subject [] 인덱스(index) 연산자 -> 배열(Array)
 * @content 
 *           1. 배열 정의?
 *             ㄴ 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.
 *           2. 배열 선언 형식
 *             ㄴ 자료형 [] 배열명 = new 자료형[배열크기]; 
 *           3. 배열의 요소:    배열명[index]
 *             ㄴ 0번째 요소:   names[0]    
 *             ㄴ 1번째 요소:   names[1]
 *                 :
 *             ㄴ 9번째 요소:   names[9]
 *                 
 * 
 */
public class Ex07_04 {
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0]= "양인석";
		names[1]= "안정빈";
		names[2]= "신창만";
		names[3]= "이지훈";
		names[4]= "장미성";
		names[5]= "류호훈";
		names[6]= "오수빈";
		names[7]= "이시연";
		names[8]= "조지훈";
		names[9] = "문규리";		
		
		// for(String name:names) System.out.println(name);
		for(int i=0;i<names.length;i++) 
			System.out.println(names[i]);
		
		/*
		String name1 = "양인석";
		String name2 = "안정빈";
		String name3 = "신창만";
		String name4 = "이지훈";
		String name5 = "장미성";
		String name6 = "류호훈";
		String name7 = "오수빈";
		String name8 = "이시연";
		String name9 = "조지훈";
		String name10 = "문규리";

		System.out.println(name1 );
		System.out.println(name2 );
		System.out.println(name3 );
		System.out.println(name4 );
		System.out.println(name5 );
		System.out.println(name6 );
		System.out.println(name7 );
		System.out.println(name8 );
		System.out.println(name9 );
		System.out.println(name10);
		*/
		
		/*
		String[] names = {
                "양인석",
                "안정빈",
                "신창만",
                "이지훈",
                "장미성",
                "류호훈",
                "오수빈",
                "이시연",
                "조지훈",
                "문규리" };
		for(String str:names) {
			System.out.println(str);
		}
		*/
		
	}
}
/*
 * Alt + Shift + A : 블럭모드
*/