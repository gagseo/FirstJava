package com.kh.collection.list_2.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.kh.collection.list_2.controller.BookManager;
import com.kh.collection.list_2.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public void mainMenu() {

		while (true) {

			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ��������");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������");
			System.out.println("�޴� ��ȣ ���� : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}

		}

	}

	public void insertBook() { // ���� �߰�

		System.out.println("�������� : ");
		String title = sc.nextLine();
		System.out.println("���� �帣(1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ): ");
		int cNo = sc.nextInt();
		sc.nextLine();
		System.out.println("���� ���� : ");
		String author = sc.nextLine();

		String category = "";
		if (cNo == 1)
			category = "�ι�";
		else if (cNo == 2)
			category = "�ڿ�����";
		else if (cNo == 3)
			category = "�Ƿ�";
		else
			category = "��Ÿ";

		Book book = new Book(0, cNo, title, author);

		bm.insertBook(book);

	}

	public void deleteBook() { // ���� ����

		System.out.println("���� ��ȣ : ");
		int bNo = sc.nextInt();
		sc.nextLine();

		int result = bm.deleteBook(bNo);

		if (result > 0) {
			System.out.println("���������� ����");
		} else {
			System.out.println("������ ���� �������� �ʽ��ϴ�.");
		}

	}

	public void searchBook() { // ���� �˻�
		System.out.println("���� ���� : ");
		String title = sc.nextLine();

		ArrayList<Book> searchList = bm.searchBook(title);

		if (searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}

	}

	public void selectList() { // ��ü ��ȸ

		ArrayList<Book> bookList = bm.selectList();

		if (bookList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}

	}
}
