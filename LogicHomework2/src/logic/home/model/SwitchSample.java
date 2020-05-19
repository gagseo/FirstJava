package logic.home.model;

import java.util.Scanner;

public class SwitchSample {

	Scanner sc = new Scanner(System.in);

	public void calculator() {

		System.out.println("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("��������ڸ� �Է�(+,-,*,/,%) : ");
		char cal = sc.next().charAt(0);
		int res = 0;

		switch (cal) {

		case '+':
			res = num1 + num2;
			break;
		case '-':
			if (num1 > num2) {
				res = num1 - num2;
			} else {
				res = num2 - num1;
			}
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				res = num1 / num2;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			break;
		case '%':
			if (num2 != 0) {
				res = num1 % num2;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			break;
		default:
			System.out.println("��Ȯ�� �����ڸ� �Է����ּ���.");

		}
		System.out.println(num1 + " " + cal + " " + num2 + " = " + res);
	}

	public void fruitPrice() {

		System.out.println("���ϰ��Կ� ���Ű� ȯ���մϴ�.");
		System.out.println("�����̸� : ");
		String fruit = sc.nextLine();
		int price = 0;

		switch (fruit) {
		case "���":
			price = 1000;
			System.out.println("����� ������ " + price + "�� �Դϴ�.");
			break;
		case "�ٳ���":
			price = 4000;
			System.out.println("�ٳ����� ������ " + price + "�� �Դϴ�.");
			break;
		case "����":
			price = 10000;
			System.out.println("������ ������ " + price + "�� �Դϴ�.");
			break;

		default:
			System.out.println("�츮���Կ� ���� �����Դϴ�.");
			break;
		}

	}

}
