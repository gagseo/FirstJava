package com.kh.scan;

public class HomeWork {
	public static void main(String[] args) {

		// ������ ���� x=100, y=33, z=0 �ʱ�ȭ �Ŀ� ���� ���� ���� �� x, y, z�� ����ϼ���.
		// x--;
		// z=x-- + --y;
		// x=99 + x++ + x;
		// y=y-- + y + ++y;

		int x = 100;
		int y = 33;
		int z = 0;

		x--; // 99
		System.out.println(x);

		z = x-- + --y; // 99 + 32 = 131
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = 99 + x++ + x; // 99 + 98 + 99
		System.out.println(x);

		y = y-- + y + ++y; // 32 + 31 + 32

		System.out.println("x�� ���� : " + x);
		System.out.println("y�� ���� : " + y);
		System.out.println("z�� ���� : " + z);

		y = --y + ++y + ++y; // 94 + 95 + 96
		System.out.println(y);
	}
}
