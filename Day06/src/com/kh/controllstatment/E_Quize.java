package com.kh.controllstatment;

import java.util.Scanner;

public class E_Quize {
	Scanner sc = new Scanner(System.in);

	public void Quize01() {
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
		int month;
		double temp;

		System.out.println("���� �Է��ϼ���. : ");
		while (true) {
			try {
				month = sc.nextInt();
				if (month >= 1 && month <= 12)
					break;
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1~12 ������ ���� �ٽ� �Է��ϼ���.");
				}
			} catch (Exception e) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~12 ������ ���� �ٽ� �Է��ϼ���..");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("���� ����� �Է��ϼ���.");
		while (true) {
			try {
				temp = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �Ǽ��� �Է��� �� �ֽ��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}

		String season = "";
		String warn = "";

		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			if (temp <= -15) {
				warn = "���� �溸";
			} else if (temp <= -12) {
				warn = "���� ���Ǻ�";
			}
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			if (temp >= 35) {
				warn = "���� �溸";
			} else if (temp >= 33) {
				warn = "���� ���Ǻ�";
			}
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		System.out.println("�Է��Ͻ�" + month + "����" + season + "�̰�,");
		if (warn.isEmpty()) {
			System.out.println("�Է��Ͻ� �����" + temp + "'c �Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� �����" + temp + "'c �̸� ����" + warn + "�� �߷ɵǾ����ϴ�.");
		}
	}
}
