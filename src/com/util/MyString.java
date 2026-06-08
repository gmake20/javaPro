package com.util;

import java.util.Random;

public class MyString {

	private static final Random rnd = new Random();

	// 자주 사용하는 성씨
	private static final String[] LAST_NAMES = {
			"김", "이", "박", "최", "정",
			"강", "조", "윤", "장", "임",
			"한", "오", "서", "신", "권"
	};

	// 이름 첫 글자 후보
	private static final String[] FIRST_NAME_1 = {
			"민", "서", "지", "도", "하",
			"유", "시", "준", "현", "태",
			"은", "수", "재", "승", "예"
	};

	// 이름 두 번째 글자 후보
	private static final String[] FIRST_NAME_2 = {
			"준", "우", "윤", "현", "민",
			"아", "진", "훈", "연", "호",
			"서", "린", "영", "희", "경"
	};



	public static String generateRandomNameScm() {

		String lastName =
				LAST_NAMES[rnd.nextInt(LAST_NAMES.length)];

		String first1 =
				FIRST_NAME_1[rnd.nextInt(FIRST_NAME_1.length)];

		String first2 =
				FIRST_NAME_2[rnd.nextInt(FIRST_NAME_2.length)];

		return lastName + first1 + first2;
	}

}
