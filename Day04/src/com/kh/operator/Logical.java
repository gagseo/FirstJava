package com.kh.operator;

import java.util.Scanner;

public class Logical {

	// ���� �ΰ��� ���ϴ� ������
	// And : &&(�׸���, ~�鼭)
	// OR : ||(�Ǵ�, ~�ų�)
	// ���� && ����, ���� || ����
	public void method1() {

		// �Է��� ���� ���� 1~100������ �������� Ȯ���ϱ�.
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		// "num�� 1���� 100�������� Ȯ�� : " + true/false
		System.out.println("num�� 1���� 100�������� Ȯ�� : " + (num >= 1 && num <= 100));
	}

}
