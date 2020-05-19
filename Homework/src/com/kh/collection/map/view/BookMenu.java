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
			System.out.println("*** 도서 관리 프로그램***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1: // 막힌부분
				 bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3: // 막힌부분
				bm.deleteBook(inputBookNo());
				break;
			case 4:
				String title = bm.searchBook(inputBookTitle());
				if (title != null) {
				} else {
					System.out.println("조회한 글이 존재하지 않음");
				}
				break;
			case 5: // 막힌부분
				bm.selectAll();
				break;
			case 6:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}

	}

	public Book inputBook() {

		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("장르 (1.인문/2.자연과학/3.의료/4.기타) 숫자로 입력 : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();

		return new Book(category, title, author);

	}

	public String inputBookNo() {

		System.out.println("도서 번호 : ");
		String bNo = sc.nextLine();

		return bNo;

	}

	public String inputBookTitle() {

		System.out.println("도서 제목 : ");
		String title = sc.nextLine();

		return title;

	}
}
