package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days16\\Ex01.java";
		// 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		// :
		// Z(3)  : ###     	

		// [0] == 'A'
		// [1] == 'B'
		// ...
		// [25] == 'Z'
		int[] counts = new int[26];

		try (FileReader reader = new FileReader(fileName);

				) {
			int code = -1;
			char one;
			while((code = reader.read()) != -1) {
				//System.out.println(Integer.toBinaryString(code));
				one = (char)Character.toUpperCase(code);
				if(Character.isUpperCase(one)) {
					//System.out.println(one);
					counts[one-'A']++;
				}

			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		// 막대그래프 출력
		for(int i=0,count=0;i<counts.length;i++) {
			count = counts[i];
			System.out.printf("%c(%d) : %s", (char)('A'+i), count,"#".repeat(count));
			System.out.println();
		}
		//System.out.println(Arrays.toString(counts));

//		int[] arr = new int[26];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println((char)('A'+i));
//
//		}
	}

}
