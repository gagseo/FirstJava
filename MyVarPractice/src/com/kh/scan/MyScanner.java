package com.kh.scan;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("int�� �Է����ּ��� : ");
		int iNum = scanner.nextInt();
		
		
		System.out.println("float�� �Է����ּ��� : ");
		float fNum = scanner.nextFloat();
		
		
		System.out.println("double�� �Է����ּ��� : ");
		double dNum = scanner.nextDouble();
		
		
		System.out.println("char�� �Է����ּ��� : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
//		�Ǹ������� nextLine�� ���� �������� nextLine�� ����� �Ѵ�.
		
		System.out.println("String�� �Է����ּ��� : ");
		String str = scanner.nextLine();
//		nextLine() ���� ���� ������ ��¸��Ѵ�.
		
		
		System.out.println("�Է��� ���� : " + iNum);
		System.out.println("�Է��� float�� : " + fNum);
		System.out.println("�Է��� double�� : " + dNum);
		System.out.println("�Է��� char�� : " + ch);
		System.out.println("�Է��� String�� : " + str);

		
	}
}
