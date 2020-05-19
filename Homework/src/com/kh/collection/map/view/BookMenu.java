package com.kh.collection.map.view;

import java.util.Scanner;

import com.kh.collection.map.controller.BookManager;
import com.kh.collection.map.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("*** ���� ���� ���α׷�***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
			System.out.println("�޴� ��ȣ ����: ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1: // �����κ�
				 bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3: // �����κ�
				bm.deleteBook(inputBookNo());
				break;
			case 4:
				String title = bm.searchBook(inputBookTitle());
				if (title != null) {
				} else {
					System.out.println("��ȸ�� ���� �������� ����");
				}
				break;
			case 5: // �����κ�
				bm.selectAll();
				break;
			case 6:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}

	}

	public Book inputBook() {

		System.out.println("���� ���� : ");
		String title = sc.nextLine();
		System.out.print("�帣 (1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) ���ڷ� �Է� : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		String author = sc.nextLine();

		return new Book(category, title, author);

	}

	public String inputBookNo() {

		System.out.println("���� ��ȣ : ");
		String bNo = sc.nextLine();

		return bNo;

	}

	public String inputBookTitle() {

		System.out.println("���� ���� : ");
		String title = sc.nextLine();

		return title;

	}
}
