package com.kh.controllstatment;

import java.util.Scanner;

public class E_Ouize {
	Scanner sc = new Scanner(System.in);

	public void ifQuze1() {

		// ����Ǯ��!

		// ���� ����� ����ڷκ��� �Է¹޾�
		// ������ ���Ǻ��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		// 12, 1, 2 : �ܿ�
		// (����� -15�� ������ ��� ���İ溸)
		// (����� -12�� ������ ��� �������Ǻ�)
		// 3, 4, 5 : ��
		// 6, 7, 8 : ����
		// (����� 35�� �̻��� ��� �����溸)
		// (����� 33�� �̻��� ��� �������Ǻ�)
		// 9, 10, 11 : ����

		System.out.println("���� �Է����ּ���.");
		int month = sc.nextInt();
		System.out.println("����� �Է����ּ���.");
		int temp = sc.nextInt();

		if (month == 1 || month == 2 || month == 12) {
			if (temp <= -15) {
				System.out.println("�ܿ��̸鼭 ���� �溸�Դϴ�.");
			} else if (temp <= -12) {
				System.out.println("�ܿ��̸鼭 ���� ���Ǻ��Դϴ�.");
			} else {
				System.out.println("�ܿ��Դϴ�.");
			}
		} else if (month >= 3 && month <= 5) {
			System.out.println("�� �Դϴ�.");
		} else if (month >= 6 && month <= 8) {
			if (temp >= 35) {
				System.out.println("�����̸鼭 ���� �溸 �Դϴ�.");
			} else if (temp >= 33) {
				System.out.println("�����̸鼭 ���� ���Ǻ��Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}

		} else if (month >= 9 && month >= 11) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("1~12�� ������ ���� �Է����ּ���.");
		}

	}

	// ��¹��� �ʹ� ���Ƽ� �������� ��������
	// String �̿��ؼ� ��¹� �ٿ�����
	public void ifQuize02() {
		System.out.println("���� �Է����ּ���.");
		int month = sc.nextInt();
		System.out.println("����� �Է����ּ���.");
		int temp = sc.nextInt();
		String season = "";

		if (month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
			if (temp <= -15) {
				season += "�̸鼭 ���İ溸";
			} else if (temp <= -12) {
				season += "�̸鼭 �������Ǻ�";
			}
		} else if (month >= 3 && month <= 5) {
			season = "��";
		} else if (month >= 6 && month <= 8) {
			season = "����";
			if (temp >= 35) {
				season += "�̸鼭 �����溸";
			} else if (temp >= 33) {
				season += "�̸鼭 �������Ǻ�";
			}

		} else if (month >= 9 && month <= 11) {
			season = "����";
		} else {
			season = "�Է��Ͻ� ���ڰ� 1~12�� ����� ����";
		}
		System.out.println(season + "�Դϴ�.");
	}

	public void switchQuize3() {
		// ����Ǯ��!

		// �� ���� ������ �Է¹ް�, ���� Ȥ�� ���ڿ��� �����ȣ(+, -, *, /, %)��
		// �Է� �޾� ������ �������� ����Ͻÿ�.
		// -������ ��� 0 �̻��� ���� �������� ����ϼ���.

		// ù ��° ���� �Է� : 5
		// �� ��° ���� �Է� : 7
		// ���� ��ȣ �Է� : *
		// ���� ��� : 5 * 7 = 35

		// ��, 0���� ���� ��� "0���� ���� �� �����ϴ�"�� ����ϰ� ��� ���� 0���� ó���ϸ�
		// ���� ��ȣ�� ���� ���ڸ� �Է��ϸ�"�Է��Ͻ� ������ �����ϴ�. ���α׷��� �����մϴ�."��
		// ��� �� ���α׷��� �����Ͻÿ�.

		System.out.println("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� : ");
		int num2 = sc.nextInt();
		System.out.println("������(+,-,*,/%)");
		char op = sc.next().charAt(0);
		int result = 0;

		switch (op) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			if (num1 > num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			break;
		case '%':
			if (num2 != 0) {
				result = num1 % num2;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			break;
		default:
			System.out.println("��Ȯ�� �����ڸ� �Է����ּ���.");

		}
		System.out.println(result);

	}

	public void switchQuize4() {

	}
}
