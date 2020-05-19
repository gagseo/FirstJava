package com.kh.collection.map.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap;
	ArrayList<Book> list = new ArrayList<Book>();

	public BookDao() {
		bookMap = new HashMap<String, Book>();
	}

	public BookDao(HashMap<String, Book> map) {
		bookMap = map;
	}

	public int getLastBookNo() {

		// 리스트 마지막 도서번호 리턴
		// Iterator, keyset()으로
		// 첫 글일 경우 0으로 받아오게끔 BookDao의 getLastBookNo() 내용 구현 할 것!

		// 도서번호 끝자리를 받을 변수
		int bNo;
		String key = null;
		// Map에 들어가 있는 것들 중 마지막 key 값을 가져와야 함
		Set set = bookMap.keySet();
		Iterator it = set.iterator();

		// keySet으로 bookMap의 내용 전체 꺼내기
		while (it.hasNext()) {
			key = String.valueOf(it.next());
		}
		// Iterator를 통해 값이 없을 때까지 돌면서 key값을 가지고 오고, 그걸 valueOf로 String에 담음
		// 전체 꺼낸 것에서 마지막 번호찾기
		// 근데 첫글일 경우, getbNo은 0

		if (key == null) {
			bNo = 0;
			// key 변수에 값이 없으면 null인 상태이므로 0
		} else {
			// bookMap 중 key에 해당하는 키값에서 도서번호만 가지고 와서
			// int형으로 변환
			bNo = Integer.parseInt(bookMap.get(key).getbNo());
			// 하나씩 늘림
			bNo++;

		}

		return bNo;

	}

	public void addBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}

	public Book deleteBook(String key) {

		// keyset()으로 전달받은 도서번호와 일치하는 도서삭제
		// 삭제 한 객체 리턴

		Book deleteBook = null;
		String cKey = "";

		// keySet으로 bookMap의 key 뽑기
		// set으로 iterator 돌려서 매개변수로 받은 key랑 맞는 거 찾기
		Set set = bookMap.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {

			cKey = String.valueOf(it.next());

			// 같은게 있다면 삭제
			if (bookMap.get(key).getbNo().equals(bookMap.get(cKey).getbNo())) {

				bookMap.remove(cKey);
			}
		}

		deleteBook = bookMap.get(cKey);

		return deleteBook;

	}

	public String searchBook(String title) {

		// entryset() 이용해서 전달받은 제목 포함하는
		// bookmap 의 key 값 리턴

		String select = "";

		Set entrySet = bookMap.entrySet();
		Iterator itEntry = entrySet.iterator();

		while (itEntry.hasNext()) {
			Map.Entry<String, Book> entry = (Entry<String, Book>) itEntry.next();
			if (entry.getKey().contains(title)) {
				select = entry.getKey();
			}
		}

		return select;

	}

	public Book selectBook(String key) {

		return bookMap.get(key);

	}

	public HashMap<String, Book> selectAll() {

		return (HashMap<String, Book>) bookMap;

	}

	public ArrayList<Book> sortedBookList() {

		ArrayList<Book> bList = new ArrayList<Book>();

		Set Set = bookMap.entrySet();
		Iterator it = Set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) it.next();

			bList.add((Book) entry.getValue());
		}
		Collections.sort(bList);
		for (int i = 0; i < bList.size(); i++) {
			bList.get(i);
		}

		return bList;

	}
}
