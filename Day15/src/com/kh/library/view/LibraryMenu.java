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

		// 입력 받은 이름, 나이, 성별로 Member 매개변수 생성자를 이용하여 생성 후
		System.out.println("이름을 입력하시오 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하시오 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(F/M)을 입력하시오 : ");
		char gender = sc.nextLine().charAt(0);

		// 입력 받은 이름, 나이, 성별로 Member 매개변수 생성자를 이용하여 생성 후
		// LibraryManager의 insertMember() 메소드에 생성한 객체 주소 값 전달
		lm.insertMember(new Member(name, age, gender, 0));

		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
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
				System.out.println("프로그램 종료하기");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			if (num == 9) {
				System.out.println("프로그램 종료하기");
				break;
			}
		}

	}

	// 표현방법 추후 수정
	public void selectAll() {
		// LibraryManager의 selectAll() 메서드 호출하여 그 결과값 Book[] 자료형에 담기
		Book[] bList = lm.selectAll();
		// for문을 이용하여 bList의 모든 도서 목록 출력
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
			// 단, 도서의 인덱스(도서번호)도 같이 출력
		}

	}

	public void searchBook() {

		System.out.println("검색하세요 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		// 내코드
		// for (int i = 0; i < searchList.length; i++) {
		// if (searchList[i] != null) {
		// System.out.println(searchList[i].toString());
		// } else {
		// break;
		// }
		// }

		// 강사코드 (예외처리 없애는 코드) < if (searchList[i] != null)
		for (int i = 0; i < searchList.length; i++) {
			try {
				System.out.println(searchList[i].toString());
			} catch (NullPointerException e) {
				System.out.println("문제가 된 인덱스는 : " + e.getMessage());
			} finally { // 무조건 실행해야햐는 로직을 넣어야함
				System.out.println("무조건 실행");
			}

		}
	}

	public void rentBook() {

		System.out.println("대여할 도서 번호 선택 : ");
		int rentIndex = sc.nextInt();
		sc.nextLine();
		int result = lm.rentBook(rentIndex);

		// 조건문 안에는 연산이 있으면 안된다.
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지에서 확인하세요.");
		}
	}
}
