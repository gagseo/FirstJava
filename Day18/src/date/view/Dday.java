package date.view;

import java.util.Scanner;

import date.model.DatePrac;

public class Dday {

	DatePrac dp = new DatePrac();

	public void mainMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���.");
		System.out.println("���� : ");
		int year = sc.nextInt();
		System.out.println("�� : ");
		int month = sc.nextInt();
		System.out.println("�� : ");
		int day = sc.nextInt();

		long res = dp.dDay(year, month, day);
		System.out.println("�Է��Ͻ� ��¥���� " + res + "�� ���ҽ��ϴ�.");
		System.out.println(dp.dDay(year, month, day) + "�� ���ҽ��ϴ�."); // ��¹� �ȿ� �ۼ������ϴ�.

	}

}
