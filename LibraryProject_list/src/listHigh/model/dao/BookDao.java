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
	
	// ������ ���� ��ȣ ����
	public int getLastBookNo() {
		return bookList.get(bookList.size()-1).getbNo();
	}
	
	// �� ���� �߰�
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// ���� ����
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
	
	// ���� �˻� --> ���� �۹�ȣ�� �ƴ� list�� �ε��� ����
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
	
	// �ش� �ε��� ���� �̿��� Book��ü ����
	public Book selectBook(int index) {
		return bookList.get(index);
	}
	
	// ��ü ���
	public ArrayList<Book> selectAll() {
		return bookList;
	}
	
	// �ش� ���� ó�� �� list ����
	public ArrayList<Book> sortedBookList() {
		bookList.sort(new AscCategory());
		return bookList;
	}
	
}
