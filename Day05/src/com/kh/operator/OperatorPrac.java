package com.kh.operator;

import java.util.Scanner;

public class OperatorPrac {

	Scanner sc = new Scanner(System.in);

	// �ǽ�����
	// 3. �ֹι�ȣ�� �Է¹ް� ���� �����ڸ� �̿��Ͽ� �̼��������� ��������, �� �������� �������� �����Ͽ� ����ϼ���.
	// (2019�� ���� 1999������ ���� ����)
	// �ֹι�ȣ�� �Է��ϼ���(-����) : 950101-2000000
	// ���ο���
	// �ֹι�ȣ�� �Է��ϼ���(-����) : 100101-1000000
	// �̼��Ⳳ��
	public void optest01() {

		System.out.println("�ֹε�� ��ȣ�� �Է����ּ���");
		String info = sc.nextLine();

		// ù��° �ڸ�
		char first = info.charAt(0); // �������� �̼�������
		char second = info.charAt(7); // �������� ��������

		String gender = second == '1' || second == '3' ? "����" : "����";
		String age = first == '0' || first == '1' ? "�̼�����" : "����";

		System.out.println(age + gender);

	}
	// �ǽ�����
	// ��������: ����(����), ����(����), ����(����), ����(����), ���(�Ǽ�) ���� �����ϰ�,
	// �� ������ Ű����� �Է¹ް�,
	// �հ�(����+����+����)�� ���(�հ�/3.0)�� ����ϰ�,
	// �� ������ ������ ����� ������ �հ� ���� ó����
	// �հ��� ���� : �� ������ ������ ���� 40���̻��̸鼭, ����� 60�� �̻��̸� �հ�, �ƴϸ� ���հ� ó����

	public void optest02() {
		int kor;
		int eng;
		int mat;
		int total;
		double aver;

		System.out.println("���� ������ �Է��ϼ���. : ");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���. : ");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���. : ");
		mat = sc.nextInt();

		total = kor + eng + mat;
		aver = total / 3.0;

		String res = (kor >= 40 && eng >= 40 && mat >= 40 && aver >= 60) ? "�հ�" : "���հ�";
		System.out.println("��� : " + res + " �Դϴ�.");
	}

	public void optest03() {
		// ����(����), ����(����), ����(����), ������ �����ϰ� �� ������ Ű����� �Է¹�����,
		// �հ�(���� + ���� + ����)�� ���(�հ� / 3.0)�� ����ϰ�,
		// �� ������ ��տ� ���� ���� ����� �ο��ض�.
		// ��� : ��� 90�� �̻� : A
		// ��� 80�� �̻� : B
		// ��� 70�� �̻� : C
		// ��� 60�� �̻� : D
		// ��� 60�� �̸� : F
		int kor;
		int eng;
		int mat;
		int total;
		double aver;

		System.out.println("���� ������ �Է��ϼ���. : ");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���. : ");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���. : ");
		mat = sc.nextInt();

		total = kor + eng + mat;
		aver = total / 3.0;

		String res = aver >= 90 ? "A" : aver >= 80 ? "B" : aver >= 70 ? "C" : aver >= 60 ? "D" : "F";
		System.out.printf("��� %.2f ���̸� " + res + "����Դϴ�.", aver);
	}
}