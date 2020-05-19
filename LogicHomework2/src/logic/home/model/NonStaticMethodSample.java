package logic.home.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {

		Scanner sc = new Scanner(System.in);

		System.out.println("byte에 값을 넣으세요 : ");
		byte b = sc.nextByte();
		sc.nextLine();
		System.out.println("short에 값을 넣으세요 : ");
		short s = sc.nextShort();
		sc.nextLine();
		System.out.println("int에 값을 넣으세요 : ");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.println("long에 값을 넣으세요 : ");
		long l = sc.nextLong();
		sc.nextLine();
		System.out.println("float에 값을 넣으세요 : ");
		float f = sc.nextFloat();
		sc.nextLine();
		System.out.println("double에 값을 넣으세요 : ");
		double d = sc.nextDouble();
		sc.nextLine();
		System.out.println("boolean에 값을 넣으세요 : ");
		boolean bo = sc.nextBoolean();
		System.out.println("char에 값을 넣으세요 : ");
		char c = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("String에 값을 넣으세요 : ");
		String str = sc.nextLine();

		System.out.println("byte에 대입한 값은 = " + b);
		System.out.println("short에 대입한 값은 = " + s);
		System.out.println("int에 대입한 값은 = " + i);
		System.out.println("long에 대입한 값은 = " + l);
		System.out.println("float에 대입한 값은 = " + f);
		System.out.println("double에 대입한 값은 = " + d);
		System.out.println("boolean에 대입한 값은 = " + bo);
		System.out.println("char에 대입한 값은 = " + c);
		System.out.println("String에 대입한 값은 = " + str);

	}

	public void testDate() {

		// Date클래스
		Date today = new Date();
		System.out.println(today);

		// 형식 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-E요일");
		System.out.println(sdf.format(today));

		// GregorianCalendar클래스
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());

	}

	public void testRandom() {

		Random rd = new Random();

		int num1;
		float num2;

		num1 = rd.nextInt();
		System.out.println("정수의 난수는 : " + num1);

		num2 = rd.nextFloat();
		System.out.println("실수의 난수는(0~1) : " + num2);

	}

}
