package com.kh.scan;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		// ������ ���� a, b, c 3���� ���� �� ���� 10, 20, 30�� �Է¹޾�,
		// ���� ������ �����ϴ� ���� �ۼ��ϰ�, a, b, c�� ������� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.println("a�� �Է��ϼ��� : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("b�� �Է��ϼ��� : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.println("c�� �Է��ϼ��� : ");
		int c = sc.nextInt();
		sc.nextLine();

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("a�� ���� : " + a);
		System.out.println("b�� ���� : " + b);
		System.out.println("c�� ���� : " + c);

	}
}
