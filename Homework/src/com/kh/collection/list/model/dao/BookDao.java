package com.kh.collection.list.model.dao;

import java.util.ArrayList;

import com.kh.collection.list.model.comparator.AscCategory;
import com.kh.collection.list.model.vo.Book;

public class BookDao {

	private ArrayList<Book> booklist;

	public BookDao() {
		booklist = new ArrayList<Book>();
	}

	public BookDao(ArrayList<Book> list) {
		booklist = list;
	}

	public int getLastBookNo() {
		return booklist.get(booklist.size() - 1).getbNo();

	}

	public void addBook(Book book) {
		booklist.add(book);
	}

	public int deletBook(int no) {
		int result = 0;
		for (int i = 0; i < booklist.size(); i++) {
			booklist.remove(i);
			result = 1;
		}

		return result;

	}

	public int searchBook(String title) {
		int index = -1;
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getTitle().contains(title)) {
				index = i;
			}
		}

		return index;

	}

	public Book selectBook(int index) {
		return booklist.get(index);

	}

	public ArrayList<Book> selectAll() {
		return booklist;

	}

	public ArrayList<Book> sortedBookList() {
		booklist.sort(new AscCategory());
		return booklist;

	}
}
