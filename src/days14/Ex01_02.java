package days14;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2026. 5. 29. 오전 9:37:27
 * @subject 
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 시간 복잡도
		String n = "publicStaticVoidMainStringArgs";
		
		// countArr[0]='A'
		// countArr[25]='Z'
		int [] countArr = new int[26];
		
		char [] nArr = n.toUpperCase().toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			int index = nArr[i]-65;
			countArr[index]++;
		}
		
		System.out.println( Arrays.toString(countArr));
		
		
		
		

	} // main

} // class





