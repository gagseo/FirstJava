package com.kh.demensionArray;

import java.util.Scanner;

public class DemensionArrayPrac<ArrayUtill> {
	Scanner sc = new Scanner(System.in);
	// ����ڿ��� �������� �ϳ� �Է¹޾�
	// �� ���� ũ��� ���� ��� ���� ������ 2���� �迭�� ����
	// 2���� �迭�� ���ڸ� 1���� ���������� �Է��ϵ�
	// ���� ¦�� �϶��� ���ʿ��� ����������
	// ���� Ȧ�� �϶��� �����ʿ��� �������� �Էµǵ��� �Ͻÿ�.
	// ex) ����� �Է°� 3
	// 0 1 2 3
	// 1 6 5 4
	// 2 7 8 9

	public void test1() {

		System.out.println("����� �Է°� : ");
		int num = sc.nextInt();
		// 1. 2���� �迭 �ʱ�ȭ �Ͽ� ������ �Է�
		int[][] arr = new int[num][num];
		int a = 1;
		// 2. 2���� �迭 ���� �� �������� ���ƾ���
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a;
					a++;
					// 2-1 ���� ¦���϶� ��������

					// 2-1-1

					// 2-2 ���� Ȧ���϶� ��������
					// 2-2-1
				}
			} else {
				for (int j = num - 1; j >= 0; j--) {
					arr[i][j] = a;
					a++;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	// ����ڿ��� �������� �ϳ� �Է¹޾�
	// �� ���� ũ��� ���� ��� ���� ������ 2���� �迭�� ����
	// 2���� �迭�� ���ڸ� 1���� ���������� �Է��ϵ�
	// ���� ¦�� �϶��� ���ʿ��� ����������
	// ���� Ȧ�� �϶��� �����ʿ��� �������� �Էµǵ��� �Ͻÿ�.
	// ex) ����� �Է°� 3
	// 0 1 2 3
	// 1 6 5 4
	// 2 7 8 9
	// ����Ǯ��

	public void test2() {
		System.out.print("�ۼ� �� 2�����迭�� ��� ���� �Է��ϼ��� :");
		int idx = sc.nextInt();
		int[][] iDArray = new int[idx][idx];
		int num = 1;
		for (int i = 0; i < iDArray.length; i++) {
			int num2 = iDArray.length * (i + 1);
			for (int j = 0; j < iDArray[i].length; j++) {

				if (i % 2 == 0) { // i�� ¦���̸�
					iDArray[i][j] = num;
				} else {
					iDArray[i][j] = num2;
				}
				num++;
				num2--;
			}
		}
		for (int i = 0; i < iDArray.length; i++) {
			for (int j = 0; j < iDArray[i].length; j++) {
				System.out.print("      " + iDArray[i][j]);
			}
			System.out.println();
		}
	}
}
