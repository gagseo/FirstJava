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

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 번호 선택 : ");
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못입력하였습니다. 다시 입력하세요");
			}

		}

	}

	public void insertBook() { // 도서 추가

		System.out.println("도서제목 : ");
		String title = sc.nextLine();
		System.out.println("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int cNo = sc.nextInt();
		sc.nextLine();
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();

		String category = "";
		if (cNo == 1)
			category = "인문";
		else if (cNo == 2)
			category = "자연과학";
		else if (cNo == 3)
			category = "의료";
		else
			category = "기타";

		Book book = new Book(0, cNo, title, author);

		bm.insertBook(book);

	}

	public void deleteBook() { // 도서 삭제

		System.out.println("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();

		int result = bm.deleteBook(bNo);

		if (result > 0) {
			System.out.println("성공적으로 삭제");
		} else {
			System.out.println("삭제할 글이 존재하지 않습니다.");
		}

	}

	public void searchBook() { // 도서 검색
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();

		ArrayList<Book> searchList = bm.searchBook(title);

		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}

	}

	public void selectList() { // 전체 조회

		ArrayList<Book> bookList = bm.selectList();

		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}

	}
}
