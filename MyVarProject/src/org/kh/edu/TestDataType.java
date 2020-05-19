package org.kh.edu;

public class TestDataType {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1.1 + 1.1);
		System.out.println('1' + '1');
		// 아스키 코드표(구글링)에 1은 49이다.
		// 그리하여 49 + 49 로 98이 출력되어 나온다.
		System.out.println("1" + "1");
		// 출력된 11은 숫자11이 아니고 문자열11이다.
		System.out.println("Hello" + 'q');
		System.out.println("Hello" + 3.14);
		System.out.println(10 + 20 + "Hello");
		System.out.println(10 + "Hello" + 20);
		System.out.println("Hello" + 10);
		System.out.println(10 + "Hello");
		System.out.println(10 + (20 + "Hello"));
	}
}
