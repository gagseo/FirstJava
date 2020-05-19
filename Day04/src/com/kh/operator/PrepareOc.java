package com.kh.operator;

import java.util.Scanner;

public class PrepareOc {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요.");
		int num01 = sc.nextInt();

		System.out.println("두번째 수를 입력하세요.");
		int num02 = sc.nextInt();
		sc.nextLine();

		System.out.println("계산할 부호를 넣으세요. ('+', '-', '*', '/', '%')");
		char cal = sc.nextLine().charAt(0);

		String result = (cal == '+') ? (num01 + num02) + ""
				: (cal == '-') ? num01 - num02 + ""
						: (cal == '*') ? num01 * num02 + ""
								: (cal == '/') ? num01 / num02 + "" : (cal == '%') ? num01 % num02 + "" : "잘못입력하셨습니다.";

		System.out.println(result);
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요.");
		int num03 = sc.nextInt();

		System.out.println("두번째 수를 입력하세요.");
		int num04 = sc.nextInt();
		sc.nextLine();

		System.out.println("계산할 부호를 넣으세요. ('+', '-', '*', '/', '%')");
		char cal2 = sc.nextLine().charAt(0);

		if (cal2 == '+') {
			System.out.println(num03 + num04);
		} else if (cal2 == '-') {
			System.out.println(num03 - num04);
		} else if (cal2 == '*') {
			System.out.println(num03 * num04);
		} else if (cal2 == '/') {
			System.out.println(num03 / num04);
		} else if (cal2 == '%') {
			System.out.println(num03 % num04);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요.");
		int num05 = sc.nextInt();

		System.out.println("두번째 수를 입력하세요.");
		int num06 = sc.nextInt();
		sc.nextLine();

		System.out.println("계산할 부호를 넣으세요.('+', '-', '*', '/', '%')");
		char cal03 = sc.nextLine().charAt(0);

		switch (cal03) {
		case '+':
			System.out.println(num05 + num06);
			break;
		case '-':
			System.out.println(num05 - num06);
			break;
		case '*':
			System.out.println(num05 * num06);
			break;
		case '/':
			System.out.println(num05 / num06);
			break;
		case '%':
			System.out.println(num05 % num06);
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
		}
	}
}
