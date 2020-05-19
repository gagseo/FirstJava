package com.kh.controlstatement.loop;

import java.util.Scanner;

public class A2_ForDouble {

	Scanner sc = new Scanner(System.in);

	// 2�� for�� �ۼ��غ���
	public void testForDouble() {

		System.out.println("����� �� �� : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 2�� for������ ������ ����غ���.
	public void testForDouble2() {

		for (int i = 2; i > 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	// �ٿ�ε� ���� ���α׷� ������ �Է��ϼ���:3
	// 1��° ���α׷� �ٿ�ε� �޽��ϴ�.
	// 0% ������..
	// 20%������..
	// 40% ������..
	// 60% ������..
	// 80% ������..
	// 100% ������..
	// 1��° ���α׷� �ٿ�ε� �Ϸ� �Ǿ����ϴ�.
	// ---------------------------
	// 2��° ���α׷� �ٿ�ε� �޽��ϴ�.
	// 0% ������..
	// 20%������..
	// 40% ������..
	// 60% ������..
	// 80% ������..
	// 100% ������..
	// 2��° ���α׷� �ٿ�ε� �Ϸ� �Ǿ����ϴ�.
	// ---------------------------
	// 3��° ���α׷� �ٿ�ε� �޽��ϴ�.
	// 0% ������..
	// 20%������..
	// 40% ������..
	// 60% ������..
	// 80% ������..
	// 100% ������..
	// 3��° ���α׷� �ٿ�ε� �Ϸ� �Ǿ����ϴ�.
	public void testForDouble3() {
		System.out.println("�ٿ�ε� ���� ���α׷� ������  �Է��ϼ��� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("---------------------------");
			System.out.println(i + 1 + "��° ���α׷� �ٿ�ε� �޽��ϴ�.");
			for (int j = 0; j < 6; j++) {
				System.out.println(j * 20 + "%������..");
			}
			System.out.println(i + 1 + "��° ���α׷� �ٿ�ε� �Ϸ� �Ǿ����ϴ�.");
		}
		System.out.println("��� ���α׷� �ٿ�ε� �Ϸ�Ǿ����ϴ�.");
	}

	// �� �� : 5
	// ĭ �� : 5
	// *****
	// *****
	// *****
	// *****
	// *****
	public void testForDouble4() {

		System.out.println("�� �� : ");
		int num1 = sc.nextInt();
		System.out.println("ĭ �� : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// �� �� : 7
	// ĭ �� : 7
	// 1******
	// *2*****
	// **3****
	// ***4***
	// ****5**
	// *****6*
	// ******7
	public void testForDouble5() {

		System.out.println("�� �� : ");
		int row = sc.nextInt(); // �ٱ� for��, ������, row, ��
		System.out.println("ĭ �� : ");
		int column = sc.nextInt(); // ���� for��, ������, column, ��

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
