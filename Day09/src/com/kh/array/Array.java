package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	Scanner sc = new Scanner(System.in);

	public void array1() {

		// �迭
		// �ڷ����� ���� �������� ������ �ʿ��� ���
		// int n1, int n2, int n3, int n4, int n5, int n6,
		// �̷��� �迭�� ����ϸ� ����.
		// int[] ar = new int[6];

		// 1.�迭 ���� : �迭������ �����ּ� ����� ���۷���(������) ���� �����
		// �ڷ���[] �迭��(������);
		int[] ar; // 4byte�� ����ִ�.

		// 2. �迭 �Ҵ� : new �����ڷ� �� �޸� ������ �迭������ �Ҵ��㰡
		// �߻��� �ּҸ� �غ��� �迭 ���۷����� �����.
		ar = new int[10];

		System.out.println("ar length : " + ar.length);
		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
	}

	public void array2() {

		// �迭�� ũ��� ���������ε� �������� �� �ִ�.
		// int idx = 10; < 1��
		// int idx = sc.nextInt(); < 2��
		int[] iArr = new int[sc.nextInt()]; // < 3��

		// ��) ����ڷ� ���� �迭�� ũ�⸦ �Է¹޾� ������.

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(i + " : " + iArr[i]);
		}
	}

	public void array3() {
		// �迭 ����� ���ÿ� �Ҵ� ����
		String[] sAr = new String[5];

		// �����ϴ� ���� 5�� �ְ�
		// for������ �迭�ȿ� �ִ� ��ü ���� ����ϱ�.
		sAr[0] = "ġŲ";
		sAr[1] = "����";
		sAr[2] = "������ũ";
		sAr[3] = "����";
		sAr[4] = "��䰥��";

		for (int i = 0; i < sAr.length; i++) {
			// for (int i = 0; i < sAr.length; i++) {} < for�� ���� �ܿ��
			System.out.println(sAr[i]);
		}
	}

	public void array4() {

		// �迭 ����� ���ÿ� �Ҵ�� ���ÿ� �ʱ�ȭ
		int[] iArr = new int[] { 5, 4, 3, 2, 1 };
		// int[] iArr2 = { 1, 2, 3, 4, 5 }; // new int[] ��������
		iArr[3] = 100; // ���� �ʱ�ȭ �ϸ� �� ������ ��µǴ°��� Ȯ���� �� �ִ�.
		System.out.println(iArr[3]);
	}

	public void array5() {

		int[] iArr = new int[] { 1, 2 };

		// ���α׷��� ����
		// ����� �л� �θ��� �ڸ��� �ٲٴµ� �ʿ��� ������ ������ ���� �Դϴ�.

		int cnt = iArr[0];
		iArr[0] = iArr[1];
		iArr[1] = cnt;

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

	public void array6() {

		// ���� �ε����� ���� �ε������� Ŭ ��� �ڸ� ��ȯ
		// �ƴҰ�� �״������

		int[] iArr = { 5, 3, 4, 1, 2 };

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr.length - i - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {
					int temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}
		System.out.println(iArr);  //[I@1b6d3586 ��� ���
		System.out.println(Arrays.toString(iArr));
	}
}
