package com.kh.operator;

import java.util.Scanner;

public class Triple {

	// 3�׿�����
	// ���ǽ� ? ��1 : ��2
	public void method() {

		// �Է� ���� ������ Ȧ������ ¦�� ���� �Ǻ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(num + "��/��" + result + "�̴�");

	}

	public void method2() {

		// �Է� ���� ������ ������� �ƴ��� �Ǻ� �� ���
		// ��� : "num�� ���/���� �Դϴ�"
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num2 = sc.nextInt();

		String result2 = (num2 >= 0) ? "���" : "����";
		System.out.println(num2 + "��/��" + result2 + "�̴�");
	}

	public void method3() {
		// ���׿����� ��ø ���
		// �Է¹��� ������ ���, 0, ���� ���� �Ǻ� �� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num3 = sc.nextInt();

		String result3 = (num3 == 0) ? "0" : (num3 > 0) ? "���" : "����";
		System.out.println(num3 + "��/��" + result3 + "�̴�");

	}

	public void method4() {

		// �� ���� '+', �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�.
		// �� '+', '-'�̿��� ������ �Է� �� "�߸� �Է��ϼ̽��ϴ�." ���
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° �� : ");
		int numA = sc.nextInt();
		System.out.println("�� ��° �� :");
		int numB = sc.nextInt();

		// ��ĳ�� ���ۿ� ����ִ� �����͸� ����ش�.
		sc.nextLine();

		System.out.println("������ �Է�( + or - or * or /) :");
		// ����ڷ� ���� �Է¹��� ���ڿ��� ù��° ���ڸ� ��ȯ�Ѵ�.
		// ����ڰ� �Է��� �����ڰ� op�� ����ִ�.

		char op = sc.nextLine().charAt(0);

		// String result = ���׿�����.
		// a+b+""
		// a-b+""
		
		// String result4 = (op == '+') ? "numA + numB : " + (numA + numB)
		// : (op == '-') ? "numA - numB : " + (numA - numB)
		// : (op == '*') ? "numA * numB = " + (numA * numB)
		// : (op == '/') ? "numA / numB = " + (numA / numB) : "�߸��ԷµǼ̽��ϴ�.";
		// System.out.println(result4);
		
		String result4 = (op == '+') ? (numA + numB + "")
				: (op == '-') ? (numA - numB + "")
						: (op == '*') ? (numA * numB + "") : (op == '/') ? (numA / numB + "") : "�߸��Է��ϼ̽��ϴ�.";
		System.out.println(result4);
	}

}
