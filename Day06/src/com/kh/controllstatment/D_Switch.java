package com.kh.controllstatment;

import java.util.Scanner;

public class D_Switch {

	// ������ ���� case���� ã�� ����� �����ϴ� ���ǹ��̴�.
	// (������ �ƴ϶� ��Ȯ�� ���̾�� �Ѵ�. i < 10(x), i == 10(o)
	// �ش� ���� ���� ��� default���� �����Ѵ�(if���� else�� ����)
	// case�� ��ɹ� ���̿��� (:)�� ����Ѵ�.
	// break�� ������ ������ �ʰ� ���� case�� default�� �����Ѵ�.

	// [ǥ����]
	// switch(����){
	// case 1 : ���๮; break; //������ ���� 1�� ��� ���⸸ ����
	// case 2 : ���๮; break; //������ ���� 2�� ��� ���⸸ ����
	// default : ���๮; break; //1�� 2�� �ƴϸ� ���� ����
	Scanner sc = new Scanner(System.in);

	public void testSwitch1() {

		// ������ �ϳ� �Է¹��� �� �Է¹��� ���ڰ� ¦������ Ȧ������ �Ǻ�

		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		int res = num % 2;
		switch (res) {
		case 0:
			System.out.println("�Է��Ͻ� ������ ¦�� �Դϴ�.");
			break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ�� �Դϴ�.");
		}
	}

	// ����ġ�� �ȿ� if�� �ۼ�
	public void testSwitch2() {
		// �ϳ��� ������ �Է¹�����
		// �ش� ������ 0���� ¦������ Ȧ������ ����ϴ�
		// switch���� �ۼ��Ͻÿ�

		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			if (num != 0) {
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
			}
			break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}

	// Switch�� �ȿ� switch�� �־ ���
	public void testSwitch3() {
		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
				break;
			default:
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			}
			break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}

	// break�� �����غ���
	// Fall Through
	// Ȱ���� ���� ������ �������� ��������.
	// ���࿡ ����Ѵٸ� �ּ��� �ʼ��� �޾���� �Ѵ�.
	public void testSwitch4() {
		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
				// break;
			default:
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			}
			// break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}

	public void testIfQ() {
		// ȸ�����(Dia/Gold/Sliver/Bronz)�� �Է¹��� ����
		// ��޿� ���� ������ �߱����ִ� ���α׷��� �ۼ��Ͻÿ�
		// Dia : ���̾�����/50%��������/��ȭƼ��2������/20%��������
		// Gold : ���̾�����/50%��������/��ȭƼ��2������
		// Silver : ���̾�����/50%��������
		// Bronz : ���̾�����
		// ���� �߱��� "00���� �߱�" �̶�� ����� ��� �߱޵Ǿ��ٰ� ����.
		// if���� Ȱ���ؼ� �ۼ��ؾ��մϴ�.
		// if������ ���� ���� switch������ �����غ���
		System.out.println("����� �Է��ϼ��� : ");
		String mg = "";
		mg = sc.nextLine();
		// ���ǹ� �ۼ���, mg == "Dia" �̷��� �ۼ���������
		// �Ʒ� ���ǹ� ó�� �ۼ������ �մϴ�. �ǹ̴� �����ϴ�.

		if (mg.equals("Dia")) {
			System.out.println("���̾� �����߱�");
			System.out.println("50%���� �����߱�");
			System.out.println("��ȭƼ�� 2�������߱�");
			System.out.println("20%���� �����߱�");
		} else if (mg.equals("Gold")) {
			System.out.println("���̾� �����߱�");
			System.out.println("50%���� �����߱�");
			System.out.println("��ȭƼ�� 2�������߱�");
		} else if (mg.equals("Sliver")) {
			System.out.println("���̾� �����߱�");
			System.out.println("50%���� �����߱�");
		} else if (mg.equals("Bronze")) {
			System.out.println("���̾� �����߱�");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

	}

	public void testSwitchO() {
		System.out.println("����� �Է��ϼ��� : ");
		String mg = sc.nextLine();

		switch (mg) {
		case "Dia":
			System.out.println("20%���������߱�");
		case "Gold":
			System.out.println("��ȭƼ�� 2�Ź߱�");
		case "Sliver":
			System.out.println("50%���� �����߱�");
		case "Bronze":
			System.out.println("���̾� �����߱�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	// 1~12������ �Է� �޾�, �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
	// default���� �����ϰ� ��¹� 4���� �ۼ��� �� �ֽ��ϴ�.
	public void switchQ2() {
		System.out.println("1~12���� �ϳ��� �Է��ϼ��� : ");
		String month = sc.nextLine();
		switch (month) {
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			System.out.println("31��");
			break;
		case "4":
		case "6":
		case "9":
		case "11":
			System.out.println("30��");
			break;
		case "2":
			System.out.println("28��");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

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

	public void ifQuize() {
		System.out.println("�� �� ����� �Է��ϼ���.");
		String month = sc.nextLine();
		int temp = sc.nextInt();

		switch (month) {
		case "12��":
		case "1��":
		case "2��":
			if (temp <= -15) {
				System.out.println("���İ溸");

			} else if (temp <= -12) {
				System.out.println("�������Ǻ�");
			}
			System.out.println("�ܿ�");
			break;
		case "3��":
		case "4��":
		case "5��":
			System.out.println("��");
			break;
		case "6��":
		case "7��":
		case "8��":
			if (temp >= 35) {
				System.out.println("�����溸");
			} else if (temp >= 33) {
				System.out.println("�������Ǻ�");
			}
			System.out.println("����");
			break;
		case "9��":
		case "10��":
		case "11��":
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

	}

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
	public void ifQuize2() {
		System.out.println("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("���� ��ȣ�� �Է��ϼ���.[+, -, *, /, %] : ");
		char c = sc.nextLine().charAt(0);

		if (c == '+') {
			if (num1 + num2 >= 0) {
				System.out.println(num1 + num2);
			} else if (c == '-') {
				if (num1 - num2 >= 0) {
					System.out.println(num1 - num2);
				}
			} else if (c == '*') {
				if (num1 * num2 >= 0) {
					System.out.println(num1 * num2);
				}
			} else if (c == '/') {
				if (num2 != 0 && num1 / num2 >= 0) {
					System.out.println(num1 / num2);
				} else {
					System.out.println("0���� ������ �����ϴ�.");
				}
			} else if (c == '%') {
				System.out.println(num1 % num2);
			} else {
				System.out.println("�Է��Ͻ� ������ �����ϴ�.");

			}
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
