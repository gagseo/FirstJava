package com.kh.controlstatement.loop;

import java.util.Scanner;

//for���� ������ ������ ������ ���
public class A_For {

	Scanner sc = new Scanner(System.in);

	// ���ĺ� A�� �ƽ�Ű�ڵ�� 65�Դϴ�.
	// ���ĺ� B�� �ƽ�Ű�ڵ�� 66�Դϴ�.
	// ���ĺ� C�� �ƽ�Ű�ڵ�� 67�Դϴ�.
	// ���ĺ� D�� �ƽ�Ű�ڵ�� 68�Դϴ�.
	// ���ĺ� E�� �ƽ�Ű�ڵ�� 69�Դϴ�.
	// ���ĺ� F�� �ƽ�Ű�ڵ�� 70�Դϴ�.
	// ���ĺ� G�� �ƽ�Ű�ڵ�� 71�Դϴ�.
	// ���ĺ� H�� �ƽ�Ű�ڵ�� 72�Դϴ�.
	// ���ĺ� I�� �ƽ�Ű�ڵ�� 73�Դϴ�.
	// ................
	// ���ĺ� Z�� �ƽ�Ű�ڵ�� 90�Դϴ�.
	// �� ����϶�
	public void forSatetment() {

		char alphabet = 'A';
		for (int i = 0; i < 26; i++) {
			// for(�ʱ��; ���ǽ�; ������){}
			System.out.println("���ĺ�" + (char) (alphabet + i) + "�� �ƽ�Ű�ڵ��" + (int) (alphabet + i) + "�Դϴ�.");
		}

	}

	// 1~100������ ������, 2�� ����� ����غ���.
	public void testFor2() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public void testFor3() {

		// 0,1,2,3,4 �� for������ �ۼ��϶�.

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// -5,-4,-3,-2,-1,0
		for (int i = -5; i <= 0; i++) {
			System.out.println(i);
		}

		// 2, 4, 6, 8
		for (int i = 2; i < 9; i = i + 2) {
			// for�������� ������(i=i+2)�� ++�� ���°� �����Ѵ�.
			System.out.println(i);
		}

	}

	// for������ ������ ����غ���
	// ����ڷκ��� ���� �Է¹޾Ƽ� �� ���� �������� ����Ͻÿ�.

	public void testFor4() {
		System.out.println("���?");
		int gugu = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(gugu + " * " + i + " = " + (gugu * i));
		}

	}
}
