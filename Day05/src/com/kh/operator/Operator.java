package com.kh.operator;

import java.util.Scanner;

public class Operator {

	Scanner sc = new Scanner(System.in); // �ʵ庯��
	/*
	 * public void methodTest() { //�޼ҵ� String teststr = "������ ����� �ɱ�?"; }
	 */

	public void ��������Ȯ��() {

		// �������ڴ� &&, ||
		int num;
		int num2;

		System.out.println("ù��° ���� �ϳ� �Է�");
		num = sc.nextInt();
		System.out.println("�ι�° ���� �ϳ� �Է�");
		num2 = sc.nextInt();

		// && : ���� ����� �����̸�, �ڸ� �������� ����
		// || : ���� ����� ���̸�, �ڸ� �������� ����

		String res = num >= 1 && num++ <= 100 ? "num������ ���� 1~100������ ���̴�" : "num������ ���� 1~100������ ���� �ƴϴ�";

		System.out.println("num�� ���� : " + num);

		String res2 = num2 >= 1 || num2++ <= 100 //
				? "num2�� ���� 1���� ũ�ų� 100���� �۴�"
				: "num2�� ���� 1���� �۰� 100���ٴ� ũ��";

		System.out.println("num2�� ���� : " + num2);
	}
	// �ǽ�����
	// 3. �ֹι�ȣ�� �Է¹ް� ���� �����ڸ� �̿��Ͽ� �̼��������� ��������, �� �������� �������� �����Ͽ� ����ϼ���.
	// (2019�� ���� 1999������ ���� ����)
	// �ֹι�ȣ�� �Է��ϼ���(-����) : 950101-2000000
	// ���ο���
	// �ֹι�ȣ�� �Է��ϼ���(-����) : 100101-1000000
	// �̼��Ⳳ��

	public void method1() {

		System.out.println("�ֹι�ȣ�� �Է����ּ���.");
		String id = sc.nextLine();
		char isAdult = id.charAt(0);
		String resAdult = isAdult == '1' || isAdult == '0' ? "�̼�����" : "����"; //���� �̼����� ����
		System.out.println(resAdult);

		char gender = id.charAt(7);
		String resGender = gender == '1' || gender == '3' ? "����" : "����"; // ���� ���� ����
		System.out.println(resGender);
		}

}
