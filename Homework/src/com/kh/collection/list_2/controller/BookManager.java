package com.kh.collection.list_2.controller;

import java.util.ArrayList;

import com.kh.collection.list_2.model.vo.Book;

public class BookManager {

	ArrayList<Book> bookList = new ArrayList<Book>();

	public BookManager() {

	}

	public void insertBook(Book book) {

		int lastNo = 0;

		try {

			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
			

		} catch (Exception e) {
			
			e.printStackTrace();
			
			lastNo = 1;

		}

	}

	public int deleteBook(int bNo) {

		int result = 0;
		for (int i = 0; i < selectList().size(); i++) {
			if (selectList().get(i).equals(bNo)) {
				selectList().remove(i);
				result = 1;
			} else {
				result = 0;
			}
		}

		return result;

	}

	public ArrayList<Book> searchBook(String title) {

		ArrayList<Book> searchList = new ArrayList<Book>();

		for (int i = 0; i < selectList().size(); i++) {
			if (selectList().get(i).getTitle().equals(title)) {
				searchList.get(i);
			}
		}

		return searchList;

	}

	public ArrayList<Book> selectList() {
		return bookList;

	}
}
