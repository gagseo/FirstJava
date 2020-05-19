package com.kh.demensionArray;

import java.util.Scanner;

public class Homework {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		// 1.���� �� ���� ���깮�� �ϳ��� Ű����� �Է¹���
		System.out.println("ù��° ���� : ");
		// 2. �� �������� int ������ ����
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("���� ���� : ");
		// 3. ���깮�ڴ� char ������ ����
		char op = sc.next().charAt(0);
		int res = 0;
		// 4.switch�� ���
		switch (op) {
		case '+':
			// :���� ���ڰ� '+'�̸�, �� ������ �� ���
			res = num1 + num2;
			break;
		case '-':
			// '-'��, �� ������ �� ���
			res = num1 - num2;
			break;
		case 'x':
		case 'X':
			res = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				// '/'�̸�, �������� ������ ��
				res = num1 / num2;
			} else {
				// ��, ������ ��(�ι��� ����)�� 0�̸�
				// "0���� ���� �� �����ϴ�."��µǰ� �ϰ�,
				System.out.println("0���� ���� �� �����ϴ�.");
				res = 0;
				// ����� 0 ó����
			}
			break;
		default:
			System.out.println("��Ȯ�� �����ڸ� �Է����ּ���.");
		}
		// �� ���ó�� ��
		// 5. ��� ���
		// ��> 10 x 20 = 200
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);

	}

	public void totalCalculator() {
		// 1. Ű����� �� ���� ������ �Է� ����
		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		// 3
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		// 5
		// 2. �� ���� �� ���� ���� ���۰�����,
		// ū ���� ���ᰪ���� �����
		int sum = 0;
		// 3.���� ������ ū ������ ������ �հ踦 ����
		// i = 3 4 5
		if (num2 > num1) {
			for (int i = num1; i < num2 + 1; i++) {
				sum = sum + i;
			}
		} else if (num1 > num2) {
			for (int i = num2; i < num1 + 1; i++) {
				sum = sum + i;
			}
		} else if (num1 == num2) {
			sum = num1;
		}
		System.out.println(sum);
		// for �� ���

		// 4.�հ� ��� ó��
	}

	public void profile() {

		// ó������ : �Ż��������� �ڷ����� ���� ������ ����ϰ�,
		// ������ ��ϵ� ���� ��� Ȯ����.
		// ���೻�� : �ܼ�â�� ������ �Ż������� ����ǰ� ��
		// ��� ��)
		// �̸� : ȫ�浿
		String name = "��ȣ��";
		// ���� : 26 ��
		int age = 35;
		// ���� : ����
		String gender = "����";
		// ���� : ��������
		String e = "����";

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + e);

	}

	public void sungjuk() {
		// ó������ :
		// ���� �����ϰ�, Ű����� �Է¹��� ������ ������ ����ϰ� �������� ȭ�鿡 ��� Ȯ����
		// =>����
		// �л��̸�(String)
		System.out.println("�̸��� �Է��ϼ���. : ");
		String name = sc.nextLine();
		// �г�(int)
		System.out.println("�г��� �Է��ϼ���. : ");
		int g = sc.nextInt();
		sc.nextLine();
		// ��(int)
		System.out.println("���� �Է��ϼ���. : ");
		int c = sc.nextInt();
		// ��ȣ(int)
		System.out.println("��ȣ�� �Է��ϼ���. : ");
		int n = sc.nextInt();
		// ����(M/F)(char)//���ڿ��� �Է¹�����, ���� �ϳ� �и��ؾ���
		System.out.println("������ �Է��ϼ���.(M/F) : ");
		char gender = sc.next().charAt(0);
		// ���׿����� �̿��Ͽ� ���л�, ���л� �����϶�
		String genderName = gender == 'm' ? "���л�"
				: gender == 'M' ? "���л�" : gender == 'f' ? "���л�" : gender == 'F' ? "���л�" : "�߸��Է��ϼ̽��ϴ�";
		// ����(int)
		System.out.println("������ �Է��ϼ���. : ");
		int s = sc.nextInt();
		sc.nextLine();

		// ����(char)
		char h = 'A';

		// ������ 90�̻��̸� ������ A�� ó��
		if (s >= 90) {
			h = 'A';
		}
		// 80 �̻� 90 �̸� B
		else if (s >= 80) {
			h = 'B';
		}
		// 70�̻� 80 �̸� C
		else if (s >= 70) {
			h = 'C';
		}
		// 60�̻� 70�̸� D
		else if (s >= 60) {
			h = 'D';
		}
		// 60�̸� F
		else {
			h = 'F';
		}
		// ��� ��)
		System.out.println(g + "�г�" + c + "��" + n + "��" + genderName + " ������" + (double) s + "�� �̰�," + h + "���� �Դϴ�.");
		// 3�г� 2�� 25�� ���л� ȫ�浿�� ������ 95.5�̰�, A ���� �Դϴ�.
		// **���л�/���л��� ���� ������ ���� ����ؼ� ���׿����ڷ� ó����

	}

	public void printStarNumber() {
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0) {
			// �Է¹��� ���� �ٷ� �ϴ� ����� �����.
			for (int i = 1; i < num + 1; i++) {
				for (int j = 1; j < i + 1; j++) {

					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println("");

			}

		}

		// ex) ���� �ϳ� �Է� : 5

		// 1
		// *2
		// **3
		// ***4
		// ****5
		// ==========
		else {
			System.out.println("����� �ƴմϴ�.");
		}
		// ���� �ϳ� �Է� : -5
		// ����� �ƴմϴ�.
	}

	public void sumRandomNumber() {
		// 1~100 ������ ������ ������ ������ �ϳ� �߻�����(Math.Random())
		// 1���� �߻��� ���������� �հ踦 ���Ͽ� �����

		int num = (int) (Math.random() * 100 + 1);
		int sum = 0;
		System.out.println(num);
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}

		System.out.println(sum);

	}

	public void shutNumber() {

		// ��������:
		// 1.�ΰ��� �ֻ����� ����� �� �� �ִ� ��� ����� ����(random)
		boolean rgx = true;
		int num = 0;
		int a = 0;
		// System.out.println(num);

		do {
			num = (int) (Math.random() * 10 + 2);

			System.out.println("���ϱ��? ���纸���� : ");
			a = sc.nextInt();

			if (num == a) {
				System.out.println("������ϴ�.");
			} else {
				System.out.println("������ " + num + "�Դϴ�.");
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("=======================");
			}
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
			char g = sc.next().charAt(0);

			if (g == 'y' || g == 'Y') {
				rgx = true;

			} else if (g == 'n' || g == 'N') {
				System.out.println("����");
				break;
			} else {
				System.out.println("��Ȯ�ϰ� �Է��ϼ���.");
			}
		} while (rgx);

		// 2.�� �ֻ��� ���� ���� �Էµ� ���� ���� ��� "������ϴ�." ���
		// 3.�Է� ���� �ٸ��� "Ʋ�Ƚ��ϴ�." �����

		// 4.���� ���� ��� �� ����Ͻðڽ��ϱ�?(y/n) ���
		// 5."����Ͻðڽ��ϱ�?(y/n):"���� 'n' �Ǵ� 'N'�Է½� �ݺ� ���� ��
		// 6. do ~ whlie ������ �ݺ��ǰ� ��
	}

}
