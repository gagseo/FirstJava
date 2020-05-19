package com.kh.collection.map.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.map.model.dao.BookDao;
import com.kh.collection.map.model.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	private BookDao bd;

	public BookManager() {

	}

	public void addBook(Book book) { // ¸·ÈùºÎºÐ

		
		book.setbNo("" + bd.getLastBookNo());
		bd.addBook(book);
	}

	public Book deleteBook(String key) {

		return bd.deleteBook(key);

	}

	public String searchBook(String title) {

		return bd.searchBook(title);
	}

	public HashMap<String, Book> selectAll() {

		return bd.selectAll();

	}

	public Book[] sortedBookList() {
		ArrayList<Book> list = bd.sortedBookList();

		Book[] book = new Book[list.size()];
		for (int i = 0; i < book.length; i++) {
			book[i] = list.get(i);
		}
		return book;

	}

	public void printBookList(Book[] br) {
		for (Book book : br) {
			System.out.println(book);
		}
	}
}
