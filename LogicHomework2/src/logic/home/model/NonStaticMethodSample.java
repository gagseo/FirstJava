package logic.home.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {

		Scanner sc = new Scanner(System.in);

		System.out.println("byte�� ���� �������� : ");
		byte b = sc.nextByte();
		sc.nextLine();
		System.out.println("short�� ���� �������� : ");
		short s = sc.nextShort();
		sc.nextLine();
		System.out.println("int�� ���� �������� : ");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.println("long�� ���� �������� : ");
		long l = sc.nextLong();
		sc.nextLine();
		System.out.println("float�� ���� �������� : ");
		float f = sc.nextFloat();
		sc.nextLine();
		System.out.println("double�� ���� �������� : ");
		double d = sc.nextDouble();
		sc.nextLine();
		System.out.println("boolean�� ���� �������� : ");
		boolean bo = sc.nextBoolean();
		System.out.println("char�� ���� �������� : ");
		char c = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("String�� ���� �������� : ");
		String str = sc.nextLine();

		System.out.println("byte�� ������ ���� = " + b);
		System.out.println("short�� ������ ���� = " + s);
		System.out.println("int�� ������ ���� = " + i);
		System.out.println("long�� ������ ���� = " + l);
		System.out.println("float�� ������ ���� = " + f);
		System.out.println("double�� ������ ���� = " + d);
		System.out.println("boolean�� ������ ���� = " + bo);
		System.out.println("char�� ������ ���� = " + c);
		System.out.println("String�� ������ ���� = " + str);

	}

	public void testDate() {

		// DateŬ����
		Date today = new Date();
		System.out.println(today);

		// ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-E����");
		System.out.println(sdf.format(today));

		// GregorianCalendarŬ����
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());

	}

	public void testRandom() {

		Random rd = new Random();

		int num1;
		float num2;

		num1 = rd.nextInt();
		System.out.println("������ ������ : " + num1);

		num2 = rd.nextFloat();
		System.out.println("�Ǽ��� ������(0~1) : " + num2);

	}

}
