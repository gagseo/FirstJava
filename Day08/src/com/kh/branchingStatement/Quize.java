package com.kh.branchingStatement;

import java.util.Scanner;

public class Quize {

	Scanner sc = new Scanner(System.in);

	public void quize1() {

		// ���α׷��� ���۵Ǹ�
		// ��Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է� �ϼ��� :�� �ȳ�â�� ����ϰ�
		// �԰� �� Ŀ����� ����ڷκ��� �Է� ��������.
		// ���� Ŀ����� 0���� �Է��� ��� ���α׷��� �����ϼ���.
		//
		// ��� �԰� �� �̷�� ����
		// "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?" ��� �ȳ����� ����� ��
		// ���� �ֹ��� Ŀ�� �� ���� ����ڷκ��� �Է� �޾�,
		// ���� ����� ���� �ֹ��� Ŀ�� ������ ���� ��Ű����.
		//
		// ��� 0�� �Ǹ� "Ŀ�� ��� �����մϴ�"
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// ���� �ֹ��� Ŀ�� ������ ���� ����� ���� ���
		// "�ֹ��� ���� ��� �����ϴ�."
		// "�ֹ��� �ٽ� �޾� �ּ���."
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// �ֹ��� ���������� �̷�� ����
		// "���� Ŀ�� ���� N �� �Դϴ�."
		// �������� ��� ��� ���� ��
		// "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?"
		// �ȳ�â���� ���ư�����.

		int jego = 0;
		int order = 0;
		boolean mt = true;

		do {
			if (mt) {
				System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ��� : ");
				jego = sc.nextInt();
				mt = false;
				if (jego == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
			System.out.println("���� ������ Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
			order = sc.nextInt();

			if (jego >= order) {
				jego -= order;
				System.out.println("���� Ŀ�� ����" + jego + "�Դϴ�.");
				System.out.println("----------------------------");
				if (jego == order) {
					System.out.println("��� 0�Դϴ�.");
				}

			} else if (order > jego) {
				System.out.println("�ֹ��� ���� ��� �����ϴ�.");
				System.out.println("�ֹ��� �ٽ� �޾��ּ���.");
				mt = true;
			}
		} while (true);

	}

	// ����Ǯ�� 1�ܰ�
	public void quize2() {
		boolean rgx = false;
		int stock = 0;

		System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("��� 0���̻� �Է����ּ���.");
		} else {
			rgx = true;
		}
		while (rgx) {
			System.out.println();
			System.out.println("���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
			int sellcoffee = sc.nextInt();

			// ���� �ֹ��� Ŀ�Ǽ������� ��� ���� ���
			if (stock >= sellcoffee) {
				// ���� �ֹ��� Ŀ�Ǽ����� ��� ���� ���
				if (stock == sellcoffee) {
					System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
					System.out.println("Ŀ�� ��� �����ϴ�.");
					stock -= sellcoffee;
					rgx = false;
				} else {
					System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
					stock -= sellcoffee;
					System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
					System.out.println("-------------------------------");
				}
			} else {
				// ���� �ֹ��� Ŀ�Ǽ����� ����� ���� ���
				System.out.println("�ֹ������� ��� �����ϴ�.");
				System.out.println("�ֹ��� �ٽ� �޾� �ּ���.");
				rgx = false;
			}

		}

		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

	// ����Ǯ�� 2�ܰ�
	public void quize3() {
		boolean rgx = false;
		int stock = 0;

		System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("��� 0���̻� �Է����ּ���.");
		} else {
			rgx = true;
		}
		while (rgx) {
			System.out.println();
			System.out.println("���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
			int sellcoffee = sc.nextInt();

			// ���� �ֹ��� Ŀ�Ǽ������� ��� ���� ���
			if (stock >= sellcoffee) {
				// ���� �ֹ��� Ŀ�Ǽ����� ��� ���� ���
				if (stock == sellcoffee) {
					System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
					System.out.println("Ŀ�� ��� �����ϴ�.");
					stock -= sellcoffee;
					rgx = false;
				} else {
					System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
					stock -= sellcoffee;
					System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
					System.out.println("-------------------------------");
				}
			} else {
				// ���� �ֹ��� Ŀ�Ǽ����� ����� ���� ���
				System.out.println("�ֹ������� ��� �����ϴ�.");
				System.out.println("�ֹ��� �ٽ� �޾� �ּ���.");
				// rgx = false;
			}

		}

		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");

	}

	// ����Ǯ�� 3�ܰ�
	public void quize4() {

		boolean rgx = false;
		boolean stockRgx = true;
		int stock = 0;

		do {

			if (stockRgx) {

				System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���");
				System.out.print("Ŀ����� : ");
				stock = sc.nextInt();

				if (stock > 0) {
					rgx = true;
					stockRgx = false;
					System.out.println("Ŀ���ǸŸ� �����մϴ�.");
					System.out.println("------------------------------");
				} else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}

			if (rgx) {
				System.out.println();
				System.out.print("���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ� ? :");
				int sellcoffee = sc.nextInt();

				if (stock >= sellcoffee) {

					if (stock - sellcoffee > 0) {

						stock -= sellcoffee;
						System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
						System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
						System.out.println("------------------------------");

					} else {
						stock -= sellcoffee;
						System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
						System.out.println("Ŀ����� �����ϴ�.\n");
						// rgx = false;
						stockRgx = true;
					}

				} else {

					System.out.println("�ֹ��� ���� ��� �����ϴ�.");
					System.out.println("�ֹ��� �ٽ� �޾� �ּ���.");
					System.out.println("------------------------------");
					continue;
				}
			}

			// ���α׷� ���� ������ �ٸ���
			// �Ʒ����� ��� �Է� �޴� ���� ���� �ڵ����� �����غ���.

			/*
			 * if(!rgx) {
			 * 
			 * System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���");
			 * System.out.print("Ŀ����� : "); stock = sc.nextInt();
			 * 
			 * if(stock > 0) { rgx = true; System.out.println("Ŀ���ǸŸ� �����մϴ�.");
			 * System.out.println("------------------------------"); }else {
			 * System.out.println("���α׷��� �����մϴ�."); } }
			 */

		} while (rgx);

	}
}
