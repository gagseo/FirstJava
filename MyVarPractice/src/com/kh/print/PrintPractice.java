package com.kh.print;

import java.util.Scanner;

public class PrintPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();

		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		sc.nextLine(); // ���ڸ� �Է��ϴ� �޼ҵ带 ���� sc.nextLine();�� ó��������Ѵ�. ���ͷ� �ν����� �ʴ´�.

		System.out.print("�ּҸ� �Է����ּ��� : ");
		String add = sc.nextLine();

		System.out.print("Ű�� �Է����ּ��� : ");
		double tall = sc.nextDouble();

		System.out.print("�����Ը� �Է����ּ��� : ");
		double weight = sc.nextDouble();

		System.out.print("���� �Է����ּ��� : ");
		char gender = sc.next().charAt(0);
		// ���Ŀ� �°� ���

		System.out.println("����� �̸��� : " + name);
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� �ּҴ� : " + add);
		System.out.println("����� Ű�� : " + (int) tall);
		System.out.printf("����� �����Դ� : %.1f\n", weight);
		System.out.println("����� ������ : " + gender);

	}
}
