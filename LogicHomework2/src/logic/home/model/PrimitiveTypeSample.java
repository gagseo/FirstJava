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
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("short");
		System.out.println("short의 최대값 : " + Short.MAX_VALUE);
		System.out.println("short의 최소값 : " + Short.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("int");
		System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("long");
		System.out.println("long의 최대값 : " + Long.MAX_VALUE);
		System.out.println("long의 최소값 : " + Long.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("float");
		System.out.println("float의 최대값 : " + Float.MAX_VALUE);
		System.out.println("float의 최소값 : " + Float.MIN_VALUE);
		System.out.println("--------------------------");
		System.out.println("double");
		System.out.println("double의 최대값 : " + Double.MAX_VALUE);
		System.out.println("double의 최소갮 : " + Double.MIN_VALUE);

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
