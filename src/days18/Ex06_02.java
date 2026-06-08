package days18;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex06_02 {

	public static void main(String[] args) {


		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };

		TreeSet<Integer> ts = new TreeSet<Integer>();
//		for (int i = 0; i < score.length; i++) {
//			ts.add(score[i]);
//		} // for i
		Arrays.stream(score).forEach(ts::add);

		// 50 <= score < 80
		System.out.println(ts.subSet(50, 80));

		// 80점 이상
		System.out.println(ts.tailSet(80));
		
		// 80점 미만
		System.out.println(ts.headSet(80));
		
		// TreeSet : 중복허용X, 정렬, 검색, 부분감샏등 성믕이 뛰어남.
		
		/*

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");      ts.add("alien");   ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");
		ts.add("dance");   ts.add("dzzz");      ts.add("dzzzz");
		ts.add("elephant");   ts.add("elevator");   ts.add("fan");
		ts.add("flower");

		System.out.println(ts);

		// 정렬된Set
		SortedSet<String> ss = ts.subSet("a", "d"); // "a" ~ "d" (d는 포함안됨)
		System.out.println(ss); // [abc, alien, bat, car]
		*/
	}

}
