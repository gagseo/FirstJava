package com.kh.scan;

import java.util.Scanner;

public class ScannerTest {
	// �����Լ��� �����ֽð�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();

		System.out.println("������ �Է��ϼ��� : ");
		String sex = scanner.nextLine();
		/*
		 * char sex = scanner.next().charAt(0); scanner.nextLine();
		 */
//		char�� ���� �ѱ��ڸ� ǥ���Ҷ� ��밡��
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		String add = scanner.nextLine();

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sex);
		System.out.println("�ּ� : " + add);

	}
}
