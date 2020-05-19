package logic.home.model;

import java.util.Scanner;

public class PrimitiveTypeSample {

	Scanner sc = new Scanner(System.in);

	public void typeSize() {

		System.out.println("byte : " + Byte.BYTES);
		System.out.println("short : " + Short.BYTES);
		System.out.println("int : " + Integer.BYTES);
		System.out.println("long : " + Long.BYTES);
		System.out.println("float : " + Float.BYTES);
		System.out.println("double : " + Double.BYTES);

	}

	public void minMaxValue() {

		System.out.println("byte");
		System.out.println("byte�� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte�� �ּҰ� : " + Byte.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("short");
		System.out.println("short�� �ִ밪 : " + Short.MAX_VALUE);
		System.out.println("short�� �ּҰ� : " + Short.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("int");
		System.out.println("int�� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("int�� �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("long");
		System.out.println("long�� �ִ밪 : " + Long.MAX_VALUE);
		System.out.println("long�� �ּҰ� : " + Long.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("float");
		System.out.println("float�� �ִ밪 : " + Float.MAX_VALUE);
		System.out.println("float�� �ּҰ� : " + Float.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("double");
		System.out.println("double�� �ִ밪 : " + Double.MAX_VALUE);
		System.out.println("double�� �ּҁW : " + Double.MIN_VALUE);

	}

	public void bitSize() {

		System.out.println("byte : " + Byte.SIZE);
		System.out.println("short : " + Short.SIZE);
		System.out.println("int : " + Integer.SIZE);
		System.out.println("long : " + Long.SIZE);
		System.out.println("float : " + Float.SIZE);
		System.out.println("double : " + Double.SIZE);
		
	}

}
