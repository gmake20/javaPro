package days18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author scm
 * @date 2026. 6. 5. 오전 10:17:07
 * @subject 빙고게임 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		int [][]bingo = new int[5][5];

		// [1]
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<5;j++) {
		//				bingo[i][j] = i*5+j+1;
		//			}
		//		}
		//
		//		for (int i = 0; i < 25; i++) {
		//			int x = (int) (Math.random() * 25); // 0~24
		//			int y = (int) (Math.random() * 25);
		//			int tmp = bingo[x / 5][x % 5];
		//			bingo[x / 5][x % 5] = bingo[y / 5][y % 5];
		//			bingo[y / 5][y % 5] = tmp;
		//		}


		// [2]
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
//		for (int i = 1; i <= 25; i++) {
//			al.add(i);
//		} // for i
		IntStream.rangeClosed(1, 25).forEach(al::add);
		// Collections.shuffle(al);
		// System.out.println(al);
		Random rnd = new Random();
		for(int i=0,index=-1,n=-1;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				index = rnd.nextInt(al.size()); // 0 <=     < al.size()
				n = al.remove(index);
				bingo[i][j] = n;
			}
		}
		*/
		
		// [2] 다른 방법
		ArrayList<Integer> al = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 25).forEach(al::add);
		Collections.shuffle(al);
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j] = al.get(i*5+j);
			}
		}
		

		// 출력.
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			}
			System.out.println();
		}
	}

}
