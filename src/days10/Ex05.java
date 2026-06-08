package days10;

import java.util.Arrays;

/**
 * @author scm
 * @date 2026. 5. 22. 오전 11:11:34
 * @subject 검색(Search)
 * @content
 * 			1) 순차검색
 * 			2) 이진검색
 */
public class Ex05 {

	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		// Arrays.binarySearch(m, 9);
		System.out.println(m.length);
		int n=300;
		int index = binarySearch(m,n);
		System.out.println(index);
		// System.out.println(Arrays.binarySearch(m, 11)); // 왜 -4가 나오지? => 11이 삽입될 위치  0 , 4, 5 , [11]
		
		System.out.println(Arrays.toString(m));
	}

	private static int binarySearch(int[] m, int n) {
		// 1. bottom,top
		// 2. middle
		//    m[middle] == n
		// 3. m[middle] > n 일경우 middle-1 새로운 top
		// 4. m[middle] < n 일경우 middle+1 새로운 bottom
		int bottom = 0;
		int top = m.length-1;
		int middle = 0;
		int count = 0;
		while(bottom <= top) {
			System.out.println(++count);
			middle = (top+bottom)/2;
			if(m[middle]==n) return middle;
			else if(m[middle]>n) {
				top = middle -1 ;
			}
			else {
				bottom = middle + 1;
			}
			
		}
		System.out.println("Not Found:" + count);
		return -1;
	}

}
