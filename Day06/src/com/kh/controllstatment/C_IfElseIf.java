package com.kh.controllstatment;

import java.util.Scanner;

public class C_IfElseIf {

	// if else if �� ���������� �� �� �ִ� �����̴�.
	// [ǥ����]
	// if(���ǽ�){
	// ���๮1
	// }else if (���ǽ�2){
	// ���๮2
	// }else{
	// ���๮2
	// }

	// ������ �ϳ� �Է¹޾Ƽ� ����� ������ ������ ����� ����Ͻÿ�
	// �����, 90���̻��� A���
	// 90�� �̸� 80�� �̻��� B���
	// 80�� �̸� 70�� �̻��� C���
	// 70�� �̸� 60�� �̻��� D���
	// 60�� �̸��� F���

	Scanner sc = new Scanner(System.in);

	public void testIfElseIf() {

		System.out.println("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		String grade = "";

		if (point >= 90) {
			grade = "A";
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("����� ������ " + point + "�̰�" + "����� " + grade + "�Դϴ�.");

	}

	public void testIfElseIf2() {
		// ���� ��������
		// �� ��޺� ������ �߰����� �̻��϶� (ex 95��)
		// ��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϼ���.
		// ��) 95�� �̻��� ����� A+�� ��µǰ� ��.

		System.out.println("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		String grade = "";

		if (point >= 90) {
			if (point >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		} else if (point >= 80) {
			if (point >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		} else if (point >= 70) {
			if (point >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}

		} else if (point >= 60) {
			if (point >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}

		} else {
			grade = "F";
		}
		System.out.println("����� ������ " + point + "�̰�" + "����� " + grade + "�Դϴ�.");
	}

	// �ǽ�����
	// 3. ����, ����, ���� ������ ���� �Է� �ް� ��� 50���̻�,
	// �� ���� 35�� �̻��϶� "�հ��Դϴ�."�� ����ϰ�
	// ����� 50�� �̸��� ���"��� ���� �̴޷� ���հ��Դϴ�."��
	// ����ϸ�, ����� 50�� �̻������� ����(35�� �̸�)�� ������ ������
	// "(�ش����)�������� ���հ��Դϴ�."�� ����ϼ���.

	public void testIfElseIf3() {

		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();

		double ave = (kor + eng + mat) / 3.0;

		if (kor >= 35 && eng >= 35 && mat >= 35) {
			System.out.printf("����� %.2f ������ �հ��Դϴ�.", ave);
		} else if (kor >= 35 && eng >= 35) {
			System.out.println("���а��� �������� ���հ��Դϴ�.");
		} else if (kor >= 35 && mat >= 35) {
			System.out.println("������� �������� ���հ��Դϴ�.");
		} else if (eng >= 35 && mat >= 35) {
			System.out.println("������� �������� ���հ��Դϴ�.");
		} else if (kor >= 35) {
			System.out.println("����,������� �������� ���հ��Դϴ�.");
		} else if (eng >= 35) {
			System.out.println("����,���а��� �������� ���հ��Դϴ�.");
		} else if (mat >= 35) {
			System.out.println("����, ������� �������� ���հ��Դϴ�.");
		} /*
			 * else { System.out.println("�ΰ��� �������� ���հ��Դϴ�."); }
			 */
		else {
			System.out.println("������� �̴޷� ���հ��Դϴ�.");
		}
	}

	public void testIfElseIf4() {

		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();

		double ave = (kor + eng + mat) / 3.0;
		String res = "";

		if (ave >= 50) {
			if (kor < 35 || eng < 35 || mat < 35) {
				if (kor < 35) {
					res = "���� ";
				}
				if (eng < 35) {
					res = "���� ";
				}
				if (mat < 35) {
					res = "���� ";
				}
				System.out.println(res + "�������� ���հ��Դϴ�.");
			} else {
				System.out.println("����̻����� �հ��Դϴ�.");
			}
		} else {
			System.out.println("������Ϸ� ���հ��Դϴ�.");
		}

	}
}