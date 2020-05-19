package com.kh.branchingStatement;

import java.util.Scanner;

public class A_Break {
	Scanner sc = new Scanner(System.in);

	// break : �ݺ��� �ȿ��� ���� ��� �ݺ����� Ż���Ѵ�.

	public void breakTest() {
		// ���ڿ� "end"�� �Է¹����� �ݺ����� Ż���ϴ� do-while���� �ۼ��Ͻÿ�.
		do {
			System.out.println("���ڿ� �Է�: ");
			String str = sc.next();

			if (str.equals("end")) {
				break;
			}
			System.out.println("�ݺ����� Ż���� ���ڿ��� end �Դϴ�.");
		} while (true);
	}

	// Label�� �̿��ؼ� �ݺ��� ����������.
	public void jumpBreak() {

		outer:while (true) {
			System.out.println("�ݺ����� ������������ exit�� �Է��ϼ���.");
			String check = sc.nextLine();

			switch (check) {
			case "exit": break outer;
			default:
				System.out.println("�ݺ����� Ż������ ���߽��ϴ�.");
			}
		}

	}
}
