package com.kh.scan;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		// 정수형 변수 a, b, c 3개를 만든 후 각각 10, 20, 30을 입력받아,
		// 다음 연산을 수행하는 식을 작성하고, a, b, c의 결과값을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("a를 입력하세요 : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("b를 입력하세요 : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.println("c를 입력하세요 : ");
		int c = sc.nextInt();
		sc.nextLine();

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("a의 값은 : " + a);
		System.out.println("b의 값은 : " + b);
		System.out.println("c의 값은 : " + c);

	}
}
