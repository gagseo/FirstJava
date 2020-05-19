package com.kh.loopingstatement;

import java.util.Scanner;

public class B_While {

	Scanner sc = new Scanner(System.in);

	// while���� ���ǽĸ� �����ϴ� �ݺ����̴�.
	// (�ʱ�İ� �������� �������� �ʴ´�.)
	public void testWhile() {
		int i = 0;
		while (i < 5) {
			System.out.println("while�� ��������");
			i++;
		}
	}

	// while�� ����ؼ� ������ 2~9�ܱ��� ����ϱ�.
	public void testWhile2() {

		int dan = 2;

		while (dan < 10) {

			int su = 1;
			while (su < 10) {
				System.out.println(dan + "*" + su + "=" + (dan * su));
				su++;
			}

			dan++;
		}
	}

	// ��й�ȣ�� 123456
	// ����ڰ� ��й�ȣ�� �°� �Է��ϸ� �α��� ���� ������ ����ϼ���.
	// ��й�ȣ�� Ʋ���� �Է��ϸ� �� ȸ �� �� �Է��Ͽ����� �˷��ִ� ������ �ۼ��ϼ���.
	// ��й�ȣ�� 5ȸ Ʋ����
	// "��й�ȣ�� 5ȸ �� �� �Է��Ͽ� 10�а� �α��� �� �� �����ϴ�."
	// ������ ����ϼ���.
	public void testWhile3() {

		String pw = "123456";
		String input = "";
		int i = 0;

		while (!(pw.equals(input) && i < 6)) {

			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			input = sc.nextLine();

			if (pw.equals(input)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			} else {
				System.out.println("��й�ȣ" + i + "ȸ ���� �Դϴ�.");
				i++;
			}
		}
	}

	// ����ڰ� �ڷ����� �Է��ϸ� �ش� �ڷ����� ũ��� �ּҰ�, �ִ밪�� ��ȯ���ּ���.
	public void testWhile4() {

		boolean rgx = true;
		while (rgx) {

			System.out.println("�˰� ���� �ڷ����� �Է��ϼ���. : ");
			System.out.println("boolean/char" + "/byte/short/int/float/double/���� : exit");

			String data = sc.nextLine();
			int size = 0;
			double max = 0;
			double min = 0;

			switch (data) {
			case "boolean":
				size = 1;
				max = 1;
				min = 0;
				break;
			case "char":
				size = Character.SIZE;
				max = Character.MAX_VALUE;
				min = Character.MIN_VALUE;
				break;
			case "int":
				size = Integer.SIZE;
				max = Integer.MAX_VALUE;
				min = Integer.MIN_VALUE;
				break;
			case "byte":
				size = Byte.SIZE;
				max = Byte.MAX_VALUE;
				min = Byte.MIN_VALUE;
				break;
			case "short":
				size = Short.SIZE;
				max = Short.MAX_VALUE;
				min = Short.MIN_VALUE;
				break;
			case "long":
				size = Long.SIZE;
				max = Long.MAX_VALUE;
				min = Long.MIN_VALUE;
				break;
			case "float":
				size = Float.SIZE;
				max = Float.MAX_VALUE;
				min = Float.MIN_VALUE;
				break;
			case "double":
				size = Double.SIZE;
				max = Double.MAX_VALUE;
				min = Double.MIN_VALUE;
				break;
			case "exit":
				rgx = false;
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				break;
			default:
				System.out.println("��Ȯ�� �ڷ����� �־��ּ���.");
			}

			if (size != 0) {
				System.out.println(data + ": ũ��: " + size + " �ּҰ�: " + min + " �ִ밪: " + max);

			}

		}

	}
}
