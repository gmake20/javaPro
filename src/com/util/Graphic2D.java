package com.util;

public class Graphic2D {

	// 함수 오버로딩
	public static void drawLine() {
		System.out.println("==================");

	}

	public static void drawLine(int length) {
		System.out.println("-".repeat(length));

	}

	public static void drawLine(int length, char style) {
		System.out.println(("" + style).repeat(length));

	}

}
