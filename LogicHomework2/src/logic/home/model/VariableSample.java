package logic.home.model;

import java.util.Scanner;

public class VariableSample {

	Scanner sc = new Scanner(System.in);

	boolean b1;
	byte bNum;
	short sNum;
	int iNum;
	long lNum;
	float fNum;
	double dNum;
	char c;
	String s;

	public void myProfile() {

		String myName = "��ȣ��";
		int myAge = 35;

		System.out.println("���� �̸��� " + myName + "�̸� ���̴� " + myAge + " �Դϴ�.1");

	}

	public void emplnformation() {

		System.out.println("����� �������Է��ϼ���");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : (M/F)");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("�ּ� : ");
		String address = sc.nextLine();

		System.out
				.println("����� �̸��� " + name + " �̸� " + "���̴� " + age + " �̸� " + gender + " �̸� " + address + " �� ���� ���̴�.");

	}

	public void defaultValue() {

		System.out.println("boolean�� �ʱⰪ�� ? " + b1);
		System.out.println("byte�� �ʱⰪ�� ? " + bNum);
		System.out.println("short�� �ʱⰪ�� ? " + sNum);
		System.out.println("int�� �ʱⰪ�� ? " + iNum);
		System.out.println("long�� �ʱⰪ�� ? " +lNum);
		System.out.println("float�� �ʱⰪ�� ? " + fNum);
		System.out.println("double�� �ʱⰪ�� ? " + dNum);
		System.out.println("char�� �ʱⰪ�� ? " + c);
		System.out.println("String�� �ʱⰪ�� ? " + s);
	}

}
