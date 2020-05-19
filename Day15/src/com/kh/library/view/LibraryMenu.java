package com.kh.library.view;

import java.util.Scanner;

import com.kh.library.controller.LibraryManager;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	int rentIndex = 0;

	public LibraryMenu() {

	}

	public void mainMenu() {

		// �Է� ���� �̸�, ����, ������ Member �Ű����� �����ڸ� �̿��Ͽ� ���� ��
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��Ͻÿ� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("����(F/M)�� �Է��Ͻÿ� : ");
		char gender = sc.nextLine().charAt(0);

		// �Է� ���� �̸�, ����, ������ Member �Ű����� �����ڸ� �̿��Ͽ� ���� ��
		// LibraryManager�� insertMember() �޼ҵ忡 ������ ��ü �ּ� �� ����
		lm.insertMember(new Member(name, age, gender, 0));

		while (true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case 1:
				System.out.println(lm.myPage());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("���α׷� �����ϱ�");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			if (num == 9) {
				System.out.println("���α׷� �����ϱ�");
				break;
			}
		}

	}

	// ǥ����� ���� ����
	public void selectAll() {
		// LibraryManager�� selectAll() �޼��� ȣ���Ͽ� �� ����� Book[] �ڷ����� ���
		Book[] bList = lm.selectAll();
		// for���� �̿��Ͽ� bList�� ��� ���� ��� ���
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "�� ���� : " + bList[i].toString());
			// ��, ������ �ε���(������ȣ)�� ���� ���
		}

	}

	public void searchBook() {

		System.out.println("�˻��ϼ��� : ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		// ���ڵ�
		// for (int i = 0; i < searchList.length; i++) {
		// if (searchList[i] != null) {
		// System.out.println(searchList[i].toString());
		// } else {
		// break;
		// }
		// }

		// �����ڵ� (����ó�� ���ִ� �ڵ�) < if (searchList[i] != null)
		for (int i = 0; i < searchList.length; i++) {
			try {
				System.out.println(searchList[i].toString());
			} catch (NullPointerException e) {
				System.out.println("������ �� �ε����� : " + e.getMessage());
			} finally { // ������ �����ؾ���� ������ �־����
				System.out.println("������ ����");
			}

		}
	}

	public void rentBook() {

		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int rentIndex = sc.nextInt();
		sc.nextLine();
		int result = lm.rentBook(rentIndex);

		// ���ǹ� �ȿ��� ������ ������ �ȵȴ�.
		if (result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else if (result == 2) {
			System.out.println("���������� �뿩 �Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�. �������������� Ȯ���ϼ���.");
		}
	}
}
