package com.hw1.run;

import java.util.Scanner;

import com.hw1.controller.FileController;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FileController fc = new FileController();

		while (true) {
			System.out.println("****** MyNote ******");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fc.fileSave();
				break;
			case 2:
				fc.fileOpen();
				break;
			case 3:
				fc.fileEdit();
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		}

	}

}
