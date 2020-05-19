package logic.home.model;

import java.util.Scanner;

public class StaticMethodSample {

	Scanner sc = new Scanner(System.in);

	public static void testMathRandom() {

		int num = (int) (Math.random() * 45) + 1;
		System.out.println(num);

	}

	public static void testMathAbs() {

		double num = -12.77;
		System.out.println(Math.abs(num));

	}

	public static void testMathMax() {

		System.out.println(Math.max(120, 54));

	}

}
