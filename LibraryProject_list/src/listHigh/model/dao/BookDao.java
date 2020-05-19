package listHigh.model.dao;

import java.util.ArrayList;

import listHigh.model.comparator.AscCategory;
import listHigh.model.vo.Book;

public class BookDao {
	
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
	
	// 마지막 도서 번호 리턴
	public int getLastBookNo() {
		return bookList.get(bookList.size()-1).getbNo();
	}
	
	// 새 도서 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// 도서 삭제
	public int deleteBook(int no) {
		int result = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				result = 1;
			}
		}
		
		return result;
	}
	
	// 도서 검색 --> 도서 글번호가 아닌 list의 인덱스 리턴
	public int searchBook(String title) {
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	// 해당 인덱스 값을 이용한 Book객체 리턴
	public Book selectBook(int index) {
		return bookList.get(index);
	}
	
	// 전체 출력
	public ArrayList<Book> selectAll() {
		return bookList;
	}
	
	// 해당 정렬 처리 후 list 리턴
	public ArrayList<Book> sortedBookList() {
		bookList.sort(new AscCategory());
		return bookList;
	}
	
}
