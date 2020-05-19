package listHigh.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import listHigh.controller.BookManager;
import listHigh.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		
	}
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가 ");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");

			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3:
				int result = bm.deleteBook(inputBookNo());
				if(result > 0) {
					System.out.println("성공적으로 삭제되었습니다.");
				}else {
					System.out.println("삭제할 글이 존재하지 않습니다.");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				if(index == -1) {
					System.out.println("조회한 글이 존재하지 않습니다.");
				}else {
					System.out.println(bm.selectBook(index));
				}
				break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if(list.isEmpty()) {
					System.out.println("도서가 없습니다.");
				}else {
					Iterator it = list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
		}
		
	}
	
	public Book inputBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("장르 (1.인문/2.자연과학/3.의료/4.기타) 숫자로 입력 : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();

		return new Book(category, title, author);
	}
	
	public int inputBookNo() {
		System.out.print("도서 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
		
	}
	
	public String inputBookTitle() {
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();

		return title;
	}

}
