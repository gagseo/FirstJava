package com.kh.operator;

import java.util.Scanner;

public class PrepareOc {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���� �Է��ϼ���.");
		int num01 = sc.nextInt();

		System.out.println("�ι�° ���� �Է��ϼ���.");
		int num02 = sc.nextInt();
		sc.nextLine();

		System.out.println("����� ��ȣ�� ��������. ('+', '-', '*', '/', '%')");
		char cal = sc.nextLine().charAt(0);

		String result = (cal == '+') ? (num01 + num02) + ""
				: (cal == '-') ? num01 - num02 + ""
						: (cal == '*') ? num01 * num02 + ""
								: (cal == '/') ? num01 / num02 + "" : (cal == '%') ? num01 % num02 + "" : "�߸��Է��ϼ̽��ϴ�.";

		System.out.println(result);
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���� �Է��ϼ���.");
		int num03 = sc.nextInt();

		System.out.println("�ι�° ���� �Է��ϼ���.");
		int num04 = sc.nextInt();
		sc.nextLine();

		System.out.println("����� ��ȣ�� ��������. ('+', '-', '*', '/', '%')");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���� �Է��ϼ���.");
		int num05 = sc.nextInt();

		System.out.println("�ι�° ���� �Է��ϼ���.");
		int num06 = sc.nextInt();
		sc.nextLine();

		System.out.println("����� ��ȣ�� ��������.('+', '-', '*', '/', '%')");
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
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
		}
	}
}
