package days14;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 29. 오전 7:32:08
 * @subject 신창만(결석)
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		String n = "keNik";     
		String m= "kKnie";     //  [][][][][]
		
		// 1. 대소구분X
		n = n.toUpperCase();  
		m = m.toUpperCase();  
		
		// 2. 순서 - 정렬
		char [] nArr = n.toCharArray();
		char [] mArr = m.toCharArray();		
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		
//		System.out.println( Arrays.toString(nArr) );
//		System.out.println( Arrays.toString(mArr) );
		
		// 3. 문자열 변환 char[] -> String
		n = new String( nArr );
		m = new String( mArr );
		
		// 4. 비교
		if ( n.equals(m) ) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	} //main

} // class


/* [질문]
저희가 클래스 내에서 메소드를 작성할때, 
1.객체 상태(this)를 사용하면 non-static, 
2.객체 상태를 쓰지 않으면 static 사용 고려 
이런 방식으로 static(정적) 을 붙일지 말지 결정할 수 있는 걸까요? 
 메소드를 작성할 때 습관적으로 static을 붙이게 되더라고요.
 [답변]
 정적(static) 메소드  
*/






