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
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체출력");
			System.out.println("6. 끝내기");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList()); // Book[] 리턴 받아 printBookList(Book[])실행
				break;
			case 3:
				int result = 0;
				if (result > 0) {
					System.out.println("삭제할 글이 존재하지 않음");
				} else {
					System.out.println("성공적으로 삭제");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				if (index == -1) {
					System.out.println("조회한 글이 존재하지 않음");
				} else {
					System.out.println(bm.searchBook(inputBookTitle()));
				}
				break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if (list.isEmpty()) {
					System.out.println("없습니다.");
				} else {
					Iterator it = list.iterator();
					while (it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6:
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			}

		}

	}

	public Book inputBook() {
		System.out.println("도서 제목 :");
		String title = sc.nextLine();
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("도서 저자: ");
		String auther = sc.nextLine();

		// 매개변수 생성자를 이용하여 위의 초기값을 이용한 Book객체 리턴
		return new Book(category, title, auther);

	}

	public int inputBookNo() {

		System.out.println("도서 번호: ");
		int no = sc.nextInt();
		sc.nextLine();

		return no;

	}

	public String inputBookTitle() {
		System.out.println("도서 제목: ");
		String title = sc.nextLine();

		return title;

	}
}
