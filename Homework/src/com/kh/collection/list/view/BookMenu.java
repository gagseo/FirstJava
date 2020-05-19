package com.kh.collection.list.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import com.kh.collection.list.controller.BookManger;
import com.kh.collection.list.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookManger bm = new BookManger();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. ������ �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ��������");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ��ü���");
			System.out.println("6. ������");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList()); // Book[] ���� �޾� printBookList(Book[])����
				break;
			case 3:
				int result = 0;
				if (result > 0) {
					System.out.println("������ ���� �������� ����");
				} else {
					System.out.println("���������� ����");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				if (index == -1) {
					System.out.println("��ȸ�� ���� �������� ����");
				} else {
					System.out.println(bm.searchBook(inputBookTitle()));
				}
				break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if (list.isEmpty()) {
					System.out.println("�����ϴ�.");
				} else {
					Iterator it = list.iterator();
					while (it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6:
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				return;
			}

		}

	}

	public Book inputBook() {
		System.out.println("���� ���� :");
		String title = sc.nextLine();
		System.out.println("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("���� ����: ");
		String auther = sc.nextLine();

		// �Ű����� �����ڸ� �̿��Ͽ� ���� �ʱⰪ�� �̿��� Book��ü ����
		return new Book(category, title, auther);

	}

	public int inputBookNo() {

		System.out.println("���� ��ȣ: ");
		int no = sc.nextInt();
		sc.nextLine();

		return no;

	}

	public String inputBookTitle() {
		System.out.println("���� ����: ");
		String title = sc.nextLine();

		return title;

	}
}
