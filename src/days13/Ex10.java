package days13;

import java.util.Arrays;

/*
 * //      10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
      String n = "keNik";    //  [][][][][]
      String m= "kKnie";     //  [][][][][]

 */
public class Ex10 {

	public static void stringToArray(String str, int[] arr) {
		char x;
		int a;
		for(int i=0;i<str.length();i++) {
			x = str.charAt(i);
			a = 'Z'-Character.toUpperCase(x);
			arr[a]++;
		}		
	}

	public static boolean isEqualArray(int[] arrA, int[] arrB) {
		for(int i=0;i<arrA.length;i++) {
			if(arrA[i] != arrB[i]) return false;
		}
		return true;
	}

	public static boolean compareString(String n,String m) {
		int[] arrn = new int[26];
		int[] arrm = new int[26];
		stringToArray(n,arrn);
		stringToArray(m,arrm);

		if(isEqualArray(arrn,arrm)) {
			//System.out.println("두 문자열은 같은 문자열입니다.");
			return true;
		}
		else {
			//System.out.println("두 문자열은 같은 문자열이 아닙니다.");
			return false;
		}	
	}
	
	
	public static boolean compareString2(String n,String m) {

		char [] nArr = n.toUpperCase().toCharArray();       
		Arrays.sort(nArr);
		char [] mArr = m.toUpperCase().toCharArray();
		Arrays.sort(mArr);

		System.out.println( Arrays.toString(nArr));
		System.out.println( Arrays.toString(mArr));

		// char [] -> String 변환
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);

		//System.out.println(  n.equals(m) );
		return n.equals(m);
	}

	public static void main(String[] args) {
		String n = "keNik";    //  [][][][][]		
		String m= "kKnie";     //  [][][][][]

		boolean result;
		result = compareString(n,m);
		System.out.println(result);
		result = compareString2(n,m);
		System.out.println(result);

	}
}
