package com.kh.controllstatment;

import java.util.Scanner;

public class B_IfElse {

	Scanner sc = new Scanner(System.in);

	public void testIfElse() {

		// �� �� �Ѱ��� �����ϴ� ���ǹ�����, ������ ���� ����
		// ������ ������ ��츦 �����ϴ� ���ǹ�
		// ���������̴�.

		// [ǥ����]
		// if(���ǽ�){
		// �����ڵ�1
		// }else{
		// �����ڵ�2
		// {

		System.out.println("���� �ϳ��� �Է��ϼ���.");
//		¦������ ������ Ȯ��.
		int a = sc.nextInt();

		if (a % 2 == 0) {
			if (a % 2 == 0) {
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			}
			System.out.println("���α׷�����");
		}
	}
		

		}

