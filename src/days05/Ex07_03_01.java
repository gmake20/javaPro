package days05;

import java.util.HashSet;
import java.util.Set;

public class Ex07_03_01 {

	public static void main(String[] args) {
		Set<Integer> lottoNumbers = new HashSet<>();
		while(lottoNumbers.size() < 6) {
			lottoNumbers.add((int)(Math.random() * 45) + 1);
		}
		for(Integer num:lottoNumbers) {
			System.out.println(num);
		}
	} // main

} // class
